import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class TestScraping {

	@Test
	public void test() {
		
		Scraping s = new Scraping();
		List<Dato> datos = s.sacarDatos();
		
		for (Dato dato : datos) {
			System.out.println(dato.toString());
		}
		
	}

}
