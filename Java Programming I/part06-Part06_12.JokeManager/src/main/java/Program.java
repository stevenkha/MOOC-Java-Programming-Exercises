
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JokeManager jokes = new JokeManager();
        UserInterface startMenu = new UserInterface(jokes, scanner);
        startMenu.start();

    }
}
