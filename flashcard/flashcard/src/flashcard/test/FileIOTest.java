package flashcard.test;

import static org.junit.Assert.*;

import java.io.File;
import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import flashcard.FileIO;

public class FileIOTest {
    private File file;
    private FileIO fileIO;

    @Before

    public void setUp() throws Exception {
        file = new File("D:\\vscode\\document\\java\\HelloWorld\\bd1.txt");
        fileIO = new FileIO();
        fileIO.clearFile();
        fileIO.insertLine("line 1");
        fileIO.insertLine("line 2");
    }

    @After
    public void tearDown() throws Exception {
        if (file != null) {
            file.delete();
        }
    }

    @Test
    public void testInsertLine() {
        assertNotNull(fileIO);
        assertTrue(fileIO.insertLine("line 3"));
        assertEquals(3, fileIO.ReadAllLines().size());
    }

    @Test
    public void testRemoveLine() {
        assertNotNull(fileIO);
        assertTrue(fileIO.removeLine("line 1"));
        assertEquals(1, fileIO.ReadAllLines().size());
        assertEquals("line 2", fileIO.ReadAllLines().get(0));
    }

    @Test
    public void testReadAllLines() {
        assertNotNull(fileIO);
        ArrayList<String> expected = new ArrayList<String>();
        expected.add("line 1");
        expected.add("line 2");
        assertEquals(expected, fileIO.ReadAllLines());
    }
}
