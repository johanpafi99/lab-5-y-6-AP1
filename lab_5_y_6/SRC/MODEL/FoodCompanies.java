package MODEL;

public class FoodCompanies extends ManufacturingCompany{
	private int group;
	/**
	* Description : This is the constructor method
	* @param group : This is the group that tha company food have
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
	public FoodCompanies(String name, String nit, String address, int phone, int employee, double valueAseets, String constitutionDate,  String legalRepresentative, String type, String types, int group){
		super(name, nit, address, phone, employee, valueAseets, constitutionDate, legalRepresentative, type,  types);
		this.group = group;
	}
	public int getGroup(){
		return group;
	}
	public void setGroup(int group){
		this.group=group;
	}
}
