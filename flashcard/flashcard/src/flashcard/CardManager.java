package flashcard;

import java.util.ArrayList;
import java.util.Scanner;

//object uudin tsugluulgiiig udirdah 
//tedgeert yzn buriin method nemeh

public class CardManager implements ICardManager {
    public ArrayList<Card> cards = new ArrayList<>();
    FileIO file = new FileIO();
    Scanner input = new Scanner(System.in);

    public CardManager() {
        ArrayList<String> allLines = file.ReadAllLines();
        for (String line : allLines) {
            String[] item = line.split("-");
            if (item.length == 2) {
                Card card = new Card(item[0], item[1]);
                cards.add(card);
            }
        }
    }
    @Override
    public String getCardQuestion(int index) {
        return cards.get(index).getQuestion();
    }

    @Override
    public boolean validateCardReply(String Answer, int index) {
        if (Answer.equals(cards.get(index).getReply()))
            return true;
        else
            return false;
    }

    @Override
    public ArrayList<Card> getAllCards() {
        return cards;
    }

    @Override
    public void printAllCards() {
        if (cards.size() == 0) {
            System.out.println("THERE IS NO CARD!");
        } else {
            for (int i = 0; i < cards.size(); i++) {
                System.out.println(i + 1 + ")." + cards.get(i).toString());
            }
        }
    }

    @Override
    public void addNewCard(String q, String r) {
        if (!file.insertLine(q + '-' + r)) {
            System.out.println("Add failed");
            return;
        }
        System.out.println("Card added");
        Card card = new Card(q, r);
        cards.add(card);
    }

    @Override
    public void deleteCard(int index) {
        if (file.removeLine(cards.get(index).getQuestion() + '-' + cards.get(index).getReply())) {
            System.out.println("Card deleted");
        }
        cards.remove(index);
    }

    @Override
    public int getCardSize() {
        return cards.size();

    }
}
