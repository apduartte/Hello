package br.com.apduartte.hello.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {
	
	@GetMapping("/teste")
	public String digaOla() {
		return "Vamos colocar o DevTools para funcionar...";
	}

}
