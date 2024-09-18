package fragnito.U5W3D3;

import com.github.javafaker.Faker;
import fragnito.U5W3D3.Adapter.Adapter;
import fragnito.U5W3D3.Adapter.Info;
import fragnito.U5W3D3.Adapter.UserData;
import fragnito.U5W3D3.Composite.Autore;
import fragnito.U5W3D3.Composite.Libro;
import fragnito.U5W3D3.Composite.Pagina;
import fragnito.U5W3D3.Composite.Sezione;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@SpringBootApplication
public class U5W3D3Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W3D3Application.class, args);
		Info info = new Info("Aldo", "Baglio", Date.from(LocalDate.of(2018, Month.NOVEMBER, 27).atStartOfDay(ZoneId.systemDefault()).toInstant()));
		Adapter ds = new Adapter(info);
		UserData us = new UserData();

		us.getData(ds);

		System.out.println(us);


		Sezione introduzione = new Sezione("Introduzione", randomPages(5));
		Sezione primiCapitoli = new Sezione("Primi capitoli", randomPages(20), List.of(introduzione));
		Libro libro = new Libro("Lezioni di chimica", List.of(new Autore("Bonnie", "Garmus")), 10.5, randomPages(1), List.of(primiCapitoli));

		System.out.println(libro.getText());
		System.out.println("---------------");
		System.out.println(introduzione.getText());
		System.out.println("---------------");
		System.out.println(primiCapitoli.getText());
	}
	public static List<Pagina> randomPages(int num){
		Faker faker = new Faker();
		List<Pagina> pagine = new ArrayList<>();
		for (int i = 0; i < num; i++) {
			Pagina pagina = new Pagina(faker.lorem().characters());
			pagine.add(pagina);
		}
		return pagine;
	}

}
