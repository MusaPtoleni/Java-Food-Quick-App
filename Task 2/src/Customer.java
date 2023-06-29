import java.util.Scanner;

public class Customer {
	//scanner variable
	Scanner scan;
	
	
	//Customers Attributes
	int orderNum;
	String fullName;
	String email;
	int cellNum;
	static String address;
	String location;
	
	//Setters for every attributes listed
	//Also made each setter have a scanner to to get an input from the user.
	public int setOrderNum() {
		scan = new Scanner(System.in);
		System.out.println("Enter your oder number:");
		orderNum = scan.nextInt();
		return orderNum;
	}
	public String setFullname() {
		scan = new Scanner(System.in);
		System.out.println("Enter Your full names:");
		fullName = scan.nextLine();
		return fullName;
	}
	public String setEmail() {
		scan = new Scanner(System.in);
		System.out.println("Enter your email address:");
		email = scan.nextLine();
		return email;
	}
	public int setCellNum(){
		scan = new Scanner(System.in);
		System.out.println("Enter your Phone number:");
		cellNum = scan.nextInt();
		return cellNum;
	}
	public String setAddress() {
		scan = new Scanner(System.in);
		System.out.println("What's your Address?");
		address = scan.nextLine();
		return address;
	}
	public String setLoction() {
		scan = new Scanner(System.in);
		System.out.println("Where are you located?");
		location = scan.nextLine();
		return location;
	}
	
	//Getter for every attributes listed
	public int getOrderNum() {
		return orderNum; 
	}
	public String getFullname() {
		return fullName;
	}
	public String getEmail() {
		return email;
	}
	public int getCellNum(){
		return cellNum;
	}
	public static String getAddress() {
		return address;
	}
	public String getLoction() {
		return location;
	}
	
	//toString method
	public String toString() {
		String output = "Order Number: " + orderNum + "\n";
		output += "Customer: " + fullName +"\n";
		output += "Email: " + email + "\n";
		output += "Phone Number: " + cellNum +"\n";
		output += "Address: " + address +"\n";
		output += "Location: " + location + "\n";
		return output + "\n";
	}
}
