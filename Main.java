package CraftingGame;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.io.*;


public class Main {

    public static void main(String[] args) throws IOException {
    	
    	User user = new User();
    	
    	user.name = "Inkar";
    	user.password = "password123";
    	
    	FileOutputStream fileOut = new FileOutputStream("UserInfo.ser");
    	ObjectOutputStream out = new ObjectOutputStream(fileOut);
    	out.writeObject(user);
    	out.close();
    	fileOut.close();
    	System.out.println("Game Saved! :)");
    	
    	
    	
        // TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        //List<String> craftingItems =  Arrays.asList(
        Random rando = new Random();
        String[] craftingItems = {
                "Stapler", "Staple", "Ruler", "Pencilsharpener", "Hairspray", "Lighter", "Rope", "Keyboard", "Fireextinguisher", "Paper", "Boardpins", "Cloth", "Plasters", "Scissors", "Binscrap", "cardboard"
        };
        fighting stapleGun = new fighting("Staple gun", 3);
        fighting sword = new fighting("Sword", 5);
        fighting flameThrower = new fighting("flame thrower", 20);
        fighting nunchucks = new fighting("nunchucks", 10);
        fighting darts = new fighting("darts", 15);
        fighting razorBladeGun = new fighting("razor blade gun", 15);
        fighting healthKit = new fighting("health kit", 120);
        fighting bandage = new fighting("bandage", 25);
        fighting sharpWhip = new fighting("sharp whip", 15);
        fighting helmet = new fighting("helmet", 1);
        fighting armour = new fighting("armour", 2);
        fighting slap = new fighting("slap", 5);

        int hearts = 120;
        //int zombieHearts = 25;

        
        ArrayList<String> inventory = new ArrayList<String>();
        inventory.add("Inventory : slap");


        System.out.println("MENU - NEW GAME - CONTINUE - QUIT");
        String Menu = scanner.nextLine();
        System.out.println(Menu);
        if (Menu.equalsIgnoreCase("New Game")) {
            System.out.println("Welome :)!");
        } else if (Menu.equalsIgnoreCase("Continue")) {
            System.out.println("Welcome back!");
           for(int i = 0; i < 100;) { 
            int zombieHearts = 25;
            int ex = 0;
            do {
            	int randomIndex = rando.nextInt(craftingItems.length);
            	String randomItem = craftingItems[randomIndex];
                //int CraftingItems = rando.nextInt(craftingItems.length);
                System.out.println(i);
                i++;
                do {
                    Random random = new Random();
                    int n = random.nextInt(5);//random number from 0 1 or 2 is selected
                    if (n == 1) {//if random number generated is 2 a zombie attack event will happen
                        System.out.println("ZOMBIE ATTACK");//this code will run if user encounters a zombie
                        ex = ex+10;
                        do {
                            hearts = hearts - 2;
                            if (hearts <= 0) {
                                System.out.println("YOU DIED");
                                System.out.println("SKILL ISSUE");
                                System.out.println("NOT POGGERS");
                                System.out.println("WEIRDCHAMP");
                                System.exit(0);
                            }
                            System.out.println(inventory);
                            System.out.println("What weapon will you fight with?");
                            String fight = scanner.nextLine();
                            System.out.println(fight);
                            if (fight.equalsIgnoreCase("StapleGun")) {
                                if (inventory.contains("stapleGun")) {
                                    stapleGun.attacks();
                                    zombieHearts -= stapleGun.damage;
                                    System.out.println("ZOMBIE IS ON " + zombieHearts);
                                    System.out.println("YOU ARE ON " + hearts);
                                } else {
                                    System.out.println("You don't have this!");
                                }
                            } else if (fight.equalsIgnoreCase("Sword")) {
                                if (inventory.contains("Sword")) {
                                    sword.attacks();
                                    zombieHearts -= sword.damage;
                                    System.out.println("ZOMBIE IS ON " + zombieHearts);
                                    System.out.println("YOU ARE ON " + hearts);
                                } else {
                                    System.out.println("You don't have this!");
                                }
                            } else if (fight.equalsIgnoreCase("nunchucks")) {
                                if (inventory.contains("nunchucks")) {
                                    nunchucks.attacks();
                                    zombieHearts -= nunchucks.damage;
                                    System.out.println("ZOMBIE IS ON " + zombieHearts);
                                    System.out.println("YOU ARE ON " + hearts);
                                } else {
                                    System.out.println("You don't have this!");
                                }
                            } else if (fight.equalsIgnoreCase("bandage")) {
                                if (inventory.contains("bandage")) {
                                    bandage.attacks();
                                    hearts = hearts + 25;
                                    System.out.println("ZOMBIE IS ON " + zombieHearts);
                                    System.out.println("YOU ARE ON " + hearts);
                                } else {
                                    System.out.println("You don't have this!");
                                }
                            } else if (fight.equalsIgnoreCase("helmet")) {
                                if (inventory.contains("helmet")) {
                                    helmet.attacks();
                                    hearts = hearts + 1;
                                    System.out.println("ZOMBIE IS ON " + zombieHearts);
                                    System.out.println("YOU ARE ON " + hearts);
                                } else {
                                    System.out.println("You don't have this!");
                                }

                            } else if (fight.equalsIgnoreCase("darts")) {
                                if (inventory.contains("darts")) {
                                    darts.attacks();
                                    zombieHearts -= darts.damage;
                                    System.out.println("ZOMBIE IS ON " + zombieHearts);
                                    System.out.println("YOU ARE ON " + hearts);
                                } else {
                                    System.out.println("You don't have this!");
                                }
                            } else if (fight.equalsIgnoreCase("razorBladeGun")) {
                                if (inventory.contains("razorBladeGun")) {
                                    razorBladeGun.attacks();
                                    zombieHearts -= razorBladeGun.damage;
                                    System.out.println("ZOMBIE IS ON " + zombieHearts);
                                    System.out.println("YOU ARE ON " + hearts);
                                } else {
                                    System.out.println("You don't have this!");
                                }
                            } else if (fight.equalsIgnoreCase("healthKit")) {
                                if (inventory.contains("healthKit")) {
                                    healthKit.attacks();
                                    hearts = hearts + 120;
                                    System.out.println("ZOMBIE IS ON " + zombieHearts);
                                    System.out.println("YOU ARE ON " + hearts);
                                } else {
                                    System.out.println("You don't have this!");
                                }
                            } else if (fight.equalsIgnoreCase("armour")) {
                                if (inventory.contains("armour")) {
                                    armour.attacks();
                                    hearts = hearts + 2;
                                    System.out.println("ZOMBIE IS ON " + zombieHearts);
                                    System.out.println("YOU ARE ON " + hearts);
                                } else {
                                    System.out.println("You don't have this!");
                                }
                            } else if (fight.equalsIgnoreCase("flameThrower")) {
                                if (inventory.contains("flameThrower")) {
                                    flameThrower.attacks();
                                    zombieHearts -= flameThrower.damage;
                                    System.out.println("ZOMBIE IS ON " + zombieHearts);
                                    System.out.println("YOU ARE ON " + hearts);
                                } else {
                                    System.out.println("You don't have this!");
                                }
                            } else if (fight.equalsIgnoreCase("sharpWhip")) {
                                if (inventory.contains("sharpWhip")) {
                                    sharpWhip.attacks();
                                    zombieHearts -= sharpWhip.damage;
                                    System.out.println("ZOMBIE IS ON " + zombieHearts);
                                    System.out.println("YOU ARE ON " + hearts);
                                } else {
                                    System.out.println("You don't have this!");
                                }
                            } else if (fight.equalsIgnoreCase("slap")) {
                                slap.attacks();
                                zombieHearts -= slap.damage;
                                System.out.println("ZOMBIE IS ON " + zombieHearts);
                                System.out.println("YOU ARE ON " + hearts);
                            } else {
                                System.out.println("You don't have this!");
                            }
                            if ((zombieHearts <= 0) || (hearts <= 0)){
                                break;
                            }
                        } while (true);
                        System.out.println("AAAAAAA");

                    } else {
                    	zombieHearts = 25;
                        System.out.println("You see two areas, search area 1 or area 2?");
                        String area = scanner.nextLine();
                        //user input is set to a variable called area
                        if (area.equalsIgnoreCase("area 1")) {
                            System.out.println("You searched area 1 and found a " + randomItem + "!");
                            inventory.add(randomItem);
                            System.out.println(inventory);
                        } else if (area.equalsIgnoreCase("area 2")) {
                            System.out.println("You searched area 2 and found a " + randomItem + "!");
                            inventory.add(randomItem);
                            System.out.println(inventory);
                        } else if (area.equalsIgnoreCase("crafting table")) {
                        	System.out.println("You have "+inventory);
                        	System.out.println("You have "+ex+" experience points");
                            System.out.println("What would you like to craft?");
                            String craft = scanner.nextLine();
                            inventory.add("craftingItems");
                            inventory.add("craftingItems");
                            if (craft.equalsIgnoreCase("Staple Gun")) {
                                if (inventory.contains("Staple")) {
                                    if (inventory.contains("Stapler")) {
                                        System.out.println("You crafted a STAPLE GUN POGCHAMP");
                                        inventory.add("stapleGun");
                                        inventory.remove("Stapler");
                                        inventory.remove("Staple");
                                    }                            
                                }                               
                            }
                            if(craft.equalsIgnoreCase("Sword")) {
                            	if(inventory.contains("Ruler")) {
                            		if(inventory.contains("Pencilsharpener")) {
                            			System.out.println("You crafted a SWORD POGCHAMP");
                            			inventory.add("Sword");
                            			inventory.remove("Ruler");
                            			inventory.remove("Pencilsharpener");
                            		}
                            	}
                            }
                            if (craft.equalsIgnoreCase("Flame thrower")) {
                            	if (inventory.contains("Hair spray")) {
                            		if (inventory.contains("Lighter")) {
                            			System.out.println("You crafted a FLAME THROWER POGCHAMP");
                            			inventory.add("Flame thrower");
                            			inventory.remove("Hair spray");
                            			inventory.remove("Lighter");
                            		}
                            	}
                            }
                            if (craft.equalsIgnoreCase("Nunchucks")) {
                            	if (inventory.contains("Rope")) {
                            		if (inventory.contains("Keyboards")) {
                            			System.out.println("You crafted NUNCHUCKS POGCHAMP");
                            			inventory.add("Nunchucks");
                            			inventory.remove("Rope");
                            			inventory.remove("Keyboards");
                            		}
                            	}
                            }
                            if (craft.equalsIgnoreCase("Darts")) {
                            	if (inventory.contains("Paper")) {
                            		if (inventory.contains("Board pins")) {
                            			System.out.println("You crafted DARTS POGCHAMP");
                            			inventory.add("Darts");
                            			inventory.remove("Paper");
                            			inventory.remove("Board pins");
                            		}
                            	}
                            }
                            if (craft.equalsIgnoreCase("Razor Blade Gun")) {
                            	if (inventory.contains("Fire extinguisher")) {
                            		if (inventory.contains("Pencil sharpener")) {
                            			System.out.println("You crafted a RAZOR BLADE GUN POGCHAMP");
                            			inventory.add("Razor blade gun");
                            			inventory.remove("Fire extinguisher");
                            			inventory.remove("Pencil sharpener");
                            		}
                            	}
                            }
                            if (craft.equalsIgnoreCase("Health kit")) {
                            	if (inventory.contains("Cloth")) {
                            		if (inventory.contains("Plaster")) {
                            			if (inventory.contains("Bandage")) {
	                            			System.out.println("You crafted a HEALTH KIT POGCHAMP");
	                            			inventory.add("Health kit");
	                            			inventory.remove("Cloth");
	                            			inventory.remove("Plaster");
	                            			inventory.remove("Bandage");
                            		}
                            	}
                            }
                            if (craft.equalsIgnoreCase("Bandage")) {
                                 if (inventory.contains("Cloth")) {
                                 	if (inventory.contains("Cloth")) {
                                 		System.out.println("You crafted a BANDAGE POGCHAMP");
                                 		inventory.add("Bandage");
                                 		inventory.remove("Cloth");
                                 		inventory.remove("Cloth");   
                                 	}
                                }
                            }
                            if (craft.equalsIgnoreCase("Sharp whip")) {
                            	if (inventory.contains("Scissors")) {
                            		if (inventory.contains("Rope")) {
                            			System.out.println("You crafted a SHARP WHIP POGCHAMP");
                            			inventory.add("Sharp whip");
                            			inventory.remove("Scissors");
                            			inventory.remove("Rope");
                            		}
                            	}
                            }
                            if (craft.equalsIgnoreCase("Helmet")) {
                            	if (inventory.contains("Bin scrap")) {
                            		if (inventory.contains("Bin scrap")) {
                            			System.out.println("You crafted a HELMET POGCHAMP");
                            			inventory.add("Helmet");
                            			inventory.remove("Bin scrap");
                            			inventory.remove("Bin scrap");
                            		}
                            	}
                            }
                            if (craft.equalsIgnoreCase("Armour")) {
                            	if (inventory.contains("Bin scrap")) {
                            		if (inventory.contains("Bin scrap")) {
                            			if (inventory.contains("Cardboard")) {
	                            			System.out.println("You crafted AMOUR POGCHAMP");
	                            			inventory.add("Armour");
	                            			inventory.remove("Bin scrap");
	                            			inventory.remove("Bin scrap");
	                            			inventory.remove("Cardboard");
                            		}
                            	}
                            }
                            }
                            }
                        }
                    }
                } while (zombieHearts > 0);
            } while (i < 100);
        }
    }
}
}

		
