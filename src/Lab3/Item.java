package Lab3;
import java.io.*;
public class Item implements Serializable{
	
	private String name;
	private String disc;
	public Item(String a, String b) {
		name = a;
		disc =b;
	}
	public void open() {
		Game.print("You can't open that");
	}
	public void use() {
		Game.print("You can't use that");
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
