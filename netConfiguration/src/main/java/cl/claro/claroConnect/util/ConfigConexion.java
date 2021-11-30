package cl.claro.claroConnect.util;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;

public class ConfigConexion {
	private static final Logger logger =   (Logger) LoggerFactory.getLogger(ConfigConexion.class);
	
    private ConfigConexion() {
      throw new IllegalStateException("Utility class");
    }
    
    public static Connection getConnection() {
       DataSource dataSource = null;
       Connection connection = null;
       Context context = null;
  
       try {
           context = new InitialContext();
           
           dataSource = (DataSource)context.lookup(Constant.DATASOURCE);
           
           connection = dataSource.getConnection();
       } catch (NamingException ne) {
           //Error al obtener el contexto de la aplicación
           logger.error(Constant.GET_CONNECTION_NAMING_EXCEPTION_MSG + 
                        ne.getMessage(), ne);
       } catch (SQLException sqle) {
           //Error al obtener la conexión desde el datasource
           logger.error(Constant.GET_CONNECTION_SQL_EXCEPTION_MSG + 
                        sqle.getMessage(), sqle);
       }
      return connection;
    }
    
    public static void closeResultSet(ResultSet resultSet) {
            if(resultSet != null) {
                try {
                    resultSet.close();
                } catch (SQLException sqle) {
                    // Error al cerrar el resultset
                    logger.error(Constant.CLOSE_RESULTSET_EXCEPTION_MSG + 
                                 sqle.getMessage(), sqle);
                }
            }
        }
        
        public static void closeCallableStatement(CallableStatement callableStatement) {
            if(callableStatement != null) {
                try {
                    callableStatement.close();
                } catch (SQLException sqle) {
                    // Error al cerrar el callableStatement
                    logger.error(Constant.CLOSE_CALLABLESTATEMENT_EXCEPTION_MSG + 
                                 sqle.getMessage(), sqle);
                }
            }
        }
        
        public static void closeConnection(Connection connection) {
            if(connection != null) {
                try {
                    connection.close();
                } catch (SQLException sqle) {
                    // Error al cerrar el connection
                    logger.error(Constant.CLOSE_CONNECTION_EXCEPTION_MSG + 
                                 sqle.getMessage(), sqle);
                }
            }
        }

}
