package model.entities;

import model.util.Parser;
import java.util.List;

public class Text {
    private List<Sentence> sentences;

    public Text() {
    }

    public Text(String textValue) {
        setTextValue(textValue);
    }

    public void setTextValue(String textValue) {
        sentences = new Parser().parseText(textValue);
    }

    public List<Sentence> getSentences() {
        return sentences;
    }

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        sentences.forEach(x-> result.append(x).append("\n"));
        return result.toString();
    }
}
