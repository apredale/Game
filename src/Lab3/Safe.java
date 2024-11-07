package Lab3;


public class Safe extends Item{
	public Safe(String name,String desc) {
		super(name,desc);
	}
	
	public void open() {
		for(int i = 0; i <= Game.inventory.size(); i++) {
			String a = "combo";
			if(Game.inventory.get(i).getname() == a) {			
				System.out.println("You found a diamond");
				 Game.inventory.add(new Item("diamond","shiny valuable rock"));
			}else {
				System.out.println("The safe is locked and you don't have the combination");
			}
		}
	}
}


