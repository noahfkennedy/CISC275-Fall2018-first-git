import java.util.*;



public class Dog extends Animal{
	public int legs;
	public String name;

	public Dog(String name, int legs) {
		this.name = name;
		this.legs = legs;
	}

	public int getLegs() {
		return this.legs;
	}

	public String getName() {
		return this.name;
	}


	public String toString() { return (this.name + " has " + this.legs + " legs");}

}


