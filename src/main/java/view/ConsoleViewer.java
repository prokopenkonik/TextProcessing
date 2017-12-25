package view;

public class ConsoleViewer implements Viewer {
    @Override
    public void showMessage(String message) {
        System.out.print(message);
    }
}
