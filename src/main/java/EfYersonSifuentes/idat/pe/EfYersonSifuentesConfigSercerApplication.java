package EfYersonSifuentes.idat.pe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class EfYersonSifuentesConfigSercerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EfYersonSifuentesConfigSercerApplication.class, args);
	}

}
