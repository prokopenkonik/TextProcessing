package model.entities;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SentenceTest {

    private Text text;
    private Word newWord;
    private Sentence sentence;

    @Before
    public void setUp() throws Exception {
        text = new Text("Hello? This is, maybe, second sentence. My name is Nikita! ");
        newWord = new Word("LALALA");
        sentence = new Sentence("Hello - a: b, c. ");
    }

    @Test
    public void replaceWordsByLength() throws Exception {
        Text expectedText = new Text("Hello? This is, maybe, LALALA sentence. My name is LALALA! ");
        for (Sentence sentence : text.getSentences()) {
            sentence.replaceWordsByLength(newWord, 6);
        }
        assertEquals(expectedText.toString(), text.toString());
    }

    @Test
    public void setSentenceValue() throws Exception {
        Assert.assertNull(new Sentence().toString());
    }

    @Test
    public void getWords() throws Exception {
        List<Word> expected = new ArrayList<>();
        expected.add(new Word("Hello"));
        expected.add(new Word("a"));
        expected.add(new Word("b"));
        expected.add(new Word("c"));
        List<Word> actual = sentence.getWords();
        Assert.assertEquals(expected, actual);
    }
}