package cl.claro.claroConnect.to;

public class Response {

	private int resultCode;
	private String message;
	private int codTrx;
	
	
	public Response(int resultCode, String message, int codTrx) {
		super();
		this.resultCode = resultCode;
		this.message = message;
		this.codTrx = codTrx;
	}
	
	public int getResultCode() {
		return resultCode;
	}
	public void setResultCode(int resultCode) {
		this.resultCode = resultCode;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getCodTrx() {
		return codTrx;
	}
	public void setCodTrx(int codTrx) {
		this.codTrx = codTrx;
	}
	
	
	
}
