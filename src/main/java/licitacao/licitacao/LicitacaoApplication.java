package licitacao.licitacao;

import org.springframework.web.filter.CorsFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@SpringBootApplication
public class LicitacaoApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(LicitacaoApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("123"));
	}
	
	@Bean
	public CorsFilter corsFilter() {
		 final UrlBasedCorsConfigurationSource source =  new UrlBasedCorsConfigurationSource();
		 final CorsConfiguration config = new CorsConfiguration();
		 config.setAllowCredentials(true);
		 config.addAllowedHeader("*");
		 config.addAllowedOrigin("*");
		 config.addAllowedMethod("OPTIONS");
		 config.addAllowedMethod("POST");
		 config.addAllowedMethod("GET");
		 config.addAllowedMethod("PUT");
		 config.addAllowedMethod("DELETE");
		 source.registerCorsConfiguration("/**", config);
		 
		 return new CorsFilter((CorsConfigurationSource) source);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(LicitacaoApplication.class);
	}

}
