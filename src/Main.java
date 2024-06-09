import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension d = toolkit.getScreenSize();
        DrawingWindow drawingWindow = new DrawingWindow(d);
        MainWindow w1 = new MainWindow(drawingWindow, d);
        w1.setVisible(true);
    }
}