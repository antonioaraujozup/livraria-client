package br.com.zup.edu.livrariaclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LivrariaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(LivrariaClientApplication.class, args);
	}

}
