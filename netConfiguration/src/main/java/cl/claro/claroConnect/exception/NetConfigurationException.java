package cl.claro.claroConnect.exception;

import java.io.Serializable;

public class NetConfigurationException extends Exception implements Serializable {
	
	  public NetConfigurationException(String message) {
	      super(message);
	  }

	  public NetConfigurationException(String message, Throwable cause) {
	      super(message, cause);
	  }
}
