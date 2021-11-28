package snake;

import java.awt.event.ActionListener;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.Timer;
public class Panel extends JPanel implements ActionListener {

    private Color drawC = new Color(0, 255, 0);
    Timer timer;

    public Panel() {
        super.setSize(300, 300);
        this.addKeyListener(new MyKeyAdapter());
        this.setFocusable(true);

        timer = new Timer(150, this);
        timer.start();
    }

    protected void paintComponent(Graphics g) {
        setOpaque(false);
        g.setColor(drawC);
        g.fillOval(100, 100, 50, 50);
    }

//    public void setColor(Color c) {
//        drawC = c;
//        repaint();
//    }
    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    public class MyKeyAdapter extends KeyAdapter {

        @Override
        public void keyPressed(KeyEvent e) {
            switch (e.getKeyCode()) {
                case KeyEvent.VK_B:
                    drawC = new Color(0, 0, 255);
                    break;
                case KeyEvent.VK_R:
                    drawC = new Color(255, 0, 0);
                    break;
                case KeyEvent.VK_G:
                    drawC = new Color(0, 255, 0);
                    break;
            }
        }
    }
}
