import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		
		//creating a new objects for customer and restaurant
		Customer user = new Customer();
		Restaurant restaurant = new Restaurant();
		
		
		//Setting all the attributes of the restaurant class 
		user.setOrderNum();
		user.setFullname();
		user.setCellNum();
		user.setEmail();
		user.setLoction();
		user.setAddress();
		String address = Customer.getAddress(); 
		
		
		//Setting all the attributes of the restaurant class  
		restaurant.setName();
		restaurant.setLocation();
		String location = restaurant.getLocation();
		restaurant.setDriver(location);
	    Restaurant.setMealList();
	    restaurant.setmealPrice();
		restaurant.setAddONs();
		restaurant.setTotal();
		restaurant.setPhoneNum();
		Restaurant.getAddress(address); //passing the customer address to the restaurant class 
	   
		
		//creating a new file
	    try {
	    	File myFile = new File("invoice.txt");
	    	if(myFile.createNewFile()) {
	    		System.out.println("file created");
	    	}else {
	    		System.out.println("Invoice has been printed");
	    	}
	    }catch(IOException e) {
	    	System.out.println("an error occured");
	    	e.printStackTrace();
	  
	    }
	    
	    //Writing to the new file I've created 
		FileWriter file = new FileWriter("invoice.txt");
		file.write(user.toString());
		file.write(restaurant.toString());
		file.close();
	}
}
