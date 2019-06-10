package MODEL;
import java.util.ArrayList;

public class PublicService extends ServiceCompany implements Taxable{

	public static final int SEWERAGE = 1;
	public static final int ENERGY = 2;
	public static final int AQUEDUCT = 3;

	private int typeService;
	private int subscribers;
	private int subscribersStratum;
	/**
	* Description : This is the constructor method
	* @param typeService : This is the type of service that the company promove
	* @param subscribers : This is the number of subscribers that the company have
	* @param subscribersStratum : This is the stratum of every subscriber of the company
	*/
	public PublicService(String name, String nit, String address, int phone, int employee, double value, String constitutionDate,  String legalRepresentative, String type, String types, int typeService, int subscribers, int subscribersStratum){
		super(name, nit, address, phone, employee, value, constitutionDate, legalRepresentative, type, types);
		this.typeService=typeService;
		this.subscribers=subscribers;
		this.subscribersStratum=subscribersStratum;
	}
	/**
	* Description : This method allow do the calculation of the taxeble price
	* @param subscribersStratum : Stratum of the subscribers
	* @param subscribers : number of subscribers of the company
	* @return : pro
	*/
	public double calctTaxeble(){
		double pro = 0.0;
		double nivelpro = 20-((subscribersStratum/subscribers)*100);
		if(nivelpro < 0){

		}else if(nivelpro> 0){
			pro = nivelpro;
		}
		return pro;
	}
	public String toString(){
		String message = "";
		message += "-------------------------------------------------------------------";
		message += "----------INFORMACION DE LA EMPRESA DE SERVICIOS PUBLICOS----------";
		message += "-------------------------------------------------------------------";
		message += "El tipo de servicio que se presta es "+typeService+"\n";
		message += "Suscriptores de estrato 1 y 2"+subscribersStratum+"\n";
		message += "Total de suscriptores "+subscribers+"\n";
		message += "The proculture tax is: " + calctTaxeble() + "% \n";
		return message;
	}
}
