public class ExpandableArray {

    private int CURRENT_NUMBER_OF_KENNELS;
    private Cat[] cats;
    private int length;
    private final int kennelsAvailible = (length - CURRENT_NUMBER_OF_KENNELS);
    private double percentOfKennelsFull;

    public ExpandableArray() {
        CURRENT_NUMBER_OF_KENNELS = 2;
        cats = new Cat[CURRENT_NUMBER_OF_KENNELS];
        length = 0;
    }

    public int add(final Cat cat) {
        expandArray();
        cat.setId(length);
        cats[length] = cat;
        ++length;
        return 0;
    }

    public int removeCat(final Cat cat) {
        if (cats[cat.getId()] != null) {
            for (int i = cat.getId(), j = cat.getId() + 1; i < length; ++i, ++j) {
                cats[i] = cats[j];
                cats[i].setId(i);
                cats[j] = null;
            }
            shrinkArray();
            return 0;
        } else {
            return -1;
        }
    }

    public int remove(final int id) {
        if (cats[id] != null) {
            for (int i = id, j = id + 1; i < length; ++i, ++j) {
                cats[i] = cats[j];
                cats[i].setId(i);
                cats[j] = null;
            }
            shrinkArray();
            return 0;
        } else {
            return -1;
        }
    }

    public void displayReport() {
        if (length == 0) {
            System.out.println("No cats in the kennel");
        } else {
            System.out.println("There are: " + kennelsAvailible + " kennels available.");
            for (int i = 0; i < length; ++i) {
                System.out.println(cats[i]);
            }
        }
    }

    private double percentOfKennelsFull() {
        if (CURRENT_NUMBER_OF_KENNELS != 0) {
            percentOfKennelsFull = (length / CURRENT_NUMBER_OF_KENNELS);
        }
        return 0;
    }

    private void expandArray() {
        if (length == CURRENT_NUMBER_OF_KENNELS && length > 1 && CURRENT_NUMBER_OF_KENNELS > 1) {
            final Cat[] temp = new Cat[(CURRENT_NUMBER_OF_KENNELS / 2)];
            for (int i = 0, j = 0; i < CURRENT_NUMBER_OF_KENNELS; ++i, ++j) {
                cats[i] = temp[j];
                cats = temp;
                temp[j] = null;
            }
            CURRENT_NUMBER_OF_KENNELS = (CURRENT_NUMBER_OF_KENNELS / 2);
        }
    }

    private void shrinkArray() {
        if (percentOfKennelsFull <= .25 && length >= 4) {
            final Cat[] temp = new Cat[(CURRENT_NUMBER_OF_KENNELS / 2)];
            for (int i = 0, j = 0; i < CURRENT_NUMBER_OF_KENNELS; ++i, ++j) {
                cats[i] = temp[j];
                cats = temp;
                temp[j] = null;
            }
            CURRENT_NUMBER_OF_KENNELS = (CURRENT_NUMBER_OF_KENNELS / 2);
        }
    }

}
