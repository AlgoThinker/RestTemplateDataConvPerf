package com.optimisation.CallerMicroservice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.GsonHttpMessageConverter;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class CallerMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CallerMicroserviceApplication.class, args);
	}

	@Bean
	public RestTemplate getRestTemplate() {
		GsonHttpMessageConverter gsonConverter = new GsonHttpMessageConverter();
		
		List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
		
		messageConverters.add(gsonConverter);
		
		return new RestTemplate(messageConverters);
	}

}
