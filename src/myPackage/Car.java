package myPackage;

public class Car extends Vehicle
{
	
	private String type;
	
	//c'tor
	public Car(int num, String type)
	{
		super(num);
		this.type = type;
	}

	@Override
	public String toString() {
		return super.toString() + "Car [Type=" + type + "]";
	}


}
