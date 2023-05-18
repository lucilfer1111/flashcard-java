package flashcard;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class FileIO implements IFileIO {
    File file = new File("D:\\vscode\\document\\java\\flashcard\\flashcard\\src\\flashcard\\bd1.txt");

    @Override
    public boolean insertLine(String line) {
        try {
            ArrayList<String> cardList = ReadFromFile();
            cardList.add(line);
            SaveToFile(cardList);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public boolean removeLine(String line) {
        try {
            ArrayList<String> cardList = ReadFromFile();
            int i;
            for (i = 0; i < cardList.size(); i++) {
                if (cardList.get(i).equals(line))
                    break;
            }
            cardList.remove(i);

            SaveToFile(cardList);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public ArrayList<String> ReadAllLines() {
        ArrayList<String> cardList = ReadFromFile();
        return cardList;
    }

    private void SaveToFile(ArrayList<String> cardList) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            for (int i = 0; i < cardList.size(); i++) {
                writer.write(cardList.get(i) + "\n");
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private ArrayList<String> ReadFromFile() {
        ArrayList<String> cardList = new ArrayList<String>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = reader.readLine()) != null) {
                cardList.add(line);
            }
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return cardList;
    }

    public void FileWriter(ArrayList<String> cardList) {
    }

    public ArrayList<String> FileReader() {
        return null;
    }

    public void clearFile() throws IOException {
        FileWriter writer = new FileWriter(this.file);
        writer.write("");
        writer.close();
    }

}
