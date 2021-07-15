package com.pjatk.nbp;

import com.pjatk.nbp.config.SpringFoxConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class NbpApplication {
	SpringFoxConfig springFoxConfig;

	public NbpApplication(SpringFoxConfig springFoxConfig) {
		this.springFoxConfig = springFoxConfig;
	}

	public static void main(String[] args) {
		SpringApplication.run(NbpApplication.class, args);
	}

}
