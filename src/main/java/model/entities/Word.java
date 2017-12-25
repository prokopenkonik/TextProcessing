package model.entities;

import model.util.Parser;
import java.util.ArrayList;
import java.util.List;

public class Word {
    private String value;
    private List<Symbol> letters;

    public Word() {
    }

    public Word(String wordValue) {
        setWordValue(wordValue);
    }

    public void setWordValue(String wordValue) {
        value = wordValue;
        letters = new Parser().parseWord(value);
    }

    public List<Symbol> getLetters() {
        return new ArrayList<>(letters);
    }

    public int getLength() {
        return value.length();
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && obj.getClass() == this.getClass() && value.equals(obj.toString());
    }

    @Override
    public String toString() {
        return value;
    }
}
