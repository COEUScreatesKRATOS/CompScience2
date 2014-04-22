public class Kennel {

    private static final int KENNEL_CAPACITY = 10;
    private final Cat[] cats;
    private int catCounter;
    private int kennelsAvailible;

    public Kennel() {
        cats = new Cat[KENNEL_CAPACITY];
        catCounter = 0;
        kennelsAvailible = (KENNEL_CAPACITY - catCounter);
    }

    public int addCat(final Cat cat) {
        if (catCounter == KENNEL_CAPACITY) {
            return -1;
        }

        cat.setId(catCounter);
        cats[catCounter] = cat;
        ++catCounter;
        kennelsAvailible = KENNEL_CAPACITY - catCounter;

        return 0;
    }

    public int removeCat(final int id) {
        if (cats[id] != null) {
            for (int i = id, j = id + 1; i < catCounter; ++i, ++j) {
                cats[i] = cats[j];
                cats[i].setId(i);
            }
            return 0;
        } else {
            return -1;
        }
    }

    public void displayReport() {
        if (catCounter == 0) {
            System.out.println("No cats in the kennel");
        } else {
            System.out.println("There are: " + kennelsAvailible + " kennels available.");
            for (int i = 0; i < catCounter; ++i) {
                System.out.println(cats[i]);
            }
        }
    }
}
