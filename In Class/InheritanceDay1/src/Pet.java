import java.util.Date;


public abstract class Pet 
{
	private int id ;
	private String name;
	private int age;
	private char sex;
	private String ownerName;
	private String phone;
	private Date checkIn;
	private Date checkOut;
	private static int petPopulation;

	public Pet()
	{
		this.id = petPopulation;
		this.age = 1;
		this.sex = 'n';
		this.setOwnerName("X");
		this.setPhone("0");
		petPopulation++;
	}
	public Pet(String n, int a, char s, String on, String p)
	{
		this.id = petPopulation;
		this.name = n;
		this.age = a;
		this.sex = s;
		this.ownerName = on;
		this.phone = p;
		this.checkIn = new Date();
		this.checkOut = null;
		petPopulation++;
	}

	public void setName(String newName)
	{
		this.name = newName;
	}
	
	public void setAge(int newAge)
	{
		if( newAge > 0)
		{
			this.age = newAge;
		}
		else
		{
			System.out.println("Invalid age.. setting age to default value.");
			this.age = 1;
		}
	}
	
	public void setSex(char newSex)
	{
		if(newSex == 'f' || newSex == 'm')
		{
			this.sex = newSex;
		}
		else
		{
			System.out.println("Invalid sex value");
			this.sex = 'N';
		}
	}
	
	public void setPhone(String newPhone)
	{
		this.phone = newPhone;
	}
	
	public void setOwnerName(String newName)
	{
		this.ownerName = newName;
	}
	//getters: methods that access the data members
	public int getID()
	{
		return this.id;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public char getSex()
	{
		return this.sex;
	}
	
	public Date getCheckInDate()
	{
		return this.checkIn;
	}
	
	public Date getCheckOutDate()
	{
		return this.checkOut;
	}
	
	public String getOwnerName()
	{
		return this.ownerName;
	}

	public String getPhone()
	{
		return this.phone;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public void makeSound()
	{
		System.out.println("I Go:");
	}

}
