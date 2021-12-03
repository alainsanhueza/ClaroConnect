package cl.claro.claroConnect.util;

import org.apache.logging.log4j.message.Message;

public class Constant {

	Constant() {
		super();
	}

	public static final String PATH = "./config/appConfig/claroConnect/configuration.properties";



	public static final String EMPTY = "";
	public static final String SPACE = " ";
	public static final String COUNTRY = "CHL";
	

	public static final int CODE_0= 0;
	public static final int CODE_1= 1;
	public static final int CODE_2= 2;
	public static final int CODE_3= 3;
	public static final int CODE_4= 4;
	public static final int CODE_5= 5;
	public static final int CODE_6= 6;
	public static final int CODE_7= 7;
	public static final int CODE_8= 8;
	public static final int CODE_9= 9;
	public static final int CODE_10= 10;
	
	public static final String CODE_STRING_0= "0";
	public static final String CODE_STRING_1= "1";
	public static final String CODE_STRING_3= "3";
	public static final String CODE_STRING_38= "38";
	public static final String CODE_STRING_10 = "10";
	public static final String CODE_STRING_0000 = "0000";
	public static final String CODE_STRING_8_0 = "8-0";
	
	public static final int COD_ERROR_PARAMETROS= 10;
	
	public static final String SUCCESS = "Success";
	public static final String MSG_ERROR_EXCEPTION = "error";
	

	public static final String ERROR_MISS_PARAMETER = "error.miss";
	public static final String ERROR_REQUIRED_INVALID_VALUE = "error.req.parameter";
	public static final String ERROR_INVALID_VALUE = "error.invalid";
	
	public static final String DATASOURCE = "JDBC ClaroConnect";
	public static final String BASE_SQL_EXCEPTION = "SQLException ";
    public static final String GET_CONNECTION_NAMING_EXCEPTION_MSG = "NamingException while obtaning the application Context: ";
    public static final String GET_CONNECTION_SQL_EXCEPTION_MSG = BASE_SQL_EXCEPTION + "while geting the Connection from the DataSource : ";
    public static final String CLOSE_RESULTSET_EXCEPTION_MSG = BASE_SQL_EXCEPTION + "while closing resultset: ";
    public static final String CLOSE_CALLABLESTATEMENT_EXCEPTION_MSG = "SQLException while closing callable statement: ";
    public static final String CLOSE_CONNECTION_EXCEPTION_MSG = BASE_SQL_EXCEPTION + "while closing prepared statement: ";
	

    public static final String IMSI = "Imsi";
    public static final String MSISDN = "msisdn";
    public static final String PLAN = "plan";
    public static final String SERVICES = "services";
    
    public static final String SUBSCRIPTION = "Subscription@http://schemas.ericsson.com/ema/UserProvisioning/GsmHlr/";
    //MOAttributes - camel
    public static final String GSM_SUBSCRIPTION = "gsm:createSubscription";
    public static final String GSM_MSISDN = "gsm:msisdn";
    public static final String GSM_IMSI = "gsm:imsi";
    public static final String GSM_EOINCI = "gsm:eoinci";
    public static final String GSM_EOICK = "gsm:eoick";
    public static final String GSM_ETINCI = "gsm:etinci";
    public static final String GSM_ETICK = "gsm:etick";
    public static final String GSM_GCSO = "gsm:gcso";
    public static final String GSM_SSLO = "gsm:sslo";
    public static final String GSM_MCSO = "gsm:mcso";
    public static final String GSM_GC2SO = "gsm:gc2so";
    public static final String GSM_MC2SO = "gsm:mc2so";
    public static final String GSM_TIF = "gsm:tif";
    public static final String GSM_GC3SO = "gsm:gc3so";
    public static final String GSM_MC3SO = "gsm:mc3so";
    public static final String GSM_GPRSSO = "gsm:gprsso";
    public static final String GSM_OSMSSO = "gsm:osmsso";
    public static final String GSM_TSMSSO = "gsm:tsmsso";
    public static final String GSM_MMSO = "gsm:mmso";
    public static final String GSM_GC4SO = "gsm:gc4so";
    public static final String GSM_MC4SO = "gsm:mc4so";

    public static final String GSM_GPRS = "gsm:gprs";
    public static final String GSM_PDPID = "gsm:pdpid";
    public static final String GSM_APNID = "gsm:apnid";
    public static final String GSM_EQOSID = "gsm:eqosid";

    public static final String GSM_NAM = "gsm:nam";
    public static final String GSM_PROV = "gsm:prov";


    public static final String GSM_OBO = "gsm:obo"; //Voice_MO
    public static final String GSM_OBI = "gsm:obi"; //Voice_MT

    public static final String GSM_CAT = "gsm:cat";
    public static final String GSM_CLIP = "gsm:clip";
    public static final String GSM_DBSG = "gsm:dbsg";
    public static final String GSM_HOLD = "gsm:hold";
    public static final String GSM_MPTY = "gsm:mpty";
    public static final String GSM_OFA = "gsm:ofa";
    public static final String GSM_PWD = "gsm:pwd";
    public static final String GSM_SOCFB = "gsm:socfb";
    public static final String GSM_SOCFRY = "gsm:socfry";
    public static final String GSM_SOCLIP = "gsm:soclip";
    public static final String GSM_TS11 = "gsm:ts11";
    public static final String GSM_TS21 = "gsm:ts21"; // SMS_MT
    public static final String GSM_TS22 = "gsm:ts22"; // SMS_MO
    public static final String GSM_SCHAR = "gsm:schar";
    

    public static final String CONECBDD= "Conectado a BD....";



	



	



	



	
    
    
}

