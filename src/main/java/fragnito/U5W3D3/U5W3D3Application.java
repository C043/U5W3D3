package fragnito.U5W3D3;

import fragnito.U5W3D3.Adapter.Adapter;
import fragnito.U5W3D3.Adapter.Info;
import fragnito.U5W3D3.Adapter.UserData;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

@SpringBootApplication
public class U5W3D3Application {

	public static void main(String[] args) {
		SpringApplication.run(U5W3D3Application.class, args);
		Info info = new Info("Aldo", "Baglio", Date.from(LocalDate.of(2018, Month.NOVEMBER, 27).atStartOfDay(ZoneId.systemDefault()).toInstant()));
		Adapter ds = new Adapter(info);
		UserData us = new UserData();

		us.getData(ds);

		System.out.println(us);
	}

}
