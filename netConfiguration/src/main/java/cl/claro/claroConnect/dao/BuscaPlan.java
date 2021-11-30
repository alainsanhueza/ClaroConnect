package cl.claro.claroConnect.dao;

import cl.claro.claroConnect.exception.NetConfigurationException;
import cl.claro.claroConnect.model.Plan;


public interface BuscaPlan {
	public Plan planXCodPlan (String descplan) throws NetConfigurationException;
	public String serviciosxcod (String nombreServicio) throws NetConfigurationException;
}
