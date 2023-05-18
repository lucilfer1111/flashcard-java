package flashcard.test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import org.junit.Test;

import flashcard.Card;

public class PlayTest {

    Card card = new Card();

    @Test
    public void testPlay() {
        String result;
        ArrayList<String> cardList = new ArrayList<>();
        ArrayList<String[]> card = new ArrayList<>();
        cardList.add("what is your name?-bat");
        cardList.add("how old are you?-19");
        for (int i = 0; i < cardList.size(); i++) {
            card.add(cardList.get(i).split("-"));
        }
        String a = "what is your name?";
        if (a.equals(card.get(0)[0])) {
            result = "Zow";
        } else
            result = "Buruu";
        assertEquals("Zow", result);

    }

}
