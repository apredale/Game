package Lab3;

public class World {
public static Room buildWorld() {
	Room room1 = new Room("You are in room 1. There are two doors on your right and a flashlight on the floor;");
	Room room2= new Room("you are in room 2. There is a puppy in the middle of the room and a door infront of you." ) ;
	Room room3= new Room("you are in room 3. There is a desk  with a key sitting on top of it. and a hatch above and below you" ) ;
	Room room4= new Room("you are in room 4. there is a map folded in the corner of the room there is also only one door infront of you and a hatch above you") ;
	Room room5= new Room("you are in room 5. there is a door on your right and a goblin blocking the door on your right") ;
	Room room6= new Room("you are in room 6. there are no doors and windows but just a safe sitting in the middle of the room") ;
	
	room1.addExit('e',room2);
	room2.addExit('u',room3);
	room3.addExit('n',room4);
	room4.addExit('s',room5);
	room5.addExit('w',room6);
	room6.addExit('d',room1);
	
	Item a =  new Item("desk","you can block off a room with this");
	Item b = new Item("Phone","Small metal box that produces light");
	Item c = new Item("pencil", "can only see invetory if you can right it down");
	Item d = new Item("Map"," you can find a key in room 3");
	Item e = new Item("flashlight","black stick that emits light");
	Item f = new Item("teleporter","you automaticaly travel to room5");
	Item g = new Item("diamond","siny valuable rock");
	NPC h = new NPC("Puppy","a puppy wags his tail");
	NPC i = new NPC("goblin","a goblin blocks you path");
	room1.setItem("Pencil",c);
	room1.setItem("Phone",b);
	room3.setItem("desk", a);
	room1.setItem("Map", d);
	room2.setNPC("Puppy",h);
	room5.setNPC("goblin", i);
	
	Safe safe = new Safe("safe","I wonder whats inside");
	room6.setItem("safe", safe);
	Combination combo = new Combination("safe combo", "12345");
	
	room1.setlock(true);
	
	

	return room1;
	}



}

