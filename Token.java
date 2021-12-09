package cl.claro.claroConnect.ws.impl;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;

import cl.claro.claroConnect.exception.NetConfigurationException;
import cl.clarochile.generatetokencudbws.facade.GenerateTokenCUDBService;
import cl.clarochile.generatetokencudbws.facade.Generatetokencudbws;
import cl.clarochile.generatetokencudbws.to.GenerateTokenResponseTO;

public class Token {
	private static final Logger logger =   (Logger) LoggerFactory.getLogger(Token.class);
	
	public String getToken () throws NetConfigurationException {
		
		try {
			GenerateTokenCUDBService tokenws = new GenerateTokenCUDBService();
			GenerateTokenResponseTO response = new GenerateTokenResponseTO();
			Generatetokencudbws getToken = tokenws.getGeneratetokencudbws();
			response = getToken.generatetokencudbws();
			response.getCodeError();
			 if (response.getCodeError() == '0') {
				 response.getMessageError();
				 return response.getToken();
			 }else {
				 response = getToken.generatetokencudbws();
				 response.getCodeError();
				 if (response.getCodeError() == '0') {
					 response.getMessageError();
					 return response.getToken();
				 }
			 }
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
		
	}
}
