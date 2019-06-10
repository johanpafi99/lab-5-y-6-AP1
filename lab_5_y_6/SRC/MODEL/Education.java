package MODEL;

public abstract class Education extends ServiceCompany implements Taxable{
	private String registry;
	private int accreditedYears;
	private String rectorName;
	private int studentsStratum;
	private int students;
	/**
	* Desciption : This is the constructor method
	* @param registry : Number of registry
	* @param accreditedYears : Number of years that have the accredited
	* @param rectorName : Name of the rector
	* @param studentsStratum : Stratum of the student
	* @param students : Number of students
	* @param name : Name of the company
	* @param nit : Nit of the company
	* @param address : Address of the company
	* @param phone  Phone of the company
	* @param employee : NUmber of employes in the company
	* @param valueAseetss : Value aseetss of the company
	* @param constitutionDate : Date of constitution
	* @param legalRepresentative : Legal representative of the company
	* @param type : Kind of the company
	*/
	public Education(String name, String nit, String address, int phone, int employee, double valueAseets, String constitutionDate,  String legalRepresentative, String type, String types, String registry, int accreditedYears, String rectorName, int studentsStratum, int students){
		super( name,  nit,  address,  phone,  employee,  valueAseets,  constitutionDate,   legalRepresentative,  type,  types);
		this.registry = registry;
		this.accreditedYears = accreditedYears;
		this.rectorName = rectorName;
		this.studentsStratum = studentsStratum;
		this.students = students;
	}
	public String getRegistry(){
		return registry;
	}
	public void setRegistry(String registry){
		this.registry = registry;
	}
	public int getAccreditedYears(){
		return accreditedYears;
	}
	public void setAccreditedYears(int accreditedYears){
		this.accreditedYears = accreditedYears;
	}
	public String getRectorName(){
		return rectorName;
	}
	public void setRectorName(String rectorName){
		this.rectorName = rectorName;
	}
	public int getStudentsStratum(){
		return studentsStratum;
	}
	public void setStudentsStratum(int studentsStratum){
		this.studentsStratum = studentsStratum;
	}
	public int students(){
	return students;
	}
	public void students(int students){
		this.students = students;
	}
	/**
	* Description : This method allow do the calculation of the taxeble price
	* @param studentsStratum : Stratum of the students
	* @ param students : number of students of the school
	* @return : pro
	*/
	public double calctTaxeble(){
		double pro = 0.0;
		double nivelpro = 20-((studentsStratum/students)*100);
		if(nivelpro < 0){

		}else if(nivelpro> 0){
			pro = nivelpro;
		}
		return pro;
	}
	public String toString(){
		String message = super.toString();
		       message += "+-------------------------------------------------------------------------------------------------------------+\n";
			   message += "| ************* EDUCATIONAL ENTERPRISE INFORMATION************* +\n";
			   message += "+-------------------------------------------------------------------------------------------------------------+\n";
			   message += "|\n";
			   message += "| Registry "+registry+"\n";
			   message += "| Years of accreditation: "+accreditedYears+"\n";
			   message += "| Name of the rector: "+rectorName+"\n";
			   message += "| Students in stratum 1 and 2: "+studentsStratum+"\n";
			   message += "| Total students: "+students+"\n";
			   message += "|The proculture tax is: " + calctTaxeble() + "\n";
		return message;
	}

}
