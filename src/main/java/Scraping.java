import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class Scraping {

	private final static String URL = "https://github.com/canghailan/Wuhan-2019-nCoV/tree/master/ReportData";

	public static List<Dato> sacarDatos() {
		List<Dato> listadoDatos = new ArrayList<Dato>();

		Document document;
		try {
			document = Jsoup.connect(URL).get();
			Elements enlaces = document.getElementsByClass("js-navigation-open");

			for (Element element : enlaces) {
				String enlaceTexto = element.attr("href");
				if (!enlaceTexto.contains("%") && enlaceTexto.contains(".")) {
					document = Jsoup.connect("https://github.com/" + element.attr("href")).get();
					
					System.out.println("https://github.com/" + element.attr("href"));
					Elements filas = document.select("tr");

					if (filas.size() > 0) {
						for (Element f : filas) {
							
							Elements celdas = f.select("td");
							
							for (int i = 1; i < celdas.size(); i += 13) {
								String date = celdas.get(i).text();
								System.out.println(date);
								String countryCode = celdas.get(i + 2).text();
								System.out.println(countryCode);
								String confirmed = celdas.get(i + 7).text();
								System.out.println(confirmed);
								String suspected = celdas.get(i + 8).text();
								System.out.println(suspected);
								String cured = celdas.get(i + 9).text();
								System.out.println(cured);
								String dead = celdas.get(i + 10).text();
								System.out.println(dead);
								
								listadoDatos.add(new Dato(date, countryCode, confirmed, suspected, cured, dead));
							}
						}
					}
				}
			}
		} catch (IOException e) {

			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		for (Dato dato : listadoDatos) {
			System.out.println(dato.toString());
		}
		return listadoDatos;
	}

}
