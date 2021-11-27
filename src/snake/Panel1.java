/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseListener;
import javax.swing.JPanel;
import java.awt.event.MouseEvent;

/**
 *
 * @author admin
 */
public class Panel1 extends JPanel implements MouseListener {

    private Color drawColor = new Color(0, 255, 0);

    public Panel1() {
        setOpaque(false);
        super.setSize(300, 300);
        super.setFocusable(true);
        super.addMouseListener(this);
    }
    public void setColor(Color c) {
//        drawColor = c;
//        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(drawColor);
        g.fillOval(100, 100, 50, 50);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        drawColor = new Color(0, 0, 255);
        repaint();
    }

    @Override
    public void mousePressed(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseReleased(MouseEvent e) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        drawColor = new Color(255, 0, 0);
        repaint();
    }

    @Override
    public void mouseExited(MouseEvent e) {
        drawColor = new Color(0, 255, 0);
        repaint();
    }
}
