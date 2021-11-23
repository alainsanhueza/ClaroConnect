package cl.claro.claroConnect.to;

public class Action {
	
	private String action;
	private String typeService;
	private String feature;
	private String value;
	
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getTypeService() {
		return typeService;
	}
	public void setTypeService(String typeService) {
		this.typeService = typeService;
	}
	public String getFeature() {
		return feature;
	}
	public void setFeature(String feature) {
		this.feature = feature;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	public Action(String action, String typeService, String feature, String value) {
		super();
		this.action = action;
		this.typeService = typeService;
		this.feature = feature;
		this.value = value;
	}

	
}
