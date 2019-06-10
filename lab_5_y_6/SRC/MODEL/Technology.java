package MODEL;
import java.util.ArrayList;

public class Technology extends Company implements Consumable{

	public static final char CONSULTANCY = 'C';
	public static final char TRAINING = 'T';
	public static final char DEVELOPMENT = 'D';
	public static final char INFRASTRUCTURE = 'I';
	public static final char SOFTWARE = 'S';
	public static final char PLATAFORM = 'P';

	private ArrayList< Character> services;
	private int energy;
	/**
	* Description : This is the constructor method
	* @param energy : This is the consume energy of the company
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
	public Technology(String name, String nit, String address, int phone, int employee, double valueAseets, String constitutionDate,  String legalRepresentative, String type, String types, int energy){
		super( name, nit, address, phone, employee, valueAseets, constitutionDate, legalRepresentative,  type,  types);
		this.energy=energy;
		services=new ArrayList<>();
	}

	public int getEnergy(){
		return energy;
	}
	public void setEnergy(int energy){
		this.energy=energy;
	}
	public ArrayList<Character> getServices(){
		return services;
	}
	/**
	* Description : This method allow calculated the number of trees that the company have to planted
	* @return Number of trees that company have to planted
	*/

	public int numberTreesPlanted(){
		int trees = 0;

		if(energy>= 1 && energy<= 1000){
			trees = 8;
		}else if(energy>= 1001 && energy<= 3000){
			trees = 55;
		}else if(energy>3000){
			trees = 500;
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
