package flashcard;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static CardManager cardManager;

    public static void main(String[] args) {
        cardManager = new CardManager();
        System.out.println(" *********************");
        System.out.println("  Welcome to Flashcard ! ");
        System.out.println(" *********************");
        start();
    }

    public static void start() {
        printLine();
        ArrayList<IApp> apps = new ArrayList<IApp>();
        apps.add(new Play());
        apps.add(new Study());
        apps.add(new CardEditor());
        Scanner scan = new Scanner(System.in);

        while (true) {
            printLine();
            for (int i = 1; i <= apps.size(); i++) {
                System.out.println(i + ")." + apps.get(i - 1).getTitle());
            }

            System.out.println("0).  Exit  ");
            String choise = scan.nextLine();

            Boolean b = true;
            for (int i = 0; i < choise.length(); i++) {
                if (!Character.isDigit(choise.charAt(i))) {
                    b = false;
                    break;
                }
            }

            if (!b) {
                System.out.println("Wrong input, try again");
            } else if (Integer.parseInt(choise) == 0) {
                System.out.println("!! Bye");
                break;
            }

            else if (!(Integer.parseInt(choise) <= apps.size() && Integer.parseInt(choise) > 0)) {
                System.out.println("Wrong input try again");
            } else
                apps.get(Integer.parseInt(choise) - 1).launch();
        }
        scan.close();
    }

    public static void printLine() {
        System.out.println("---------------------------------------------------------------");
    }

    public static void error() {
        printLine();
        System.out.println(" !!Wrong input. Please try again!!");
    }

    public static void initCardManager() {
    }

}
