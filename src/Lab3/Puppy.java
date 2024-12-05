package Lab3;

public class Puppy extends NPC{
	public Puppy() {
		super("puppy", " A hideous puppy wage his tail");
	}
	int a = 0;
	public void talk() {
		switch(a) {
		case 1:
		say("Hi! I'm an adorable puppy!");
		String[] options = {
			"Yes you are! Who's a good boy?",
			"Ew, no, You're actually kinda hideous."
			};
		getResponse(options);
		case 2:
		say("Hey! Wanna play fetch?");
		String[] options2 = {
			"Yes! Ilove fetch!",
			"No. I am horrible person and don't like playing with puppies."
			};
		getResponse(options2);
		}
	}
	public void response(int option) {
		switch(option) {
		case 1:
			say("I am! I'm a good boy!");
			break;
		case 2:
			say("I am adorable! why are you so mean?");
			Game.print("The puppy bites you. You deserve it.");
			break;
		case 3:
			say("Yay! Fetch!");
			Game.print("The puppy runs off with a ball. You pick up the ball.");
			break;
		case 4: 
			say("You're a bad person! I don't like you!");
			Game.print("The puppy runs away and doesn't come back");
			break;
		case 5:
			say("Yip!");
		}
			
	}
	
}
