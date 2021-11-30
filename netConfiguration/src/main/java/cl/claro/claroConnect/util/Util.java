package cl.claro.claroConnect.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.Date;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;



/**
 * Clase utilitaria donde se deben incluir metodos de uso comun de validacion
 * y/o de transformacio de tipos de datos
 */
public class Util {
	private static final Logger logger =   (Logger) LoggerFactory.getLogger(Util.class);

    
    /**
     * Valida que una cadena de digitos sea solo numeros
     * @param cadena
     * @return
     */
    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }

    /**
     * Convierte de String a Date ("dd/MM/yyyy")
     * @param fechaString
     * @return Date
     */
    public Date stringToDate(String fechaString) {
        SimpleDateFormat formatoDelTexto = new SimpleDateFormat("dd/MM/yyyy");
        Date fecha = null;
        try {
            fecha = formatoDelTexto.parse(fechaString);
        } catch (ParseException e) {
            logger .error(e.getMessage(), e);
        }
        return fecha;

    }    
    
    /**
     * Comprueba que un nombre no tenga numeros
     * @param cadena
     * @return
     */
    public boolean comprobarNombre(String cadena) {
        Boolean resp = false;
        
        for(int i = 0; i < cadena.length(); i++) {
            if(!Character.isDigit(cadena.charAt(i))) {
                resp =  true;
                break;
            }
        }
        
      return resp;
    }
    
}
