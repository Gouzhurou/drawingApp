import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Line extends JPanel implements Figure {

    int x1, y1, x2, y2;

    Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
    }

    @Override
    public void print(Graphics g) {
        g.setColor(Color.MAGENTA);
        g.drawLine(this.x1, this.y1, this.x2, this.y2);
    }

}
