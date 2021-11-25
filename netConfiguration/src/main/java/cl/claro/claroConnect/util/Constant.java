package cl.claro.claroConnect.util;

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
	
	public static final String SUCCESS = "Success";
	

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
	

}
