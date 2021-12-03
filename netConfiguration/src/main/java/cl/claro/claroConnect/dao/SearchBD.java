package cl.claro.claroConnect.dao;

import java.util.ArrayList;

import cl.claro.claroConnect.exception.NetConfigurationException;
import cl.claro.claroConnect.model.FeatureValue;
import cl.claro.claroConnect.model.FeaturesElement;
import cl.claro.claroConnect.model.NetworkElement;


public interface SearchBD {
		
	public ArrayList<FeatureValue> searchFeatureValue (String idPlan) throws NetConfigurationException;
	
	public ArrayList<NetworkElement> searchOrder (String services) throws NetConfigurationException;
	
	public ArrayList<FeaturesElement> searchGPRApn (String idPlan) throws NetConfigurationException;
	
}
