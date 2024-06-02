package CraftingGame;
import java.io.Serializable;
public class SerialisationUser {

	public class User implements Serializable{


		String name;
		String password;
			
		public void save() {
			System.out.println("Hello "+name);
		}
			
	}


}
