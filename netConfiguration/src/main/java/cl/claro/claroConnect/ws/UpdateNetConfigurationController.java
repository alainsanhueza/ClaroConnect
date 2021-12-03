package cl.claro.claroConnect.ws;


import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cl.claro.claroConnect.dao.SearchBD;
import cl.claro.claroConnect.dao.SearchBDImpl;
import cl.claro.claroConnect.model.Plan;
import cl.claro.claroConnect.to.RequestUpd;
import cl.claro.claroConnect.to.Response;
import cl.claro.claroConnect.util.Constant;
import cl.claro.claroConnect.util.Util;
import cl.claro.claroConnect.ws.impl.CallHlr;


@RestController
@RequestMapping("/updNetConfiguration")
public class UpdateNetConfigurationController {
	
	@PutMapping
	public Response update(@RequestBody RequestUpd request) {
		try {
			// validacion parametros requeridos
			if(!request.getImsi().isEmpty()) {
				return new Response (Constant.COD_ERROR_PARAMETROS,Constant.ERROR_MISS_PARAMETER,12345) ;
			}else if(!Util.isNumeric(request.getImsi())) {
				return new Response (Constant.COD_ERROR_PARAMETROS,Constant.ERROR_REQUIRED_INVALID_VALUE,12345) ;
			}
			
			if(!request.getMsisdn().isEmpty()) {
				return new Response (Constant.COD_ERROR_PARAMETROS,Constant.ERROR_MISS_PARAMETER,12345) ;
			}else if(!Util.isNumeric(request.getMsisdn())) {
				return new Response (Constant.COD_ERROR_PARAMETROS,Constant.ERROR_REQUIRED_INVALID_VALUE,12345) ;
			}
			
			if(!request.getPlan().isEmpty()) {
				return new Response (Constant.COD_ERROR_PARAMETROS,Constant.ERROR_MISS_PARAMETER,12345) ;
			}
			
			if(!request.getServices().isEmpty()) {
				return new Response (Constant.COD_ERROR_PARAMETROS,Constant.ERROR_MISS_PARAMETER,12345) ;
			}
			
			if(request.getPlan().isEmpty()) {
				/*
				BuscaPlan burcanPlan = new BuscaPlanImpl();
				Plan plan = new Plan();
				plan = burcanPlan.planXCodPlan(request.getPlan());
				
				plan.getCod_plan();
				*/
				
				
				
				return new Response (0,Constant.SUCCESS,12345) ;
			}else {
				return new Response (0,Constant.ERROR_REQUIRED_INVALID_VALUE,12345) ;	
			}
						
			
		} catch (Exception e) {
			// TODO: handle exception
			return new Response (500,Constant.MSG_ERROR_EXCEPTION,12345) ;
		}
	}

}
