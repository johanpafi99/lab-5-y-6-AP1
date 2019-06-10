package MODEL;
public abstract class LegalPerson{
	//atributos
	private String name;
	private String nit;
	private String address;
	private int phone;
	private int employee;
	private String legalRepresentative;
	private double valueAseets;
	private String constitutionDate;
	private String type;

	private Cubicle[][] theTower;
	/**
	* Description: This is the constructor method.
	* @param The name of the company registered <br> whit the chamber of commerce.
	* @param the nit assigned to the company.
	* @param The correspondence address.
	* @param The contact phone.
	* @param The number of employees.
	* @param The value in pesos of the assets.
	* @param the date of incorporation.
	* @param The name of the legal representative.
	* @param The type of organization.
	*/
	public LegalPerson(String name, String nit, String address, int phone, int employee, double valueAseets, String constitutionDate,  String legalRepresentative, String type){
		this.name = name;
		this.nit = nit;
		this.address = address;
		this.phone = phone;
		this.employee = employee;
		this.valueAseets = valueAseets;
		this.constitutionDate = constitutionDate;
		this.legalRepresentative = legalRepresentative;
		this.type = type;
		theTower = new Cubicle[7][20];
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getNit(){
		return nit;
	}
	public void setNit(String nit){
		this.nit = nit;
	}
	public String getAddress(){
		return address;
	}
	public void setAddress(String address){
		this.address = address;
	}
	public int getPhone(){
		return phone;
	}
	public void setPhone(int phone){
		this.phone = phone;
	}
	public int getEmployee(){
		return employee;
	}
	public void setEmployee(int employee){
		this.employee = employee;
	}
	public double getValueAseets(){
		return valueAseets;
	}
	public void setValueAseets(double valueAseets){
		this.valueAseets = valueAseets;
	}
	public String getConstitutionDate(){
		return constitutionDate;
	}
	public void setConstitutionDate(String constitutionDate){
		this.constitutionDate = constitutionDate;
	}
	public String getLegalRepresentative(){
		return legalRepresentative;
	}
	public void setLegalRepresentative(String legalRepresentative){
		this.legalRepresentative = legalRepresentative;
	}
	public String getType(){
		return type;
	}
	public void setType(String type){
		this.type = type;
	}

	/**
	* Description : This method allow find a employeed and know his extension with a especially way (HL)
	* @param name of the employeed : This is the name of the employeed that you wanna know
	* @return message: Return a message with the information
	*/

	public String pathL(String nameEmple){
		int j = 0;
		boolean abajo = true;
		String message = "El empleado no existe en este recorrido";

		for(int i = 0;i<theTower.length;i++){
			if(theTower[i][j].getEmployee().getName().equals(nameEmple)){

				message = "La extension del empleado es "+theTower[i][j].getExtension();
			}
			abajo = true;
		}
		if(abajo==true){
			for(int k = 0;k<theTower[0].length;k++){

				if(theTower[theTower.length-1][k].getEmployee().getName().equals(nameEmple)){

					message = "La extension del empleado es "+theTower[theTower.length-1][k].getExtension();
				}
			}
		}
		return message;
	}

	/**
	* Description : This method allow find a employeed and know his extension with a especially way (X)
	* @param name of the employeed : This is the name of the employeed that you wanna know
	* @return message: Return a message with the information
	*/

	public String pathX(String nameEmple){
		int m = theTower.length;
		boolean stop = false;
		int a = 0; //filas
		int b = theTower[0].length-1; //columnas
		String message = "El empleado no existe en este recorrido";
		if(theTower[0].length<m){
			m = theTower[0].length;
		}
		//diagonal invertida
		while(a<m && b >= 0 && !stop){

			if(theTower[a][b].getEmployee().getName().equals(nameEmple)){
				message = "La extension del empleado es "+theTower[a][b].getExtension();
				stop = true;
			}
			a++;
			b--;
		}
		//diagonal principal
		int c = 0; //filas diagonal principal
		int d = 0; //columnas diagonal principal
		while(c<m){
			if(theTower[c][d].getEmployee().getName().equals(nameEmple)){
				message = message = "La extension del empleado es "+theTower[c][d].getExtension();
			}
			c++;
			d++;
		}
		return message;
	}

	/**
	* Description : This method allow find a employeed and know his extension with a especially way (Z)
	* @param name of the employeed : This is the name of the employeed that you wanna know
	* @return message: Return a message with the information
	*/

	public String pathZ(String nameEmple){
		String message = "El empleado no existe en este recorrido";
		boolean stop = false;

		//arriba
		for(int i=0; i<theTower[0].length; i++){
			if(theTower[0][i].getEmployee().getName().equals(nameEmple)){
				message = "La extension del empleado es "+theTower[0][i].getExtension();
			}
		}
		//abajo
		for(int k=0; k<theTower[0].length; k++){
			if(theTower[theTower.length-1][k].getEmployee().getName().equals(nameEmple)){

				message = "La extension del empleado es "+theTower[theTower.length-1][k].getExtension();
			}
		}
		//diagonal
		for(int j=0; !stop && j<theTower.length; j++){
			for(int m=theTower[0].length-1; !stop && m>=0; m++){
				if(theTower[j][m].getEmployee().getName().equals(nameEmple)){
					message = "La extension del empleado es "+theTower[j][m].getExtension();
					stop=true;
				}
				if(!stop){
					m--;
					j++;
				}
			}
		}
		return message;
	}

	/**
	* Description : This method allow find a employeed and know his extension with a especially way (O)
	* @param name of the employeed : This is the name of the employeed that you wanna know
	* @return message: Return a message with the information
	*/

	public String pathO(String nameEmple){
		String message =  "El empleado no existe en este recorrido";
		boolean stop = false;

		for(int i = 0; i<theTower[0].length && !stop ;i++){
			if(theTower[0][i].getEmployee().getName().equals(nameEmple)){
				message = "La extension del empleado es "+theTower[0][i].getExtension();
				stop = true;
			}
		}
		for(int k = 0; k<theTower[0].length && !stop ;k++){
			if(theTower[k][0].getEmployee().getName().equals(nameEmple)){
				message = "La extension del empleado es "+theTower[k][0].getExtension();
				stop = true;
			}
		}
		for(int l = 0; l<theTower[0].length && !stop ;l++){
			if(theTower[theTower.length-1][l].getEmployee().getName().equals(nameEmple)){
				message = "La extension del empleado es "+theTower[theTower.length-1][l].getExtension();
				stop = true;
			}
		}
		for(int j = 0; j<theTower[0].length && !stop ;j++){
			if(theTower[j][theTower[0].length-1].getEmployee().getName().equals(nameEmple)){
				message = "La extension del empleado es "+theTower[j][theTower[0].length-1].getExtension();
				stop = true;
			}
		}
		return message;
	}

	/**
	* Description : This method allow find a employeed and know his extension with a especially way (E)
	* @param name of the employeed : This is the name of the employeed that you wanna know
	* @return message: Return a message with the information
	*/

	public String pathE(String nameEmple){
		boolean stop = false;
		String message = "El empleado no existe en este recorrido";

		if (theTower.length % 2 != 0) {
			for (int i = 0;i<theTower.length && !stop ;i++ ) {
				if (i%2 == 0) {
					for (int j = 0;j< theTower[0].length && !stop;j++ ) {
						if(theTower[i][j].getEmployee().getName().equalsIgnoreCase(nameEmple)){
							message = "La extension del empleado es "+theTower[i][j].getExtension();
							stop = true;
						}
					}
				}else{
					for (int k = theTower[0].length-1; k>= 0 && !stop;k--) {
						if(theTower[i][k].getEmployee().getName().equalsIgnoreCase(nameEmple)){
							message = "La extension del empleado es "+theTower[i][k].getExtension();
							stop = true;
						}
					}
				}
			}
		}
		return message;
	}

	/**
	* Description : This method allow show a principal message
	*
	* @return message: Return all the information
	*/

	public String toString(){
		String message = "";
		message += "---------------------------------------------------------------";
		message += "-----------------INFORMATION OF THE LEGAL PERSON---------------";
		message += "---------------------------------------------------------------";
		message += "Company name "+name+"\n";
		message += "Company address "+address+"\n";
		message += "Business phone "+phone+"\n";
		message += "Number of employees of the company "+employee+"\n";
		message += "Name of the legal representative "+legalRepresentative+"\n";
		message += "Assets of value of the company "+valueAseets+"\n";
		message += "Date of the company "+constitutionDate+"\n";
		message += "Type of company "+type+"\n";
		return message;
	}

}
