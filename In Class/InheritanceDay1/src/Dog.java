import java.util.Date;


public class Dog extends Pet
{
	//Data Members
	private static int dogPopulation = 0;
	
	public Dog()
	{
		super();
		this.setName("Spot");
		dogPopulation++;
	}

	public Dog(String n, int a, char s, String on, String p)
	{
		super(n, a, s, on, p);
		dogPopulation++;
	}
	//getters: methods that access the data members

	public String toString()
	{
		return "Dog's Information:\n" + "ID: " + this.getID() +"\nName: " + this.getName() + "\nAge: " + this.getAge() + "\n";
	}
	
	public void makeSound()
	{
		super.makeSound();
		System.out.println("woof woof");
	}


}
