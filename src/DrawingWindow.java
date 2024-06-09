import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

public class DrawingWindow extends Window implements MouseListener, MouseMotionListener {
    ArrayList<Figure> masFigure;

    int x1, y1, x2, y2;

    FigureType f;

    Figure figure;

    public DrawingWindow(Dimension d) {
        super(d);
        addMouseListener(this);
        addMouseMotionListener(this);
        this.setBounds(d.width * 3 / 4 - x / 2, d.height / 2 - y / 2, x, y);
        masFigure = new ArrayList<Figure>();
    }
    public void start(FigureType f) {
        this.f = f;
    }


    public void paint(Graphics g) {

        int w = getWidth();
        int h = getHeight();
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, w, h);

        for (Figure fig : masFigure) {
            fig.print(g);
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        switch (this.f) {
            case LINE -> figure = new Line(x1, y1, x2, y2);
            case OVAL -> figure = new Oval(x1, y1, x2, y2);
            case RECTANGLE -> figure = new Rect(x1, y1, x2, y2);
        }

        masFigure.add(figure);
        repaint();
    }

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

    @Override
    public void mouseDragged(MouseEvent e) {}

    @Override
    public void mouseMoved(MouseEvent e) {}
}
