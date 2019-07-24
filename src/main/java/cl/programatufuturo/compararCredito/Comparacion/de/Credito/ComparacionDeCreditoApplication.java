package cl.programatufuturo.compararCredito.Comparacion.de.Credito;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@EntityScan("cl.programatufuturo.compararCredito.Comparacion.de.Credito.Entity")
public class ComparacionDeCreditoApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComparacionDeCreditoApplication.class, args);
	}
	
	
	 @Bean
	    public WebMvcConfigurer configurer(){
	      return new WebMvcConfigurer(){
	        @Override
	        public void addCorsMappings(CorsRegistry registry) {
	          registry.addMapping("/*")
	              .allowedOrigins("http://localhost:4200");
	        }
	  };
	 }

}
