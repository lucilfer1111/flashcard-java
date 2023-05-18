package flashcard;

import java.util.Scanner;

//togloomiin ywts udirdana
public class Play implements IApp {
    Scanner input = new Scanner(System.in);

    @Override
    public String getTitle() {
        return "  Play ";
    }

    @Override
    public void printMenu() {
        getTitle();
    }

    public void launch() {
        Main.printLine();
        printMenu();
        int count = 0;
        System.out.println("how many question do you want ?");
        String a = input.nextLine();
        if (Integer.parseInt(a) > Main.cardManager.getCardSize()) {
            System.out.println("here is no such number of cards");
            return;
        }

        for (int i = 0; i < Integer.parseInt(a); i++) {
            System.out.print(i + 1 + ")." + Main.cardManager.getCardQuestion(i) + ": ");
            String answer = input.nextLine();
            if (Main.cardManager.validateCardReply(answer, i)) {
                System.out.println("!!correct");
                count++;
            } else
                System.out.println("!! Wrong");
        }

        System.out.println("Congratulation your score is " + count + "/" + Integer.parseInt(a));
    }

}
