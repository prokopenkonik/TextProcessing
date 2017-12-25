package model.entities;

import model.util.Parser;
import java.util.ArrayList;
import java.util.List;

public class Sentence {
    private String value;
    private List<Word> words;

    public Sentence() {
    }

    public Sentence(String sentenceValue) {
        setSentenceValue(sentenceValue);
    }

    public void setSentenceValue(String sentenceValue) {
        value = sentenceValue;
        words = new Parser().parseSentence(value);
    }

    public List<Word> getWords() {
        return new ArrayList<>(words);
    }

    public void replaceWordsByLength(Word newWord, int length) {
        StringBuilder newSentenceValue = new StringBuilder(value);
        int index;
        for (Word word : words) {
            if (word.getLength() == length) {
                index = newSentenceValue.indexOf(word.toString());
                newSentenceValue.replace(index, index + length, newWord.toString());
            }
        }
        setSentenceValue(newSentenceValue.toString());
    }

    @Override
    public String toString() {
        return value;
    }
}
