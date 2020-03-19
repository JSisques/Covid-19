import java.util.List;

public class Prueba {
	
public static void main(String[] args) {
	Scraping s = new Scraping();
	List<Dato> datos = s.sacarDatos();
	
	for (Dato dato : datos) {
		System.out.println(dato.toString());
	}
}

}
