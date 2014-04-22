import java.util.Date;

public class Cat {//
    // ID:int
    // name:string
    // age:int
    // gender:char
    // ownerName:string
    // phone: int
    // checkinDate: Date class from java lib
    // All these are data members, do not use new data to test use driver

    private int id;
    private String name;
    private int age;
    private char sex;
    private String ownerName;
    private int phone;
    private Date checkIn;
    private Date checkOut;

    // Constructor with predefined value:
    // public Cat(final int id//, final String name, final String ownerName,
    // final int a, final int s, final String p, final int ph, final Date cI,
    // final Date cO) {
    // this.id = (int)(Math.random()*1000000);
    // this.name;
    // this.ownerName;
    // this.age = (int)(Math.random()*20);
    // this.sex;
    // this.phone = (int)(Math.random()*999999999);
    // this.checkIn = new Date();
    // System.out.println(checkIn);
    // this.checkOut = null;
    // }

    // Setters: methods that modify the data members
    // Getters: methods that access the data members
    public Cat() {

    }

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(final int age) {
        this.age = age;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(final char sex) {
        if (sex == 'M' || sex == 'm') {
            this.sex = 'M';
        } else {
            this.sex = 'F';
        }
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(final String ownerName) {
        this.ownerName = ownerName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(final int phone) {
        this.phone = phone;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(final Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(final Date checkOut) {
        this.checkOut = checkOut;
    }

    @Override
    public String toString() {
        return "Cat's Information:" + "ID Number " + this.id + " Name " + this.name + " Age " + this.age + " Sex " + this.sex;
    }

    public boolean equals(final Cat otherCat) {
        if (this.id == otherCat.id) {
            return true;
        } else {
            return false;
        }

    }

}
