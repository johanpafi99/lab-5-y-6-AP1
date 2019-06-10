package MODEL;
public class Product{
	private String name;
	private String code;
	private double waterAmount;
	private int units;

	/**
	* Description: This is the constructor method.
	* @param The name of the product.
	* @param the code of the product.
	* @param The amount of water you used.
	* @param The available units of the product.
	*/
	public Product(String name, String code, double waterAmount, int units){
		this.name = name;
		this.code = code;
		this.waterAmount = waterAmount;
		this.units = units;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getCode(){
		return code;
	}
	public void setCode(String code){
		this.code=code;
	}
	public double getWaterAmount(){
		return waterAmount;
	}
	public void setWaterAmount(double waterAmount){
		this.waterAmount=waterAmount;
	}
	public int getUnits(){
		return units;
	}
	public void setUnits(int units){
		this.units=units;
	}
}
