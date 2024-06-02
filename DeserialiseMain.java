package CraftingGame;

import java.io.*;
public class DeserialiseMain {

	public static void Main(String[] args) throws IOException, ClassNotFoundException {
		
		User user = null;
		
		FileInputStream fileIn = new FileInputStream("C:\\Users\\Inkar S\\eclipse-workspace\\ZombieBackup\\src\\CraftingGame\\SerialisationMain.java");
		ObjectInputStream in = new ObjectInputStream(fileIn);
		user = (User) in.readObject();
		in.close();
		fileIn.close();
		
		System.out.println(user.name);
		System.out.println(user.password);
		user.save();
	}
}
