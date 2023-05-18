package flashcard;

import java.util.Scanner;

public class CardEditor implements IApp {

    @Override
    public String getTitle() {
        return "  Editor";
    }

    @Override
    public void printMenu() {
        getTitle();
        System.out.println("1). Add Card ");
        System.out.println("2). Delete Card ");
        System.out.println("0). Back ");
    }

    @Override
    public void launch() {
        Main.printLine();
        Scanner scan = new Scanner(System.in);
        while (true) {
            printMenu();
            String index = scan.nextLine();
            switch (index) {
                case "1": {
                    System.out.print("Enter add question: ");
                    String question = scan.nextLine();
                    System.out.print("Enter add answer: ");
                    String answer = scan.nextLine();
                    Main.cardManager.addNewCard(question, answer);
                    break;
                }
                case "2": {
                    System.out.print("Enter delete question number: ");
                    String number = scan.nextLine();
                    if (Integer.parseInt(number) <= Main.cardManager.getCardSize()) {
                        Main.cardManager.deleteCard(Integer.parseInt(number) - 1);
                    } else {
                        System.out.println("There is no card with that number.");
                    }
                    break;
                }
                case "0": {
                    return;
                }
                default: {
                    System.out.println("Wrong input. Try again.");
                    break;
                }
            }
        }
    }
}
