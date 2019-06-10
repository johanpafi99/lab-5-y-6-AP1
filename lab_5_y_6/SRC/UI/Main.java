package UI;
import MODEL.*;
import java.util.*;
public class Main{

  /**
  *Relation
  */
	private Holding  user;

   //Initializer

	private Scanner reader;

	//Constructor

	public Main(){
		init();
		//String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,Building[][] tower)
		reader = new Scanner(System.in);
		

	}
	/**
    *Start of the program
    */

    public static void main (String[] args){
    	Main m = new Main();
    	m.menu();
    	m.showMenu();
    }
    public void menu(){
    	welcome();
    }
    /**
    *This method is used to create the title of the progam
    */
    public void welcome(){
    System.out.println(".............................................................................");
    System.out.println("--------------------         Santiago Rodas              --------------------");
    System.out.println(".............................................................................");

    }
    /**
    *This method serves to show the user the options panel
    */
    public void showOptions(){
  System.out.println("---------------------------------------------------------------------------");
  System.out.println("Select a option."                                 );
  System.out.println("1.Add company              ");
  System.out.println("2.Information                ");
  System.out.println("3.Add poll            ");
  System.out.println("4.Add a a new employed            ");
  System.out.println("5.Search employed             ");
  System.out.println("8.Exit                                                        ");
  System.out.println("---------------------------------------------------------------------------");


    }
    /**
    *This method is used to select a menu option
    */
    public void showMenu(){
    	int userInput=0;
   while (userInput != 8){
        showOptions();
        userInput = reader.nextInt();
        reader.nextLine();

    if(userInput == 1){
//public PersonalityJuridic(String name,String nit,String addreess,String phone,int employees,double valueAseets,String constitucionDate,String legalRepresentative,Building[][] tower){


    	System.out.println("Name:");
    	String name = reader.nextLine();

    	System.out.println("Nit:");
    	String nit =reader.nextLine();

		System.out.println("Address");
    	String addreess = reader.nextLine();

		System.out.println("Phone:");
    	int phone =reader.nextInt();
		reader.nextLine();

		System.out.println("Employed number");
    	int employees = reader.nextInt();
    	reader.nextLine();

		System.out.println("Price");
    	double valueAseets = reader.nextDouble();
    	reader.nextLine();

		System.out.println("Date ");
    	String constitucionDate = reader.nextLine();

		System.out.println("Legal representative:");
    	String legalRepresentative = reader.nextLine();


		reader.nextLine();

    	System.out.println("Organization");

    	System.out.println("A. Agriculture");
    	System.out.println("B. Exploitation");
    	System.out.println("C. Manufacturing industry ");
    	System.out.println("D. Electricity ");
    	System.out.println("E. Building");
    	System.out.println("F. Wholesale");
    	System.out.println("G. Transportation");
    	System.out.println("H. Financial state ");
    	System.out.println("I. Communal");

    	char type =reader.nextLine().charAt(0);
    	String typeofservice ="";
    	if (type == 'A' ){
    		typeofservice = "Agriculture";
    	}
    	else if (type == 'B'){
    		typeofservice= "Exploitation";
    	}
    	else if (type== 'C'){
    		typeofservice= "Manufacturing";
    	}
    	else if (type == 'D'){
    		typeofservice= "Electricity";
    	}
    	else if (type == 'E'){
    		typeofservice="Buildin";
    	}
    	else if (type== 'F'){
    		typeofservice="Wholesale";
    	}
    	else if (type == 'G'){
    		typeofservice="Transportation";
    	}
    	else if (type == 'H'){
    		typeofservice="Financial state";
    	}
    	else if (type == 'I'){
    		typeofservice="Communal";
    	}
    	System.out.println("New company");

        System.out.println("1.Education");
        System.out.println("2.Public");
        System.out.println("3.Technology");
        System.out.println("4.Medicines");
		    System.out.println("5.Manufacturing");
        System.out.println("6.Food company ");
        int valor= reader.nextInt();
        reader.nextLine();
        String typeT = "";
        if (valor== 1){
			typeT = "Education company";
        	System.out.println("Enter the approval registration");
        	String numRegistry = reader.nextLine();
        	System.out.println("Enter the number of years accredited");
        	int acreeditedYears = reader.nextInt();
        	reader.nextLine();


        	System.out.println("Name of the rector");
        	String rectorName = reader.nextLine();
			System.out.println("Quantify of students of 1 and 2 ");
        	int strataOneandTwo = reader.nextInt();
        	reader.nextLine();
        	System.out.println("Quantify of students");
        	int qualityTotal = reader.nextInt();
        	reader.nextLine();
        	System.out.println("Select the education sector:");
        	System.out.println("1. High School");
        	System.out.println("2. University");
        	int estatustype = reader.nextInt();
        	reader.nextLine();
        	if (type == 1){
				System.out.println("Enter the national position 11");
				int positionSaber11 = reader.nextInt();
				reader.nextLine();
				HighSchool ms = new HighSchool(name, nit, addreess, phone, employees, valueAseets, constitucionDate, legalRepresentative, typeofservice, typeT, numRegistry, acreeditedYears, rectorName, strataOneandTwo, qualityTotal, positionSaber11);
				user.getCompanys().add(ms);
			}
        	else if (type == 2){
				System.out.println("Enter the national position pro");
				int  positionSaberPro = reader.nextInt();
				reader.nextLine();
				University m = new University(name, nit, addreess, phone, employees, valueAseets, constitucionDate, legalRepresentative, typeofservice, typeT, numRegistry, acreeditedYears, rectorName, strataOneandTwo, qualityTotal, positionSaberPro);
				user.getCompanys().add(m);
        	}

        	System.out.println("The company has been correctly registered");
        	//name, nit, addreess, phone, employees, valueAseets, constitucionDate, legalRepresentative



        }
        //String typeOfService, int subscribersActual,int subscribersOneandTwo)
        else if (valor==2){
			typeT = "Public service";
        	System.out.println("Please select the type of service you provide:");
        	System.out.println("1.Sewerage");
        	System.out.println("2.Energy");
        	System.out.println("3.Aqueduct");
        	int typeSer =reader.nextInt();
        	reader.nextLine();

        	System.out.println("Total number of subscribers");
        	int subscribersActual = reader.nextInt();
        	reader.nextLine();
        	System.out.println("Number of subscribers of estarto 3, 4, 5 and 6");
        	int subscribersOneandTwo= reader.nextInt();
        	reader.nextLine();
        	PublicService services = new PublicService(name, nit, addreess, phone, employees, valueAseets, constitucionDate, legalRepresentative, typeofservice, typeT,typeSer,subscribersActual,subscribersOneandTwo);
        	user.getCompanys().add(services);





        }
        else if (valor==3){
        	typeT = "Technology";
			System.out.println("How much energy have you used?:");
			int energy = reader.nextInt();
			reader.nextLine();

			System.out.println("How many services does it provide:");
			int servp = reader.nextInt();
			reader.nextLine();
			Technology  enem= new Technology(name, nit, addreess, phone, employees, valueAseets, constitucionDate, legalRepresentative, typeofservice, typeT, energy);
			for(int i = 0; i < servp; i++){
				System.out.println("Seleccione el tipo de servicio:");
				System.out.println("1.Consultoria");
				System.out.println("2.Capacitacion");
				System.out.println("3.Desarrollo de Software");
				System.out.println("4.Infraestructura como servicio.");
				System.out.println("5.Software como servicio.");
				System.out.println("6.Plataforma como servicio");

				int typeService = reader.nextInt();
				reader.nextLine();

				if (typeService== 1 ){
					enem.getServices().add(Technology.CONSULTANCY);
				}
				else if (typeService ==2){
					enem.getServices().add(Technology.CONSULTANCY);
				}
				else if (typeService == 3){
					enem.getServices().add(Technology.CONSULTANCY);
				}
				else if (typeService== 4){
					enem.getServices().add(Technology.CONSULTANCY);
				}
				else if (typeService == 5){
					enem.getServices().add(Technology.CONSULTANCY);
				}
				else if (typeService == 6){
					enem.getServices().add(Technology.CONSULTANCY);
				}
			}
			user.getCompanys().add(enem);

        }
        else if (valor==4){
			typeT = "Medication";
        	System.out.println("enter the sanitary registry");
			String sanitary = reader.nextLine();
			System.out.println("enter the state of sanitary registry:");
			System.out.println("1. Valid");
			System.out.println("2. not renewed");
			int sta = reader.nextInt();
			reader.nextLine();
			boolean state = false;
			if(sta == 1){
				state = true;

			}
			System.out.println("expiration date");
			String expiration = reader.nextLine();
			System.out.println("modality");
			String modality = reader.nextLine();

			Medication medi = new Medication(name, nit, addreess, phone, employees, valueAseets, constitucionDate, legalRepresentative, typeofservice, typeT, sanitary, state, expiration, modality);
			System.out.println("How many products does it have?");
			int algo = reader.nextInt();
			reader.nextLine();
			for(int i = 0; i<algo; i++){
				System.out.println("Enter name of product");
				String namep = reader.nextLine();
				System.out.println("Enter code of product");
				String codep = reader.nextLine();
				System.out.println("How much water do I spend?");
				int waterAmount = reader.nextInt();
				reader.nextLine();
				System.out.println("quantity of products available");
				int units = reader.nextInt();
				reader.nextLine();
				Product pr = new Product(namep, codep, waterAmount, units);
				medi.getProducts().add(pr);
			}

        }else if(valor == 5){
			typeT = "Manufacturing";
			ManufacturingCompany manu = new FoodCompanies(name, nit, addreess, phone, employees, valueAseets, constitucionDate, legalRepresentative, typeofservice, typeT, 0);
			System.out.println("How many products does it have?");
			int algos = reader.nextInt();
			reader.nextLine();
			for(int i = 0; i<algos; i++){
				System.out.println("Enter name of product");
				String namep = reader.nextLine();
				System.out.println("Enter code of product");
				String codep = reader.nextLine();
				System.out.println("How much water do I spend?");
				int waterAmount = reader.nextInt();
				reader.nextLine();
				System.out.println("quantity of products available");
				int units = reader.nextInt();
				reader.nextLine();
				Product pr = new Product(namep, codep, waterAmount, units);
				manu.getProducts().add(pr);
			}
		}

        else if (valor == 6){
        	typeT = "Food Compani";
			System.out.println("How many group does it have?");
			int algo = reader.nextInt();
			reader.nextLine();
			FoodCompanies foods = new FoodCompanies(name, nit, addreess, phone, employees, valueAseets, constitucionDate, legalRepresentative, typeofservice, typeT, algo);
			System.out.println("How many products does it have?");
			int algose = reader.nextInt();
			reader.nextLine();
			for(int i = 0; i<algose; i++){
				System.out.println("Enter name of product");
				String namep = reader.nextLine();
				System.out.println("Enter code of product");
				String codep = reader.nextLine();
				System.out.println("How much water do I spend?");
				int waterAmount = reader.nextInt();
				reader.nextLine();
				System.out.println("quantity of products available");
				int units = reader.nextInt();
				reader.nextLine();
				Product pr = new Product(namep, codep, waterAmount, units);
				foods.getProducts().add(pr);
			}

        }


}




    else if (userInput == 2){
		String m = "";
		for(int j = 0; j<user.getCompanys().size(); j++){
			m += user.getCompanys().toString();
		}
    	System.out.println(m);

    }
    else if (userInput == 3){

    	System.out.println("Enter the name of the company");
		String name = reader.nextLine();
		System.out.println("rate the service provided (1 to 5)");
		int serv = reader.nextInt();
		reader.nextLine();
		System.out.println("rate the response time given (1 to 5)");
		int time = reader.nextInt();
		reader.nextLine();
		System.out.println("rate the cost / benefit ratio of the service purchased (1 to 5)");
		int cos = reader.nextInt();
		reader.nextLine();
		Poll pol = new Poll(serv, time, cos);
		user.addSurveys(name, serv, time, cos);


	}
    else if(userInput== 4){







    }else if(userInput == 5){
		System.out.println("Enter the name employee");
		String name = reader.nextLine();
		System.out.println("enter where you want to search");
		System.out.println("1.Holding");
		System.out.println("2.Other company");
		int e = reader.nextInt();
		reader.nextLine();
		if(e == 1){
			System.out.println("enter the way you want to search");
			System.out.println("1. in L");
			System.out.println("2. in X");
			System.out.println("3. in Z");
			System.out.println("4. in O");
			System.out.println("5. in E");
			int el = reader.nextInt();
			reader.nextLine();
			if(el == 1){
				System.out.println(user.pathL( name));
			}else if(el == 2){
				System.out.println(user.pathX( name));
			}else if(el == 3){
				System.out.println(user.pathZ( name));
			}else if(el == 4){
				System.out.println(user.pathO( name));
			}else if(el == 5){
				System.out.println(user.pathE( name));
			}
		}else if(e == 2){
			System.out.println("Enter the name of the company");
			String nameE = reader.nextLine();
			System.out.println("enter the way you want to search");
			System.out.println("1. in L");
			System.out.println("2. in X");
			System.out.println("3. in Z");
			System.out.println("4. in O");
			System.out.println("5. in E");
			int el = reader.nextInt();
			reader.nextLine();
			if(el == 1){
				System.out.println(user.findExtens( nameE).pathL( name));
			}else if(el == 2){
				System.out.println(user.findExtens( nameE).pathX( name));
			}else if(el == 3){
				System.out.println(user.findExtens( nameE).pathZ( name));
			}else if(el == 4){
				System.out.println(user.findExtens( nameE).pathO( name));
			}else if(el == 5){
				System.out.println(user.findExtens( nameE).pathE( name));
			}
		}
	}
	}
   }


    public void init(){


    }
   }
