package cl.claro.claroConnect.to;

public class Request {
	
	private String imsi;
	private String msisdn;
	private String plan;
	private String productID;
	private String imsi2;
	private String msisdn2;
	private String plan2;
	private String servicio;
	
	
	public String getServicio() {
		return servicio;
	}
	public void setServicio(String servicio) {
		this.servicio = servicio;
	}
	public String getImsi() {
		return imsi;
	}
	public void setImsi(String imsi) {
		this.imsi = imsi;
	}
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getPlan() {
		return plan;
	}
	public void setPlan(String plan) {
		this.plan = plan;
	}
	public String getProductID() {
		return productID;
	}
	public void setProductID(String productID) {
		this.productID = productID;
	}
	public String getImsi2() {
		return imsi2;
	}
	public void setImsi2(String imsi2) {
		this.imsi2 = imsi2;
	}
	public String getMsisdn2() {
		return msisdn2;
	}
	public void setMsisdn2(String msisdn2) {
		this.msisdn2 = msisdn2;
	}
	public String getPlan2() {
		return plan2;
	}
	public void setPlan2(String plan2) {
		this.plan2 = plan2;
	}
	public Request(String imsi, String msisdn, String plan, String productID, String imsi2, String msisdn2,
			String plan2, String servicio) {
		super();
		this.imsi = imsi;
		this.msisdn = msisdn;
		this.plan = plan;
		this.productID = productID;
		this.imsi2 = imsi2;
		this.msisdn2 = msisdn2;
		this.plan2 = plan2;
		this.servicio = servicio;
	}
	
	
	

	
	
	

}
