package cl.claro.claroConnect.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;

import cl.claro.claroConnect.exception.NetConfigurationException;
import cl.claro.claroConnect.model.Plan;
import cl.claro.claroConnect.util.ConfigConexion;
import cl.claro.claroConnect.util.Constant;


public class BuscaPlanImpl implements BuscaPlan{
	private static final Logger logger =   (Logger) LoggerFactory.getLogger(BuscaPlanImpl.class);
	
	@Override
	public Plan planXCodPlan(String plan) throws NetConfigurationException {
		// TODO Auto-generated method stub
		Connection conn = null;
        ResultSet rs = null;
        CallableStatement stmt = null;
        try {
			
        	logger.info(Constant.CONECBDD);
        	
            conn = ConfigConexion.getConnection();
            String sql = String.format("SELECT original_task_id FROM %s WHERE task_id = '%s' and state='%s' LIMIT 1");
            
            PreparedStatement preparedStatement = conn.prepareStatement(sql);
            rs = preparedStatement.executeQuery();
            
            if (rs.next()) {
                return new Plan();
              }
            
        } catch (SQLException s) {
            logger.error(s.getMessage(), s);
            throw new NetConfigurationException(s.getMessage());
        }  finally {
            ConfigConexion.closeResultSet(rs);
            ConfigConexion.closeCallableStatement(stmt);
            ConfigConexion.closeConnection(conn);
        }
		
		return null;
	}

}
