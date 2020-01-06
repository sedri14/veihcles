package myPackage;

import java.util.Vector;

public abstract class Vehicle {
	
	protected long num;

	
	//c'tor
	public Vehicle(int num)
	{
		this.num = num;
	}
	

	@Override
	public String toString() {
		return "Vehicle [Number=" + num + "] ";
	}
	
	public static void printArray(Vector<Vehicle> arr)
	{
		
		for(Vehicle v : arr)
		{
			System.out.println(v);
		}
	}
	
	
	public static void main(String[] args) 
	{
		//some objects
		Car c1 = new Car(9763100, "Hatchback");
		Car c2 = new Car(9800051, "Sedan");
		Car c3 = new Car(6548123, "Crossover");
		Car c4 = new Car(1122548, "SUV");
		Train t1 = new Train(1001, 10);
		Train t2 = new Train(1002, 17);
		Train t3 = new Train(1003, 20);
		Train t4 = new Train(1004, 15);
		Train t5 = new Train(1005, 8);
		
		Vector<Vehicle> arr = new Vector<Vehicle>();
		arr.add(c1);
		arr.add(t3);
		arr.add(t1);
		arr.add(c4);
		arr.add(c2);
		arr.add(t5);
		arr.add(t2);
		arr.add(t4);
		arr.add(c3);
		
		printArray(arr);
		
	}
	
}



