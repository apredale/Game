package Lab3;

public class Key extends Item{
	public Key(String name,String desc) {
		super(name,desc);
	}
	public void use() {
		 
		char[] a = {'e','n','s','w','u','d'};
		for(int i = 0; i < a.length;i++) {
			if(Game.currentRoom.getExit(a[i]).getName().equals("room1") && Game.currentRoom.getExit(a[i]).getlock()){
				Game.currentRoom.setlock(false);
			}
		}
	
		 }
}