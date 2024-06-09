import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Window extends JFrame {

    int x, y;
    public Window(Dimension dimension)
    {
        super();
        x = 700;
        y = 500;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    
}
