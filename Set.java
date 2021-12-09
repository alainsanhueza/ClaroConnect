package cl.claro.claroConnect.hlr;

import java.util.ArrayList;

import javax.xml.rpc.holders.StringHolder;
import javax.xml.soap.SOAPException;

import org.apache.axis.AxisFault;
import org.apache.axis.message.MessageElement;
import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;

import com.ericsson.schemas.cai3g1_2.AnyMOIdType;
import com.ericsson.schemas.cai3g1_2.Cai3GImplPortBindingStub;
import com.ericsson.schemas.cai3g1_2.SetMODefinition;
import com.ericsson.schemas.cai3g1_2.holders.SetResponseHolder;

import cl.claro.claroConnect.dao.SearchBDImpl;
import cl.claro.claroConnect.exception.NetConfigurationException;
import cl.claro.claroConnect.model.FeaturesElement;
import cl.claro.claroConnect.util.Constant;

public class Set {
	private static final Logger logger =   (Logger) LoggerFactory.getLogger(Set.class);
	
	public String set (ArrayList<FeaturesElement> featureElemList, String msisdn)throws NetConfigurationException{
		logger.info("inicio SET");
		try {
			Cai3GImplPortBindingStub cai3g = new Cai3GImplPortBindingStub();
			//intancia del servicio token
			Token obtenerToken = new Token();
			// set sessionID
			StringHolder sessionId = new StringHolder(obtenerToken.getToken());
			// set MOtype
			String mOType = Constant.SUBSCRIPTION;

			//set MOid
			AnyMOIdType mOId = new AnyMOIdType();
			
			MessageElement[] msgElementArr = new MessageElement[0];
			MessageElement msgElement = new MessageElement();
			msgElement.setAttribute(Constant.GSM_MSISDN, msisdn);
			msgElementArr[0].addChild(msgElement);
			mOId.set_any(msgElementArr);
			// set moAttributes
			SetMODefinition mOAttributes = new SetMODefinition();
			MessageElement[] msgEleAtrrArr = new MessageElement[1];
			msgEleAtrrArr[0].setAttribute(Constant.GSM_MSISDN, msisdn);
						
			// Ejemplo para datos
			
			if (featureElemList.isEmpty()) {
				//error
			}else {
				for (int i=0;i<featureElemList.size();i++) {
					if (featureElemList.get(i).getSubFeature() == "prov") {
						// HRL DATOS
					}else if (featureElemList.get(i).getSubFeature() == "pdpid") {
			   				if(featureElemList.size()>1) {
			   			if (tag == "nam") {
			   				}else if(tag == "pdpid")
			   				}
			   				}
								// hrl APN ADD								
							}else (featureElementList.get(i).getSubFeature( == "apnid") {
								if(featureElemenList.size()>1 {
									if(featureElementList.get(i).getSubFeature() == "eqosid"]) {
										if(featureElemenList.size()>1 {
									}
								}
								// hrl APN DEL
							
								}else (featureElementList.get(i).getSubFeature( == "pdpid") {
									
								}
 
					}else { //VOICE_MO, VOICE_MT, SMS_MO, SMS_MT, ROAMING
						MessageElement msgAtrrElement = new MessageElement();
						msgAtrrElement.setAttribute(featureElemList.get(i).getSubFeature(), featureElemList.get(i).getValueSubFeature());
						msgEleAtrrArr[0].addChild(msgAtrrElement);
						mOAttributes.set_any(msgEleAtrrArr);
					}
				}
			}
			
			
			//set parameters
			SetResponseHolder parameters = new SetResponseHolder ();
			// llamado al SET CAI3G HLR
			cai3g.set(parameters, sessionId, null, null, null, mOType, mOId, mOAttributes, null);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// set bd log
			// validar n° reintento <=3
			// reintento
		}
		
		return "ok";		
	}
	
	public String create (String tag, String valor)throws NetConfigurationException{
		
		return valor;		
	}
	
	public String delete (String tag, String valor)throws NetConfigurationException{
		
		return valor;		
	}
}
