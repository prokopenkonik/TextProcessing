package model.util;

import model.entities.Sentence;
import model.entities.Symbol;
import model.entities.Word;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    private static final String WORD_DELIMITERS = "\\s?\\p{P}?\\s+";
    private static final String SENTENCE_DELIMITER = "[^.!?]+[.!?]\\s?";

    public List<Symbol> parseWord(String word) {
        List<Symbol> result = new ArrayList<>();
        for (int i = 0, length = word.length(); i < length; i++) {
            result.add(new Symbol(word.charAt(i)));
        }
        return result;
    }

    public List<Word> parseSentence(String sentence) {
        List<Word> result = new ArrayList<>();
        Arrays.stream(sentence.split(WORD_DELIMITERS)).forEach(x -> result.add(new Word(x)));
        return result;
    }

    public List<Sentence> parseText(String text) {
        List<Sentence> result = new ArrayList<>();
        Pattern pattern = Pattern.compile(SENTENCE_DELIMITER);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            result.add(new Sentence(matcher.group()));
        }
        return result;
    }
}
