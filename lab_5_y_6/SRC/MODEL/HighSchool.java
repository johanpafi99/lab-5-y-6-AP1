package MODEL;

public class HighSchool extends Education{
	private int know11;
	/**
	* Description : This is the constructor method
	* @param know1 : This is the know that the school have
	* @param name : This is the name of the company
	* @param nit : This is the nit of the company
	* @param address : This is the address of the company
	* @param phone : This is the phone of the company
	* @param employee : Number of employeess that the company have
	* @param valueAseets : Value Aseets of the company
	* @param constitutionDate : Date of constituion of the company
	* @param legalRepresentative : Name of the legal representative in the company
	* @param type : This is the kind of companany
	* @param know11: This is the position of saber11
	*/
	public HighSchool(String name, String nit, String address, int phone, int employee, double valueAseets, String constitutionDate,  String legalRepresentative, String type, String types, String registry, int accreditedYears, String rectorName, int studentsStratum, int students, int know11){
		super( name, nit, address, phone, employee, valueAseets, constitutionDate, legalRepresentative, type, types, registry, accreditedYears, rectorName, studentsStratum, students);
		this.know11 = know11;
	}
	public int getKnow11(){
		return know11;
	}
	public void setKnow11(int know11){
		this.know11 = know11;
	}
}
