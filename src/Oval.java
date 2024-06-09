import javax.swing.*;
import java.awt.*;

public class Oval extends JPanel implements Figure {

    int width, height, x, y;

    Oval(int x1, int y1, int x2, int y2) {
        this.height = Math.abs(y1 - y2);
        this.width = Math.abs(x1 - x2);

        if (x1 < x2 && y1 < y2) {
            x = x1;
            y = y1;
        }
        else if (x1 < x2 && y1 > y2) {
            x = x1;
            y = y2;
        }
        else if (x1 > x2 && y1 < y2) {
            x = x2;
            y = y1;
        }
        else {
            x = x2;
            y = y2;
        }
    }

    @Override
    public void print(Graphics g) {
        g.setColor(Color.CYAN);
        g.drawOval(x, y, width, height);
    }

}
