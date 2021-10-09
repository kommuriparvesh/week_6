package builder;

import java.util.*;

public class ChalkFactory{
	String name;
	List<String> process;
	
	void addProcess(List<String> process) {
		this.process = process;
	}
 
	void prepare() {
		System.out.println("Prepare " + name);
		for (String processs : process) {
			System.out.println(processs);
		}
	}
	void box() {
		System.out.println(name+" is packed.");
	}
 
	public void setName(String name) {
		this.name = name;
	}

	public String toString() {
		StringBuffer display = new StringBuffer();
		display.append("---- " + this.name + " ----\n");
		for (String processs : process) {
			display.append(processs+ "\n");
		}
		return display.toString();
	}
}
