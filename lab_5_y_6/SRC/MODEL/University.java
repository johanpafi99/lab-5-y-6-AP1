package MODEL;

public class University extends Education{
	private int knowPro;
	/**
	* Description : This is the constructor method
	* @param knowPro : This is the know of the university
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
	public University(String name, String nit, String address, int phone, int employee, double valueAseets, String constitutionDate,  String legalRepresentative, String type, String types, String registry, int accreditedYears, String rectorName, int studentsStratum, int students, int knowPro){
		super( name, nit, address, phone, employee, valueAseets, constitutionDate, legalRepresentative, type, types, registry, accreditedYears, rectorName, studentsStratum, students);
		this.knowPro = knowPro;
	}
	public int getKnowPro(){
		return knowPro;
	}
	public void setKnowPro(int knowPro){
		this.knowPro = knowPro;
	}

}
