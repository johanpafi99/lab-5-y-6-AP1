package MODEL;

public class Cubicle{
	private String extension;
	private Employee employee;
	/**
	* Description: This is the constructor method.
	* @param The name of the product.
	* @param the code of the product.
	* @param The amount of water you used.
	* @param The available units of the product.
	*/
	public Cubicle(String extension, Employee employee){
		this.extension = extension;
		this.employee = employee;
	}
	public String getExtension(){
		return extension;
	}
	public void setExtension(String extension){
		this.extension = extension;
	}
	public Employee getEmployee(){
		return employee;
	}
	public void setEmployee(Employee employee){
		this.employee = employee;
	}
	public String getEmployeeName(){
		String ms = "";
		if(employee != null){
			ms = employee.getName();
		}
		return ms;
	}

}
