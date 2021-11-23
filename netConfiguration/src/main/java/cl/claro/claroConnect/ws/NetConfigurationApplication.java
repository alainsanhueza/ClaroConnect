package cl.claro.claroConnect.ws;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class NetConfigurationApplication extends SpringBootServletInitializer {

	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(NetConfigurationApplication.class);
    }
	
	public static void main(String[] args) {
		SpringApplication.run(NetConfigurationApplication.class, args);
	}

}
