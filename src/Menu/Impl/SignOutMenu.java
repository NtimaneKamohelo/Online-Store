package Menu.impl;

import Menu.menu;
import configs.ApplicationContext;

public class SignOutMenu implements menu{

	private ApplicationContext context;
	
	{
		context = ApplicationContext.getInstance();
	}
	
	@Override
	public void start() {
		printMenuHeader();
		printMenuHeader();
		context.setLoggedInUser(null);
	}
	
	@Override
	public void printMenuHeader() {
		System.out.println("***** Sign Out*****");
		System.out.println("Have a nice day! Looking forward to welcome you back!");
	}
}
