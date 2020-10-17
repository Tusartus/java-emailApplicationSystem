package emailapp;
import java.util.Scanner;


public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String department;
	private int mailboxCapacity = 5000;
	private String alternateEmail;
	private int defaultpasswordLength = 15;
	private String companySuffix = "mycompany.com";
	private String email;
	
	
	
	// Constructor to receive the first name and last name
	public Email(String firstName, String lastName) {
		  this.firstName = firstName;
		  this.lastName = lastName;
		//System.out.println("Email created " + this.firstName + " "+ this.lastName);
		  
		  
		  //call a method asking for thisdepartment  return the department
		  this.department = setDepartment();
		 // System.out.println("Department: " + this.department);
		  
		  //call method that return a random password 
		  this.password= randomPassword( defaultpasswordLength);
		  System.out.println("your pasword is " + this.password);
		  
		  //combine element to generate email
		   email =  firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department +  "." +	 companySuffix;
		  System.out.println("your email is : " + email);
		  
		  
		  
		  
		  
		  
		  
		  
	}
	
	
	//Ask for department
	private String setDepartment() {
		System.out.println("Enter codepartment\n1 for Sales\n2 for Developement\n3 for AccountEng\n0 for nothing\nEnter deparment code	");
		
		Scanner in = new Scanner(System.in);
		int depChoice  = in.nextInt();
		if(depChoice == 1) {
			return   "SALES";
		}else if (depChoice == 2){
			return "dev";
		}else if(depChoice == 3) {
			return "acc";
		}else {
			return "nothing";
			
			
		}
		
		
	
		
		
	}
	
	
	
	//Generate a random password
	private String randomPassword(int length) {
		String passwordSet = "ABDGFGHJMMPOYRGB*//DGFTYHLMPOOIIYFGSFDZHJDLKFF+-*-*94F";
		char[] password = new char[length];
		
		for (int i=0; i<length; i++) {
			 int rand =(int) (Math.random() * passwordSet.length());
			 password[i] =	 passwordSet.charAt(rand);
			 System.out.println(rand);
			 System.out.println( passwordSet.charAt(rand));
		}
		return new String(password);
		
			 
		
	}
	
	
	//Set the mailbox capacity
	public void setMailboxCapacity(int capacity) {  //encapsulation
		this.mailboxCapacity  = capacity;
		
	}
	
	
	
	//SET THE ALTERNATIVE EMAIL
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail  = altEmail;
	}
	
	
	//CHANGE THE PASSWORD 
	public void ChangePassword(String password) {
		this.password = password;
	}
	
	public int getMailboxCapacity () {
		return mailboxCapacity;
	}
	public String getAlternateEmail() {
		return alternateEmail;
	}
	public String getPassword () {
		return password;
	}
	
	
	
	public String showInfo() {
		return "Display name : " + firstName + " " + lastName + "\n" +
				"COmpany email:"+ email + "\n" +
				"MailBox capacity : " +
				
				mailboxCapacity + " ";
				
	}
	
	
	
	
	

}
