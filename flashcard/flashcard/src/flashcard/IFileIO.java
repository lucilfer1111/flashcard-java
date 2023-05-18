package flashcard;

import java.util.ArrayList;

public interface IFileIO {
    public boolean insertLine(String line);

    public boolean removeLine(String line);

    public ArrayList<String> ReadAllLines();
}