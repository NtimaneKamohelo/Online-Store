package Menu.impl;

import java.util.Scanner;

import Enteties.User;
import Enteties.Impl.DefaultUser;
import Menu.menu;
import configs.ApplicationContext;
import services.UserManagementService;
import services.impl.DefaultUserManagementService;

public class SignUpMenu implements menu {

	private UserManagementService userManagementService;
	private ApplicationContext context;
	
	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}
	
	@Override
	public void start() {
		printMenuHeader();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please, enter your first name: ");
		String firstName = sc.next();
		System.out.print("Please, enter your last name: ");
		String lastName = sc.next();
		System.out.println("Please, enter your email: ");
		String email = sc.nextLine();
		System.out.println("Please, enter your password: ");
		String password = sc.next();
		
		User user = new DefaultUser(firstName, lastName, password, email);
		
		String errorMessage = userManagementService.registerUser(user);
		if (errorMessage == null || errorMessage.isEmpty()) {
			context.setLoggedInUser(user);
			System.out.println("New user is created");
		} else {
			System.out.println(errorMessage);
		}
	}
	
	@Override
	public void printMenuHeader() {
		System.out.println("****SIGN UP****");
	}
	
}
