import javax.swing.*;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ShortListFilter {
public static void main(String[] args) {
        JFileChooser chooser = new JFileChooser();
        int result = chooser.showOpenDialog(null);

        if (result == JFileChooser.APPROVE_OPTION) {
            File file = chooser.getSelectedFile();
            ShortWordFilter filter = new ShortWordFilter();

            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNext()) {
                    String word = scanner.next();
                    if (filter.accept(word)) {
                        System.out.println(word);
                    }
                }
            } catch (IOException e) {
                System.out.println("Error reading file: " + e.getMessage());
            }
        } else {
            System.out.println("No file selected.");
        }
    }
}
