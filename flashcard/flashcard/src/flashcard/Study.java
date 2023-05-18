package flashcard;

import java.util.Scanner;

// card uuda hynah
public class Study implements IApp {
    Scanner input = new Scanner(System.in);

    @Override
    public String getTitle() {
        return "  Study  ";
    }

    @Override
    public void printMenu() {
        getTitle();
    }

    @Override
    public void launch() {
        Main.printLine();
        printMenu();
        study();
        Main.start();
    }

    public void study() {
        System.out.println("---All cards---");
        Main.cardManager.printAllCards();
    }
}
