package Menu.impl;

import Menu.menu;
import configs.ApplicationContext;

public class MainMenu implements menu {

	public static final String MENU_COMMAND = "menu";
	
	private static final String MAIN_MENU_TEXT_FOR_LOGGED_OUT_USER = "Please, enter number in console to proceed." + System.lineSeparator()
		+ "1. Sign Up" + System.lineSeparator() + "2. Sign In"
		+ System.lineSeparator() + "3. Product catalog" + System.lineSeparator()
		+ "4. My Orders" + System.lineSeparator() + "5. Settings" + System.lineSeparator() + "6. Customer List";
	
	private static final String MAIN_MENU_TEXT_FOR_LOGGED_IN_USER = "Please, enter number in console to proceed." + System.lineSeparator()
	+ "1. Sign Up" + System.lineSeparator() + "2. Sign Out"
	+ System.lineSeparator() + "3. Product catalog" + System.lineSeparator()
	+ "4. My Orders" + System.lineSeparator() + "5. Settings" + System.lineSeparator() + "6. Customer List";
	
	private ApplicationContext context;
	
	{
		context = ApplicationContext.getInstance();
	}
	
	@Override
	public void start() {
		while (true) {
			if (context.getMainMenu() == null) {
				context.setMainMenu(this);
			}
			
			Menu menuToNavigate = null;
			mainLoop: while 
		}
	}

}
