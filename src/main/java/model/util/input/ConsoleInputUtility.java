package model.util.input;

import view.Viewer;
import java.util.Scanner;
import static view.constants.Menu.WRONG_INPUT;

public class ConsoleInputUtility {
    private static Scanner sc = new Scanner(System.in);

    public static String inputString(Viewer viewer, String message) {
        viewer.showMessage(message);
        while (!sc.hasNext()) {
            showErrorAndSkip(viewer, message);
        }
        return sc.nextLine();
    }

    public static int inputInt(Viewer viewer, String message) {
        viewer.showMessage(message);
        while (!sc.hasNextInt()) {
            showErrorAndSkip(viewer, message);
        }
        return sc.nextInt();
    }

    private static void showErrorAndSkip(Viewer viewer, String message) {
        viewer.showMessage(WRONG_INPUT + message);
        sc.next();
    }
}
