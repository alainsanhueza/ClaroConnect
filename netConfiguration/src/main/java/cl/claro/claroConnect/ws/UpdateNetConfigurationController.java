package cl.claro.claroConnect.ws;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.claro.claroConnect.to.RequestUpd;
import cl.claro.claroConnect.to.Response;


@RestController
@RequestMapping("/updNetConfiguration")
public class UpdateNetConfigurationController {
	
	@PutMapping
	public Response update(@RequestBody RequestUpd request) {
		return new Response (0,"success",12345) ;
	}

}
