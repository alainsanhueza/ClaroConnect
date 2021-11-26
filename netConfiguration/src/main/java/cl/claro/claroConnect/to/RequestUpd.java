package cl.claro.claroConnect.to;

import java.util.List;

public class RequestUpd {

	private String imsi;	
	private String msisdn;
	private String plan;
	private String services;
	private List<Action> actionList;
	
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
	public String getServices() {
		return services;
	}
	public void setServices(String services) {
		this.services = services;
	}
	public List<Action> getActionList() {
		return actionList;
	}
	public void setActionList(List<Action> actionList) {
		this.actionList = actionList;
	}
	
	public RequestUpd(String imsi, String msisdn, String plan, String services, List<Action> actionList) {
		super();
		this.imsi = imsi;
		this.msisdn = msisdn;
		this.plan = plan;
		this.services = services;
		this.actionList = actionList;
	}
	
	
	
}
