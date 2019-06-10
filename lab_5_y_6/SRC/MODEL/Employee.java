package MODEL;

public class Employee{
	private String name;
	private String position;
	private String mail;
	/**
	* Description : This is the construtor method
	* @param name : This is the name of the employee
	* @param position : This is the position of the employee in the floor
	* @param mail : This is the mail of the employee
	*/
	public Employee(String name, String position, String mail){
		this.name = name;
		this.position = position;
		this.mail = mail;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getPosition(){
		return position;
	}
	public void setPosition(String position){
		this.position = position;
	}
	public String getMail(){
		return mail;
	}
	public void setMail(String mail){
		this.mail = mail;
	}


}
