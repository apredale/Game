package Lab3;

import java.util.ArrayList;
import java.util.Scanner;

public class Game {
	static ArrayList<Item> inventory = new ArrayList<Item>();
	public static void main(String[] args) {
		runGame();
	}
	public static Room currentRoom = World.buildWorld();
	public static void runGame() {
		Scanner input = new Scanner(System.in);
		
		String command;
		// player's command
		do {
			System.out.println(currentRoom);
			System.out.print("Where do you want to go? ");
			command = input.nextLine();
			String[] words = command.split(" ");
			switch(words[0]) {
			case "e":
			case "w":
			case "n":
			case "s":
			case "u":
			case "d":
				Room nextRoom = currentRoom.getExit(command.charAt(0));// player's command
				if (nextRoom == null || nextRoom.getlock())
					System.out.println("you can't go that way");
				else
					currentRoom = nextRoom;
				break;
			case "x":
				System.out.println("Thanks for walking through my game!");
				break;
			case "i":
				for(int i= 0; i<= inventory.size()-1;i++) {
					System.out.println(inventory.get(i));
				}
				break;
			case "look":
				System.out.println("yout are trying to look at the "+words[1]);
				Item a = currentRoom.getItem(words[1]);
				String b = null;
				for(int i= 0; i<= inventory.size()-1;i++) {
					if(inventory.get(i).getname().equals(words[1])){
					b = "hi";
					}
				}
				if(a == null && b== null) {
					System.out.println("Sorry there is no item there");
				}else {
					System.out.println(currentRoom.getItem(words[1]));
				}
				break;
			case "take":
				System.out.println("you are trying to take the "+words[1]+"");
				Item i = currentRoom.getItem(words[1]);
				if(i==null) {
					System.out.println("Sorry there is no item here");
				
				}else{
					currentRoom.removeItem(words[1]);
					inventory.add(currentRoom.getItem(words[1]));
					System.out.println("you pick up the "+ words[1] +" ");
				}break;
			
				
			default:
				System.out.println("I don't know what that means.");
			}
			
		} while(!command.equals("x"));
		
		input.close();
	}
	public static void print(Object obj) {
		System.out.println(obj.toString());
	}
	public static Room getcurrtRoom() {
		return currentRoom;		
	}
	public static void inv(String a) {
		for(int i = 0; i < inventory.size(); i++) {
			if(a == inventory.get(i).getname()) {
				System.out.println(inventory.get(i).getname());
			}
			else {
				System.out.println("You don't have that item");
			}
		}
		
	}
	}

//public static void main(String[] args) {
	
	//Room currentRoom = World.buildWorld();
	//System.out.println(currentRoom);
	//System.out.println("\nNow we'll move east!");
	//currentRoom = currentRoom.getExit('e');
	//System.out.println(currentRoom);
	//System.out.println("\nNow we'll move west!");
	//currentRoom = currentRoom.getExit('w');
	//System.out.println(currentRoom);
	//System.out.println("\nNow we'll move north!");
	//currentRoom = currentRoom.getExit('n');
	//System.out.println(currentRoom);
	//System.out.println("\nNow we'll move south!");
	//currentRoom = currentRoom.getExit('s');
	//System.out.println(currentRoom);
	//System.out.println("\nNow we'll move up!");
	//currentRoom = currentRoom.getExit('u');
	//System.out.println(currentRoom);
	//System.out.println("\nNow we'll move down!");
	//currentRoom = currentRoom.getExit('d');
	//System.out.println(currentRoom);
	//}


