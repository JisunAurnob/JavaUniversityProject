package fictionalbank3;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Session {
	public static String fname, lname, email, password, cpassword, phone, nid, age, father, mother, address, type;
	public static int amount, index;
	public String output = " ";
	String[] users, values;
	DatabaseManager dbmanager;
	public Session() {
		type = "0";
		dbmanager = new DatabaseManager();
//		try {
//			File reader = new File("users.txt");
//			Scanner sc = new Scanner(reader);
//			
//			while(sc.hasNextLine()) {
//				output += sc.nextLine();
//			}
//			
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println(output);
//		users = output.split("/");
//		for(String user: users) {
//			System.out.println("Users: "+ user);
//			String s = user;
//			values = s.split("`");
//			for(String value: values) {
//				System.out.println("Value: "+value);
//			}
//		}		
	}
	public boolean checkAuthentication(String email, String password)
	{
		try {
			File reader = new File("users.txt");
			Scanner sc = new Scanner(reader);
			
			while(sc.hasNextLine()) {
				output += sc.nextLine();
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		output = output.trim();
		users = output.split("/");
		index = 0;
		for(String user: users) {
			values = user.split("`");
			if(email.equals(values[3])) {
				type = values[0];
				fname = values[1];
				lname = values[2];
				email = values[3];
				password = values[4];
				phone = values[6];
				nid = values[7];
				age = values[8];
				father = values[9];
				mother = values[10];
				address = values[11];
				amount = Integer.valueOf(values[12]);
				return true;
				
			}
			index++;
		}
		return false;
	}
	public void resetSession() {
		this.fname = this.lname = this.password = this.cpassword = this.phone = this.nid = this.age = this.father = this.mother = this.address = this.type = "";
		this.amount = 0;
		this.index = -1;
	}
	public void increateAmount(int amount) {
		this.amount += amount;
		dbmanager.UpdateAmount(Integer.toString(this.amount));
	}
	public void decreaseAmount(int amount) {
		this.amount -= amount;
		dbmanager.UpdateAmount(Integer.toString(this.amount));
	}
}
