package cl.claro.claroConnect.dao;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;

import cl.claro.claroConnect.exception.NetConfigurationException;
import cl.claro.claroConnect.model.FeatureValue;
import cl.claro.claroConnect.model.FeaturesElement;
import cl.claro.claroConnect.model.NetworkElement;
import cl.claro.claroConnect.model.Plan;
import cl.claro.claroConnect.util.ConfigConexion;
import cl.claro.claroConnect.util.Constant;


public class SearchBDImpl implements SearchBD{
	private static final Logger logger =   (Logger) LoggerFactory.getLogger(SearchBDImpl.class);
	
	@Override
	public ArrayList<FeatureValue> searchFeatureValue(String idPlan) throws NetConfigurationException {
		// TODO Auto-generated method stub
				Connection conn = null;
		        ResultSet rs = null;
		        CallableStatement stmt = null;
		        try {
					
		        	logger.info(Constant.CONECBDD);
		        	
		            conn = ConfigConexion.getConnection();
		            String sql = String.format("SELECT f.fval_value AS VALOR, f.fval_type_value, pf.prid_product_id, fe.feat_type\r\n"
		            		+ "FROM tb_cconnect_feature_value f, tb_cconnect_product_id_feature pf, tb_cconnect_plan p, tb_cconnect_feature_service fs,\r\n"
		            		+ "tb_cconnect_feature fe\r\n"
		            		+ "where  p.PLAN_ID = '" + idPlan +"'\r\n"
		            		+ "AND fs.plan_id = p.PLAN_ID\r\n"
		            		+ "AND fs.feature_value_id = f.fval_id\r\n"
		            		+ "and fs.feature_id = fe.feat_id\r\n"
		            		+ "and f.feature_id = fe.feat_id\r\n"
		            		+ "AND pf.feature_id = fe.feat_id;");
		            logger.info(sql);
		            
		            PreparedStatement preparedStatement = conn.prepareStatement(sql);
		            rs = preparedStatement.executeQuery();
		            logger.info(rs);
		            if (rs.next()) {
		            	Plan planBD = new Plan();
		            	planBD.setCod_plan(rs.getString(0));
		            	planBD.setDesc_plan(rs.getString(1));
		                
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

	@Override
	public ArrayList<NetworkElement> searchOrder(String services) throws NetConfigurationException {
		// TODO Auto-generated method stub
				Connection conn = null;
		        ResultSet rs = null;
		        CallableStatement stmt = null;
		        try {
					
		        	logger.info(Constant.CONECBDD);
		        	
		            conn = ConfigConexion.getConnection();
		            String sql = String.format("select tb_cconnect_order.ordr_id, tb_cconnect_order.ordr_description, tb_cconnect_order.ordr_priority, tb_cconnect_order.ordr_action, tb_cconnect_network_element.nete_description\r\n"
		            		+ "from tb_cconnect_order, tb_cconnect_network_element\r\n"
		            		+ "where ordr_description = '"+ services +"'\r\n"
		            		+ "AND tb_cconnect_order.nete_id = tb_cconnect_network_element.nete_id;");
		            
		            PreparedStatement preparedStatement = conn.prepareStatement(sql);
		            rs = preparedStatement.executeQuery();
		            
		            if (rs.next()) {
		            	Plan planBD = new Plan();
		            	planBD.setCod_plan(rs.getString(0));
		            	planBD.setDesc_plan(rs.getString(1));
		                
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

	@Override
	public ArrayList<FeaturesElement> searchGPRApn(String idPlan) throws NetConfigurationException {
		// TODO Auto-generated method stub
				Connection conn = null;
		        ResultSet rs = null;
		        CallableStatement stmt = null;
		        try {
					
		        	logger.info(Constant.CONECBDD);
		        	
		            conn = ConfigConexion.getConnection();
		            String sql = String.format("SELECT cp.CPLX_SUB_FEATURE , cp.CPLX_VALOR_SUB_FEATURE \r\n"
		            		+ "FROM tb_cconnect_feature_value F, tb_cconnect_cplx_plan cp , tb_cconnect_plan p,\r\n"
		            		+ "tb_cconnect_feature_service fs, tb_cconnect_product_id_feature pf, tb_cconnect_feature fe,\r\n"
		            		+ "tb_cconnect_service s\r\n"
		            		+ "WHERE p.PLAN_ID = '" + idPlan + "'\r\n"
		            		+ "AND fs.plan_id = p.PLAN_ID\r\n"
		            		+ "AND fs.feature_value_id = f.fval_id\r\n"
		            		+ "and fs.feature_id = fe.feat_id\r\n"
		            		+ "and fe.service_id = s.serv_id\r\n"
		            		+ "and s.plan_id = p.plan_id\r\n"
		            		+ "and pf.feature_id = fe.feat_id;");
		            
		            PreparedStatement preparedStatement = conn.prepareStatement(sql);
		            rs = preparedStatement.executeQuery();
		            
		            if (rs.next()) {
		            	Plan planBD = new Plan();
		            	planBD.setCod_plan(rs.getString(0));
		            	planBD.setDesc_plan(rs.getString(1));
		                
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
