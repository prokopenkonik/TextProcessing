package execute;

import control.Controller;
import model.entities.Text;
import model.util.input.FileInputUtility;
import view.ConsoleViewer;
import view.Viewer;

public class Main {
    public static void main(String[] args) {
        Text text = FileInputUtility.inputTextFromFile();
        Viewer viewer = new ConsoleViewer();
        new Controller(viewer, text).run();
    }
}
