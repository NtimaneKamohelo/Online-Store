package services;

import Enteties.User;

public interface UserManagementService {

	String registerUser(User user);
	User[] getUsers();
	User getUserByEmail(String userEmail);
	
}
