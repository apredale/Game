package Lab3;

public class Item {
	
	private String name;
	private String disc;
	public Item(String a, String b) {
		name = a;
		disc =b;
	}
	
	
	String getname() {
		return name;
	}
	private void setname(String a) {
		name = a;
	}
	private String getdisc() {
		return disc;
	}
	private void setdsic(String a) {
		disc = a;
	}
	public String toString() {
		return name;
	}
}
