package CraftingGame;


public class fighting {


	String name;
	int damage;
	
	fighting(String name, int damage){
		this.name = name;
		this.damage = damage;
		
	}
	
	void attacks() {
		System.out.println ("You used "+this.name);
		System.out.println ("");
	}
	}