package flashcard;

import java.util.ArrayList;

public class Card {
    private String Question;
    private String Reply;
    public ArrayList<String> cardList;

    public Card(String q, String r) {
        Question = q;
        Reply = r;
    }

    public Card() {
    }

    public String getQuestion() {
        return Question;
    }

    public String getReply() {
        return Reply;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public void setReply(String reply) {
        Reply = reply;
    }

    public String toString() {
        return Question + "-" + Reply;
    }
}
