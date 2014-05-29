import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {
    int wordCount = 0;
    int charCount = 0;
    int lineCount = 0;
    String s = "";

    public FileReader() {
        this.count(s);
    }

    // public String fileName() {
    // }

    public void count(final String s) {

        Scanner reader = null;
        try {
            reader = new Scanner(new File(s));
        } catch (final FileNotFoundException e) {
            System.out.println("File not found");
            System.exit(0);
        }

        while (reader.hasNextLine()) {

            final String nxtLine = reader.nextLine();
            for (int i = 0; i < nxtLine.length(); i++) {
                final char C = Character.toUpperCase(reader.nextLine().charAt(i));
                if (C == ' ') {
                    wordCount++;
                }
                charCount++;
            }
            lineCount++;
        }
        reader.close();
    }

    @Override
    public String toString() {
        return "word count:" + wordCount + "Character Count:" + charCount + "line Count:" + lineCount;

    }
}
