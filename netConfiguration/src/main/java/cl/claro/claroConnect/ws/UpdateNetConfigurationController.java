package cl.claro.claroConnect.ws;

import java.util.List;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import cl.claro.claroConnect.to.Action;
import cl.claro.claroConnect.to.Response;


@RestController
@RequestMapping("/updNetConfiguration")
public class UpdateNetConfigurationController {
	
	@PutMapping
	public Response update(@RequestParam ("imsi") String imsi, @RequestParam ("msisdn") String msisdn,@RequestParam ("plan") String plan, @RequestParam ("services") String services, @RequestParam (required = false, name="actionList") List<Action> actionList) {
		return new Response (0,"success",12345) ;
	}

}
