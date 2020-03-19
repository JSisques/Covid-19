import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;


public class Scraping {
	

	public static List<Dato> sacarDatos() {
		List<Dato> listadoDatos = new ArrayList<Dato>();

		Document document = Jsoup.connect(url).get();

		Elements titulares = document.getElementsByClass("ue-c-cover-content__headline");
		Elements enlaces = document.getElementsByClass("ue-c-cover-content__link");

		for (int i = 0; i < titulares.size(); i++) {
			String titular = titulares.get(i).text();
			String enlace = enlaces.get(i).attr("href");

			listadoDatos.add(new Dato(titular, enlace));
		}

		return listadoDatos;
	}

}
