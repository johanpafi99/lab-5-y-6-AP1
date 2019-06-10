package MODEL;

public class Medication extends ManufacturingCompany implements Consumable{
	private String sanitaryRegistration;
	private boolean state;
	private String expiration;
	private String modality;
	/**
	* Description : This is the constructor method
	* @param sanitary registration : This is the sanitary registration of the company
	* @param state : This is the state of the medication
	* @param expiration : This is the date of expiration of the medication
	* @param modality :This is the modality of the medication
	* @param name : This is the name of the company
	* @param nit : This is the nit of the company
	* @param address : This is the address of the company
	* @param phone : This is the phone of the company
	* @param employee : Number of employeess that the company have
	* @param valueAseets : Value Aseets of the company
	* @param constitutionDate : Date of constituion of the company
	* @param legalRepresentative : Name of the legal representative in the company
	* @param type : This is the kind of companany
	*/
	public Medication(String name, String nit, String address, int phone, int employee, double valueAseets, String constitutionDate,  String legalRepresentative, String type, String types, String sanitaryRegistration, boolean state, String expiration, String modality){
		super( name, nit, address, phone, employee, valueAseets, constitutionDate, legalRepresentative, type, types);
		this.sanitaryRegistration = sanitaryRegistration;
		this.state = state;
		this.expiration = expiration;
		this.modality = modality;
	}
	public String getSanitaryRegistration(){
		return sanitaryRegistration;
	}
	public void setSanitaryRegistration(String sanitaryRegistration){
		this.sanitaryRegistration=sanitaryRegistration;
	}
	public boolean getState(){
		return state;
	}
	public void setState(boolean state){
		this.state=state;
	}
	public String getModality(){
		return modality;
	}
	public void setModality(String modality){
		this.modality=modality;
	}
	public String getExpiration(){
		return expiration;
	}
	public void setExpiration(String expiration){
		this.expiration=expiration;
	}
	/**
	* Description : This method allow calculated the number of trees that the company have to planted
	* @return Number of trees that company have to planted
	*/
	public int numberTreesPlanted(){
		int trees = 0;
		int agua = 0;
		for(int i = 0; i<getProducts().size(); i++){
			agua += getProducts().get(i).getWaterAmount();
		}
		if(agua>= 1 && agua<= 140){
			trees = 6;
		}else if(agua>= 141 && agua<= 800){
			trees = 25;
		}else if(agua>800){
			trees = 200;
		}

		return trees;
	}
	public String toString(){
		String ms = "";
		ms = super.toString();
		ms+= "number of trees planted " + numberTreesPlanted();
		return ms;
	}
}
