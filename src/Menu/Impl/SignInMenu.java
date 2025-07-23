package Menu.impl;

import java.util.Scanner;

import Enteties.User;
import Menu.menu;
import configs.ApplicationContext;
import services.UserManagementService;
import services.impl.DefaultUserManagementService;

public class SignInMenu implements menu{
	
	private UserManagementService userManagementService;
	private ApplicationContext context;
	
	{
		context = ApplicationContext.getInstance();
		userManagementService = DefaultUserManagementService.getInstance();
	}
	
	@Override
	public void start() {
		printMenuHeader();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter your email: ");
		String userEmail = sc.next();
		
		System.out.print("Please, enter your password: ");
		String userPassword = sc.next();
		
		User user = userManagementService.getUserByEmail(userEmail);
		if (user != null && user.getPassword().equals(userPassword)) {
			System.out.printf("Glad to see you back %s %s", user.getFirstName(), 
					user.getLastName() + System.lineSeparator());
			context.setLoggedInUser(user);
		} else {
			System.out.println("Unfortunately, such login and password doesn't exist.");
		}	
	}
	
	@Override
	public void printMenuHeader() {
		System.out.println("***** Sign In *****");
	}
	
}
