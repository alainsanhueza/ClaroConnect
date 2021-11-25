package cl.claro.claroConnect.ws;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.claro.claroConnect.to.Request;
import cl.claro.claroConnect.to.Response;
import cl.clarochile.generatetokencudbws.facade.GenerateTokenCUDBService;
import cl.clarochile.generatetokencudbws.facade.Generatetokencudbws;
import cl.clarochile.generatetokencudbws.to.GenerateTokenResponseTO;


@RestController
@RequestMapping("/setNetConfiguration")
public class netConfigurationController {
	
	@PostMapping
	public Response set(@RequestBody Request request) {
		System.out.println(request);
		
		GenerateTokenCUDBService tokenws = new GenerateTokenCUDBService();
		GenerateTokenResponseTO response = new GenerateTokenResponseTO();
		Generatetokencudbws asdsa = tokenws.getGeneratetokencudbws(null);
		//response = asdsa.generatetokencudbws();
		//response.getCodeError();
		//response.getMessageError();
		
		//System.out.println(response.getToken());
		
		return new Response (0,"success",1234) ;
	}
}

