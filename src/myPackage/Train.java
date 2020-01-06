package myPackage;

public class Train extends Vehicle
{
	private int num_of_wagons;
	
	//c'tor
	public Train(int num, int num_of_wagons)
	{
		super(num);
		this.num_of_wagons = num_of_wagons;
	}

	@Override
	public String toString() {
		return super.toString() + "Train [Number of wagons=" + num_of_wagons + "]";
	}
	


}
