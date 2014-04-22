
public class Temp 
{
	public static void main(String[] args)
	{
		Pet[] a = new Pet[10];
		
		for(int i=0; i < a.length; i++)
		{
			if(i <= 5)
			{
				a[i] = new Dog();
			}
			else
			{
				a[i] = new Cat();
			}
		}
		
		for(int i=0; i < a.length; i++)
		{
			a[i].makeSound();
			System.out.println(a[i].toString());
		}
	}

}
