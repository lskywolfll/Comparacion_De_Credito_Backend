package cl.programatufuturo.compararCredito.Comparacion.de.Credito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@EntityScan("cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity")
public class ComparacionDeCreditoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComparacionDeCreditoApplication.class, args);
	}

}
