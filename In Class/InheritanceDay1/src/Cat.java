import java.util.Date;

public class Cat extends Pet 
{
	//Data Members
	private static int catPopulation = 0;
	
	public Cat()
	{
		super();
		this.setName("kitty");
		catPopulation++;
	}
	
	public Cat(String n, int a, char s, String on, String p)
	{
		super(n, a, s, on, p);
		catPopulation++;
	}
	
	
	public String toString()
	{
		return "Cat's Information:\n" + "ID: " + this.getID() +"\nName: " + this.getName() + "\nAge: " + this.getAge() + "\n";
	}
	
	public boolean equals(Cat otherCat)
	{
		if(this.getID() == otherCat.getID())
		{
			return true;
		}
		return false;		
	}
	
	
	public static int getCatPopulation()
	{
		return catPopulation;
	}
	
	public void makeSound()
	{
		super.makeSound();
		System.out.println("Meow Meow");
	}
}
