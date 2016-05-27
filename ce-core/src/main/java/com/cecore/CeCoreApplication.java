package com.cecore;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CeCoreApplication {
	
	@RequestMapping("/")
	public Map<Integer, Integer> getNotas(){
		Map<Integer, Integer> notas = new HashMap<Integer, Integer>();
		notas.put(10, 1);
		notas.put(20, 2);
		return notas;
		
	}

	public static void main(String[] args) {
		SpringApplication.run(CeCoreApplication.class, args);
	}
}
