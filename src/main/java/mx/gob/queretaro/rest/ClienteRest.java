package mx.gob.queretaro.rest;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("cliente")
public class ClienteRest {

	@GetMapping(path ="saludo", produces = MediaType.APPLICATION_JSON_VALUE)

	public String hello() {
		return "Hola mundo desde un Reset";
	}
	@GetMapping("saludo2" )
	public String hello2() {
		return "Hola";
	}
}
