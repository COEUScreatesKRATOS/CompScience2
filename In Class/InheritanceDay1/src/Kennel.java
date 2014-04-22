
public class Kennel {

	private Cat[] theCats;
	private int catCount;
	
	public Kennel()
	{
		theCats = new Cat[10];
		catCount = 0;
	}
	
	public int addCat(Cat c)
	{
		if( catCount < theCats.length)
		{
			theCats[catCount] = c;
			catCount++;
			return 0;
		}
		return -1;
	}
	
	public void displayReport()
	{
		for(int i=0; i < catCount; i++)
		{
			System.out.println(theCats[i]);
		}
	}
}
