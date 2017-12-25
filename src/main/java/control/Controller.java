package control;

import model.entities.Sentence;
import model.entities.Text;
import model.entities.Word;
import model.util.input.ConsoleInputUtility;
import view.Viewer;

import static view.constants.Menu.*;

public class Controller {
    private Viewer viewer;
    private Text text;

    public Controller(Viewer viewer, Text text) {
        this.viewer = viewer;
        this.text = text;
    }

    public void run() {
        viewer.showMessage(ORIGINAL_TEXT_INFO);
        viewer.showMessage(text.toString());

        Word newWord = new Word(ConsoleInputUtility.inputString(
                viewer, INPUT_NEW_WORD_COMMAND));
        int length = ConsoleInputUtility.inputInt(viewer, INPUT_LENGTH_COMMAND);

        for (Sentence sentence : text.getSentences()) {
            sentence.replaceWordsByLength(newWord, length);
        }

        viewer.showMessage(MODIFIED_TEXT_INFO);
        viewer.showMessage(text.toString());
    }
}
