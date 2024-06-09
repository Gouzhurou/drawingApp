import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends Window {

    private DrawingWindow drawingWindow;

    public MainWindow(DrawingWindow drawingWindow, Dimension d) {
        super(d);
        this.setBounds(d.width / 4 - x / 2, d.height / 2 - y / 2, x, y);
        this.setTitle("Painting");
        this.drawingWindow = drawingWindow;

        JPanel panel = new JPanel();
        this.add(panel);

        JButton line = new JButton("Line");
        JButton oval = new JButton("Oval");
        JButton rectangle = new JButton("Rectangle");
        panel.add(line);
        panel.add(oval);
        panel.add(rectangle);

        line.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveToDrawing(FigureType.LINE);

            }
        });

        oval.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveToDrawing(FigureType.OVAL);
            }
        });

        rectangle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                moveToDrawing(FigureType.RECTANGLE);
            }
        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    private void moveToDrawing(FigureType fT) {
        drawingWindow.start(fT);
        drawingWindow.setVisible(true);
    }
}
