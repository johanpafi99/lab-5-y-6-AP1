package MODEL;
public abstract class Company extends LegalPerson{

	private String types;

	/**
	* Description: This is the constructor method.
	* @param The name of the company registered <br> whit the chamber of commerce.
	* @param the nit assigned to the company.
	* @param The correspondence address.
	* @param The contact phone.
	* @param The number of employees.
	* @param The value in pesos of the assets.
	* @param the date of incorporation.
	* @param The name of the legal representative
	* @param The type of the company.
	*/
	public Company(String name, String nit, String address, int phone, int employee, double valueAseets, String constitutionDate,  String legalRepresentative, String type, String types){
		super(name, nit, address, phone, employee, valueAseets, constitutionDate, legalRepresentative, type);
		this.types = types;
	}
	public String getTypes(){
		return types;
	}
	public void setTypes(String types){
		this.types = types;
	}
}
