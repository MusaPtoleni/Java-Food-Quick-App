import java.util.Scanner;


public class Restaurant {

	//new Scanner
	static Scanner scan;
	
	//All the Attributes for restaurant class 
	String name;
	String location;
	int phoneNum;
	int numOfMeal;
	static String listMeal;
	double mealPrice;
	String addONs;
	String driver;
	double total;
	String address;
	
	//Getter to get all the values of the attributes
	public String getName() {
		return name;
	}
	public String getLocation() {
		return location;
	}
	public int getPhoneNum() {
		return phoneNum;
	}
	public int getNumOfMeal() {
		return numOfMeal;
	}
	public String getListMeal() {
		return Restaurant.listMeal;
	}
	public double getMealPrice() {
		return this.mealPrice;
	}
	public String getAddONs() {
		return addONs;
	}
	public String getDriver() {
		return driver;
	}
	public double getTotal() {
		return total;
	}
	public String setAddress(String address) {
		return address;
	}
	
	//Setters and methods to set the restaurant attributes 
	public String setName() {
		scan = new Scanner(System.in);
		System.out.println("Name of the Restaurant?");
		name = scan.nextLine();
		return this.name;
	}
	public String setLocation() {
		scan = new Scanner(System.in);
		System.out.println("The location of the Restaurant?");
		location = scan.nextLine();
		return this.location;
	}
	public int setPhoneNum() {
		scan = new Scanner(System.in);
		System.out.println("Contact number of the Resturant?");
		phoneNum = scan.nextInt();
		return this.phoneNum;
	}
	public static String setMealList() {
		scan = new Scanner(System.in);
		System.out.println("How many of each meals are you ordering?");
		int length = scan.nextInt();
		
		String[] meals = new String[length];
		
		listMeal = ""; 
		
		for(int index = 0; index < length;index++) {
			System.out.println("Please enter the Meal" + " " + (index+1));
			meals[index] = index + 1 + "x" + " " +scan.next();
		}
		
		for(int index = 0; index < length;index++) {
			listMeal = meals[index];
		}
		
		return listMeal;
	}
	
	//created a setter method to set the price of the foods given
	public double setmealPrice() {
		scan = new Scanner(System.in);
		System.out.println("How many meals did you oder?");
		int length = scan.nextInt();
		
		String[] meals = new String[length];
		
		mealPrice = 0;
		
		for(int index = 0; index < length;index++) {
			System.out.println("Please enter the Price of the meal num" + " " + (index+1));
			meals[index] = scan.next();
		}
		
		for(int index = 0; index < length;index++) {
			mealPrice = Double.parseDouble(meals[index]);
		}

		return this.mealPrice;
	}
	public String setAddONs() {
		scan = new Scanner(System.in);
		System.out.println("Any specia l instruction?");
		addONs = scan.nextLine();
		return this.addONs;
	}
	//asking the user for the total amount of the meal
	public double setTotal() {
		scan = new Scanner(System.in);
		System.out.println("What is the total of your meals?");
		total = scan.nextDouble();
		return total;
	}
		
	public int setNumOfMeal() {
		return this.numOfMeal;
	}
	
	//Method to get the driver in the same location as the restaurant
	public String setDriver(String location) {
		//declared an empty variable for the driver
		 driver = "";

		 //if statement to compare the restaurant location and the driver location
		if(location.equalsIgnoreCase("Cape Town")) {
			driver = "Miranda Metcalfe is the nearest to the restaurant and so he will be delivering your order to you at: \n";
		}else if(location.equalsIgnoreCase("Durban")) {
			driver = "Eugene Santana is the nearest to the restaurant and so he will be delivering your order to you at: \n";
		}else if(location.equalsIgnoreCase("Johannesburg")) {
			driver = "Spike Fenton is the nearest to the restaurant and so he will be delivering your order to you at: \n";
		}else if(location.equalsIgnoreCase("Potchefstroom")) {
			driver = "Jaidan Sadler is the nearest to the restaurant and so he will be delivering your order to you at: \n";
		}else if(location.equalsIgnoreCase("Springbok")) {
			driver = "Johan Hoffman is the nearest to the restaurant and so he will be delivering your order to you at: \n";
		}else if(location.equalsIgnoreCase("Witbank")) {
			driver = "Eshan Gibson is the nearest to the restaurant and so he will be delivering your order to you at: \n";
		}else if(location.equalsIgnoreCase("Bloemfontein")) {
			driver = "Kailan Snow is the nearest to the restaurant and so he will be delivering your order to you at: \n";
		}else {
			driver = "Sorry! Our drivers are too far away from you to be able to deliver to your location.";
		}
		
		return this.driver;
	}	   

	//A method to get the address from the user
	public static String getAddress(String address) {
		return address;
	}

	//toString method 
	public String toString() {
		String output = "You have ordered the follow from " + " " + name + " " + "in" + " " + location +"\n :";
		output += listMeal + " " +  mealPrice + "\n";
		output += "Special Instruction: " + addONs + "\n";
		output += "Total: " + " " + total + "\n";
		output += driver + "\n";
		output += address + "\n";
		output += "If you need to conact the restaurant, their number is is: " + phoneNum;
		return output + "n";
	}
	
}
