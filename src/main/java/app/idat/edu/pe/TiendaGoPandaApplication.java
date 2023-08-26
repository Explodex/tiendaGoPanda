package app.idat.edu.pe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
public class TiendaGoPandaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaGoPandaApplication.class, args);
	}

}
