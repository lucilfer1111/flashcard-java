package flashcard;

import java.util.ArrayList;

public interface ICardManager {
    public int getCardSize();

    public String getCardQuestion(int index);
    public boolean validateCardReply(String Question, int index);
    public ArrayList<Card> getAllCards();
    public void printAllCards();
    public void addNewCard(String q, String r);
    public void deleteCard(int index);
}