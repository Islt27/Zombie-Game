package CraftingGame;

import java.io.Serializable;

public class User implements Serializable{

	String name;
	String password;
	
	public void save() {
		System.out.println("Hello "+name);
	}

	public boolean equalsIgnoreCase(String string) {
		return false;
		// TODO Auto-generated method stub
		
	}
}
