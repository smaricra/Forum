package model.user;

import java.util.ArrayList;


public class CoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		User user1 = new User();
		user1.setEmail("email_1");
		user1.setName("name_1");
		user1.setPassword("password_1");
	User user2 = new User();
		user2.setEmail("email_2");
		user2.setName("name_2");
		user2.setPassword("password_2");
	UsersList users = new UsersList();
	users.usersList.add(user1);
	users.usersList.add(user2);
	UserFile uf = new UserFile();
	ArrayList<User> juzeri = new ArrayList<>();
	if(juzeri!=null) {
		juzeri = uf.readUsers();
	}
	uf.writeUsers(users.usersList);
	ArrayList<User> savica = new ArrayList();
	users.usersList = uf.readUsers();
	User user3 = new User();
	user3.setUsername("AjSad");
	users.usersList.add(user3);
	uf.writeUsers(users.usersList);
	savica = uf.readUsers();
	
	System.out.println(savica.toString());
	}

}
