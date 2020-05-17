package fictionalbank3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;


public class DatabaseManager {
	private String fname, lname, email, password, cpassword, phone, nid, age, father, mother, address;
	private int type, amount;
	String filename = "users.txt";
	DatabaseManager()
	{
		this.fname = this.lname = this.email = this.cpassword = this.phone = this.nid = this.age = this.father = this.mother = this.address = "";
		this.type = 0;
	}
	public void RegisterUser(int type, String fname, String lname, String email, String password, String cpassword, String phone, String nid, String age, String father, String mother, String address) {
		String total = "";
		
		this.type = type;
		this.fname = fname.trim();
		this.lname = lname.trim();
		this.email = email.trim();
		this.password = password.trim();
		this.cpassword = cpassword.trim();
		this.phone = phone.trim();
		this.nid = nid.trim();
		this.age = age.trim();
		this.father = father.trim();
		this.mother = mother.trim();
		this.address = address.trim();
		this.amount = 0;
		String input = type+"`"+fname+"`"+lname+"`"+email+"`"+password+"`"+cpassword+"`"+phone+"`"+nid+"`"+age+"`"+father+"`"+mother+"`"+address+"`"+amount+"/";
		
		try {
			File reader = new File("users.txt");
			Scanner sc = new Scanner(reader);
			
			while(sc.hasNextLine()) {
				total += sc.nextLine();
			}
			
			FileWriter out =  new FileWriter("users.txt");
			System.out.println(input);
			out.append(total+input);
			out.close();
		} catch(IOException e) {
			System.out.println("Error occured: "+e);
		}
	}
	public void UpdateAmount(String amount){
		Session session = new Session();
		String s = "";
		String total = "";
		try {
			File reader = new File("users.txt");
			Scanner sc = new Scanner(reader);
			
			while(sc.hasNextLine()) {
				s += sc.nextLine();
			}
			int index = 0;
			String[] users = s.split("/");
			for(String user: users) {
				if(index == session.index) {
					String[] values = user.split("`");
					values[12] = amount;
					for(String value: values) {
						System.out.println(value);
						total += value+"`";
					}
					total += "/";
				}
				else {
					System.out.println(user);
					total += user+"/";
				}
				index++;
			}
			FileWriter writer = new FileWriter("users.txt");
			writer.write(total);
			writer.close();
		}
		catch(IOException e) {
			System.out.println("Error"+e);
		}
		
	}
}
