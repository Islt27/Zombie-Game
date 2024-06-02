package CraftingGame;
import java.io.Serializable;
public class DeserialiseUser implements Serializable {

	String name;
	String password;
	
	public void save() {
		System.out.println("Hello "+name);
}
}