package CraftingGame;
import java.io.Serializable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialisationMain {
	
	public static void main (String[] args) throws IOException {
	User user = new User();
	
	user.name = "Inkar";
	user.password = "password123";
	
	FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
	ObjectOutputStream out = new ObjectOutputStream(fileOut);
	out.writeObject(user);
	out.close();
	fileOut.close();
	System.out.println("Game Saved! :)");
	


	}
}

