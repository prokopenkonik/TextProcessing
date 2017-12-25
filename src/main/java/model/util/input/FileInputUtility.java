package model.util.input;

import model.entities.Text;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileInputUtility {
    private static final String FILE_NAME = "text.txt";

    public static Text inputTextFromFile() {
        Text text = new Text();
        try (BufferedReader br = new BufferedReader(
                new FileReader(FILE_NAME))) {
            StringBuilder readText = new StringBuilder();
            br.lines().forEach(readText::append);
            text.setTextValue(readText.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return text;
    }
}
