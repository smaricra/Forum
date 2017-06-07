package model.user;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class UserFile {
	
	private static String path = "C:\\Users\\Maric\\FTN\\WebProgramiranje\\AngularWebShop\\src\\model\\user\\users.out";
	private static String pat = "src\\data\\users.out";
	
	public void writeUsers(ArrayList<User> listUsers) {
		try {
		      FileOutputStream out = new FileOutputStream(pat);
		      ObjectOutputStream oos = new ObjectOutputStream(out);
		      oos.writeObject(listUsers);
		      oos.flush();
		    } catch (Exception e) {
		      System.out.println("Problem serializing: " + e);
		    }
	}
	
	public ArrayList<User> readUsers() {
		try {
		      FileInputStream in = new FileInputStream(pat);
		      ObjectInputStream ois = new ObjectInputStream(in);
		      ArrayList<User> usersList = (ArrayList<User>) (ois.readObject());
		      return usersList;
		    } catch (Exception e) {
		      System.out.println("Problem serializing: " + e);
		    }
		return null;
	}


}
