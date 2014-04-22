import java.util.Scanner;

public class KennelDriver {

    public static void main(final String[] args) {

        System.out.println("Welcome to Catfriends league!! Please choose from an option below");
        System.out.println("A) Insert a new cat");
        System.out.println("B) Remove cat from exhistance in the array of kennels");
        System.out.println("C) Display Report");
        System.out.println("D) Exit the Program");

        final Scanner UI = new Scanner(System.in);

        final Kennel kennel = new Kennel();
        String line;
        mainLoop: while ((line = UI.nextLine()) != null && line.trim().length() > 0) {

            switch (Character.toUpperCase(line.trim().charAt(0))) {
                case 'A':
                    final Cat newCat = new Cat();
                    if (kennel.addCat(newCat) == -1) {
                        System.out.println("Im sorry it turns out we dont have room for your cat at this time");
                        break;
                    } else {
                        System.out.println("Thanks for boarding your cat with us, please add your cats information");
                    }

                    System.out.println("What is your cats name?");
                    newCat.setName(UI.nextLine());
                    System.out.println("What is your cats age?");
                    newCat.setAge(Integer.valueOf(UI.nextLine()));
                    System.out.println("What is your cats sex? [M/F]");
                    newCat.setSex(UI.nextLine().charAt(0));
                    System.out.println("What is your name?");
                    newCat.setOwnerName(UI.nextLine());
                    System.out.println("What is your phone number?");
                    newCat.setPhone(Integer.valueOf(UI.nextLine()));
                    break;
                case 'B':
                    System.out.println("Whats the ID for the cat leaving the kennel?");
                    int catId;
                    if (kennel.removeCat((catId = Integer.valueOf(UI.nextLine()))) == -1) {
                        System.out.println("Could not remove cat with id: " + catId);
                    } else {
                        System.out.println("Successfully removed cat: " + catId);
                    }
                    break;
                case 'C':
                    System.out.println("Kennel Report");
                    kennel.displayReport();
                    break;
                case 'D':
                    break mainLoop;

            }
            System.out.println("Welcome to Catfriends league!! Please choose from an option below");
            System.out.println("A) Insert a new cat");
            System.out.println("B) Remove cat from exhistance in the array of kennels");
            System.out.println("C) Display Report");
            System.out.println("D) Exit the Program");

        }

        System.out.println("Thank you for using KennelSoft.. have a nice day!");
    }
}
