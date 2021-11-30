package cl.claro.claroConnect.ws;



import org.apache.axis.message.MessageElement;

import java.rmi.RemoteException;


import javax.xml.rpc.holders.StringHolder;
import javax.xml.soap.SOAPException;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ericsson.schemas.cai3g1_2.AnyMOIdType;
import com.ericsson.schemas.cai3g1_2.Cai3GImplPortBindingStub;
import com.ericsson.schemas.cai3g1_2.Create;
import com.ericsson.schemas.cai3g1_2.CreateMODefinition;
import com.ericsson.schemas.cai3g1_2.CreateResponse;

import cl.claro.claroConnect.to.Request;
import cl.claro.claroConnect.to.Response;
import cl.claro.claroConnect.util.Constant;
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
		Generatetokencudbws asdsa = tokenws.getGeneratetokencudbws();
		//response = asdsa.generatetokencudbws();
		//response.getCodeError();
		//response.getMessageError();
		
		//System.out.println(response.getToken());
		
		try {
			Cai3GImplPortBindingStub cai3g = new Cai3GImplPortBindingStub();
			CreateResponse responseCai3g = new CreateResponse();
			Create parameter = new Create();
			
			parameter.setMOType("Subscription@http://schemas.ericsson.com/ema/UserProvisioning/GsmHlr/");
			//Set MOId
			AnyMOIdType anyMOdType = new AnyMOIdType();
			MessageElement[] newEleMOID = new MessageElement[1];
			MessageElement msgMOID = new  MessageElement();
			msgMOID.setAttribute(Constant.GSM_MSISDN, request.getMsisdn());				newEleMOID[0].addChild(msgMOID); 
			msgMOID.setAttribute(Constant.GSM_IMSI, request.getImsi());
			newEleMOID[1].addChild(msgMOID);	
			anyMOdType.set_any(newEleMOID);	
			parameter.setMOId(anyMOdType);
			
			
			// MOAttributes
			CreateMODefinition mOAttributes = new CreateMODefinition();
			MessageElement[] newEleAtrr = new MessageElement[20];
			
			MessageElement msgAtrr = new  MessageElement();
			
			String atributo = Constant.MSISDN + "="+ request.getMsisdn()+ Constant.IMSI + "=" + request.getImsi();
			newEleAtrr[0].setAttribute(Constant.GSM_SUBSCRIPTION, atributo);	
			msgAtrr.setAttribute(Constant.GSM_MSISDN, request.getMsisdn());
			newEleAtrr[0].addChild(msgAtrr);
			msgAtrr.setAttribute(Constant.GSM_IMSI, request.getImsi());
			newEleAtrr[1].addChild(msgAtrr);
			
			
			//	set Camel
			
			MessageElement[] camelArreglo = new  MessageElement[18];
			MessageElement camel = new MessageElement();
			camel.setAttribute(Constant.GSM_EOINCI, Constant.CODE_STRING_0);
			camelArreglo[0].addChild(camel);
			camel.setAttribute(Constant.GSM_EOICK, Constant.CODE_STRING_0);
			camelArreglo[1].addChild(camel);
			camel.setAttribute(Constant.GSM_ETINCI, Constant.CODE_STRING_0);
			camelArreglo[2].addChild(camel);
			camel.setAttribute(Constant.GSM_ETICK, Constant.CODE_STRING_0);
			camelArreglo[3].addChild(camel);
			camel.setAttribute(Constant.GSM_GCSO, Constant.CODE_STRING_0);
			camelArreglo[4].addChild(camel);
			camel.setAttribute(Constant.GSM_SSLO, Constant.CODE_STRING_0);
			camelArreglo[5].addChild(camel);
			camel.setAttribute(Constant.GSM_MCSO, Constant.CODE_STRING_0);
			camelArreglo[6].addChild(camel);
			camel.setAttribute(Constant.GSM_GC2SO, Constant.CODE_STRING_0);
			camelArreglo[7].addChild(camel);
			camel.setAttribute(Constant.GSM_MC2SO, Constant.CODE_STRING_0);
			camelArreglo[8].addChild(camel);
			camel.setAttribute(Constant.GSM_TIF, Constant.CODE_STRING_0);
			camelArreglo[9].addChild(camel);
			camel.setAttribute(Constant.GSM_GC3SO, Constant.CODE_STRING_0);
			camelArreglo[10].addChild(camel);
			camel.setAttribute(Constant.GSM_MC3SO, Constant.CODE_STRING_0);
			camelArreglo[11].addChild(camel);
			camel.setAttribute(Constant.GSM_GPRSSO, Constant.CODE_STRING_0);
			camelArreglo[12].addChild(camel);
			camel.setAttribute(Constant.GSM_OSMSSO, Constant.CODE_STRING_0);
			camelArreglo[13].addChild(camel);
			camel.setAttribute(Constant.GSM_TSMSSO, Constant.CODE_STRING_0);
			camelArreglo[14].addChild(camel);
			camel.setAttribute(Constant.GSM_MMSO, Constant.CODE_STRING_0);
			camelArreglo[15].addChild(camel);
			camel.setAttribute(Constant.GSM_GC4SO, Constant.CODE_STRING_0);
			camelArreglo[16].addChild(camel);
			camel.setAttribute(Constant.GSM_MC4SO, Constant.CODE_STRING_0);
			camelArreglo[17].addChild(camel);

			newEleAtrr[2].setObjectValue(camelArreglo);
			
			//set gprs
			MessageElement[] gprsArreglo = new  MessageElement[2];
			MessageElement msgGprs = new MessageElement();
			gprsArreglo[0].setAttribute(Constant.GSM_PDPID, Constant.CODE_STRING_1);
			msgGprs.setAttribute(Constant.GSM_PDPID, Constant.CODE_STRING_1);
			gprsArreglo[0].addChild(msgGprs);
			msgGprs.setAttribute(Constant.GSM_APNID, Constant.CODE_STRING_3);
			gprsArreglo[1].addChild(msgGprs);
			msgGprs.setAttribute(Constant.GSM_EQOSID, Constant.CODE_STRING_38);
			gprsArreglo[2].addChild(msgGprs);
			
			newEleAtrr[3].setObjectValue(gprsArreglo);
			//set nam
			MessageElement[] namArreglo = new  MessageElement[0];
			MessageElement msgNam = new MessageElement();
			msgNam.setAttribute(Constant.GSM_PROV, Constant.CODE_STRING_0);
			namArreglo[0].addChild(msgNam);
			
			newEleAtrr[4].setObjectValue(namArreglo);
			
			msgAtrr.setAttribute(Constant.GSM_OBO, Constant.CODE_STRING_0);	
			newEleAtrr[5].addChild(msgAtrr);
			msgAtrr.setAttribute(Constant.GSM_OBI, Constant.CODE_STRING_0);	
			newEleAtrr[6].addChild(msgAtrr);
			msgAtrr.setAttribute(Constant.GSM_CAT, Constant.CODE_STRING_10);	
			newEleAtrr[7].addChild(msgAtrr);
			msgAtrr.setAttribute(Constant.GSM_CLIP, Constant.CODE_STRING_1);	
			newEleAtrr[8].addChild(msgAtrr);
			msgAtrr.setAttribute(Constant.GSM_DBSG, Constant.CODE_STRING_1);	
			newEleAtrr[9].addChild(msgAtrr);
			msgAtrr.setAttribute(Constant.GSM_HOLD, Constant.CODE_STRING_1);	
			newEleAtrr[10].addChild(msgAtrr);
			msgAtrr.setAttribute(Constant.GSM_MPTY, Constant.CODE_STRING_1);	
			newEleAtrr[11].addChild(msgAtrr);
			msgAtrr.setAttribute(Constant.GSM_OFA, Constant.CODE_STRING_1);	
			newEleAtrr[12].addChild(msgAtrr);
			msgAtrr.setAttribute(Constant.GSM_PWD, Constant.CODE_STRING_0000);	
			newEleAtrr[13].addChild(msgAtrr);
			msgAtrr.setAttribute(Constant.GSM_SOCFB, Constant.CODE_STRING_0);	
			newEleAtrr[14].addChild(msgAtrr);
			msgAtrr.setAttribute(Constant.GSM_SOCFRY, Constant.CODE_STRING_0);	
			newEleAtrr[15].addChild(msgAtrr);
			msgAtrr.setAttribute(Constant.GSM_SOCLIP, Constant.CODE_STRING_1);	
			newEleAtrr[16].addChild(msgAtrr);
			msgAtrr.setAttribute(Constant.GSM_TS11, Constant.CODE_STRING_1);	
			newEleAtrr[17].addChild(msgAtrr);
			msgAtrr.setAttribute(Constant.GSM_TS21, Constant.CODE_STRING_0);	
			newEleAtrr[18].addChild(msgAtrr);
			msgAtrr.setAttribute(Constant.GSM_TS22, Constant.CODE_STRING_1);	
			newEleAtrr[19].addChild(msgAtrr);
			msgAtrr.setAttribute(Constant.GSM_SCHAR, Constant.CODE_STRING_8_0);	
			newEleAtrr[20].addChild(msgAtrr);

						
			mOAttributes.set_any(newEleAtrr);
			parameter.setMOAttributes(mOAttributes);
			
			
			
			// set sessionId
			StringHolder sessionId = new StringHolder(response.getToken());
			// llamado al servicio
			responseCai3g = cai3g.create(parameter, sessionId, null, null, null);
			//validacion Respuesta
			
		} catch (RemoteException | SOAPException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return new Response (200,e.getMessage(),1234) ;
		}
		
		
		
		return new Response (0,"success",1234) ;
	}
}

