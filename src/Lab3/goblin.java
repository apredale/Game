package Lab3;

public class goblin extends NPC {
	public goblin() {
		super("goblin","An angry looking goblin blocks your path");
	}
	int a = 0;
	public void talk() {
		switch(a) {
		case 1:
		say("You can't go through this door because I said so");
		String[] options = {
				"Why not",
				"please can I go through"
		};
		getResponse(options);
		case 2:
		say("I'm not letting you through this door");
		String[] options2 = {
			"well if your going to be mean Im just going to move you",
			"Alright your annoying im just going through the other door."
		};
		getResponse(options2);
		}
	}
	public void response(int option) {
		switch(option) {
		case 1:
			say("becase I said so you got a hearing problem");
			break;
		case 2:
			say("Ok beacuse you asked nicely ill let you go through");
			Game.print("The golbin moved you can now go through the door in you would like");	
			break;
		case 3:
			say("No you can't move me I'm a goblin");
			Game.print("you and the golbin get in a fight and you move the goblin");
			break;
		case 4:
			say("Wait, wait, wait why don't you want to go through my door.");
		}
		
		
	}
}
