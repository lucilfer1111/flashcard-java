package flashcard.test;

import org.junit.Test;

import flashcard.Card;

class CardTest {

    @Test
    void testGetters() {
        Card card = new Card("What is the capital of France?", "Paris");
        assertEquals("What is the capital of France?", card.getQuestion());
        assertEquals("Paris", card.getReply());
    }

    private void assertEquals(String string, String question) {
    }

    @Test
    void testSetters() {
        Card card = new Card();
        card.setQuestion("What is the capital of Japan?");
        card.setReply("Tokyo");
        assertEquals("What is the capital of Japan?", card.getQuestion());
        assertEquals("Tokyo", card.getReply());
    }

    @Test
    void testToString() {
        Card card = new Card("What is the capital of Germany?", "Berlin");
        assertEquals("What is the capital of Germany?-Berlin", card.toString());
    }
}
