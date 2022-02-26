import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(new FileInputStream("src/text"));
        String[] words = scanner.nextLine().split(" ");

        int red = 0, green = 0, yellow = 0;
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals("red"))
                red++;
            else if (words[i].equals("green"))
                green++;
            else if (words[i].equals("yellow"))
                yellow++;
        }

        int total = red + green + yellow;
        System.out.println("Total colors: " + total + "\nRed: " + red + "\nGreen: " + green + "\nYellow: " + yellow);
    }
}

