package Enteties.Impl;

public class DefaultCart {

private static int userCounter = 0;
	
	private int id;
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	
	{
		id = ++userCounter;
	}
	
	//Constructor
	DefaultCart(){
		
	}
	
	DefaultCart(String firstName, String lastName, String password, String email){
		this.firstName = firstName;
		this.lastName = lastName;
		this.password = password;
		this.email = email;
	}
	
	//Setters and Getters
	
	public String getFirstName() {
		return firstName;
	}
	
	
	public String getLastName() {
		return lastName;
	}
	
	
	public String getPassword() {
		return password;
	}
	
	public String getEmail() {
		return email;
	}
	
}
