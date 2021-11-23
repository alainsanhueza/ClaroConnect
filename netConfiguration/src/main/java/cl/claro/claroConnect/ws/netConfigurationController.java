package cl.claro.claroConnect.ws;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.claro.claroConnect.to.Request;
import cl.claro.claroConnect.to.Response;

@RestController
@RequestMapping("/setNetConfiguration")
public class netConfigurationController {
	
	@PostMapping
	public Response set(@RequestBody Request request) {
		System.out.println(request);
		return new Response (0,"success",1234) ;
	}
}

