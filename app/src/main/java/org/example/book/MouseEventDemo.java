package org.example.book;

import java.awt.*;
import java.awt.event.*;

public class MouseEventDemo extends Frame implements MouseListener, MouseMotionListener {

    String msg = "";
    int mouseX = 0, mouseY=0;
    
    public MouseEventDemo() {
        addMouseListener(this);
        addMouseMotionListener(this);
        
        addWindowListener(new WindowAdapter(){
            public void windowClosing(WindowEvent we){
                System.exit(0);
            }
        });
    }

    public void mouseClicked(MouseEvent me)
    {
        msg = msg + "-- click received";
        repaint();
    }
    public void mouseEntered(MouseEvent me)
    {
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse entered";
        repaint();
    }
    public void mouseExited(MouseEvent me)
    {
        mouseX = 100;
        mouseY = 100;
        msg = "Mouse exited";
        repaint();
    }
    public void mousePressed(MouseEvent me)
    {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "button Down";
        repaint();
    }
    public void mouseReleased(MouseEvent me)
    {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "button Released";
        repaint();
    }
    public void mouseDragged(MouseEvent me)
    {
        mouseX = me.getX();
        mouseY = me.getY();
        msg = "*" + "Dragged at" + mouseX + ", " + mouseY;
        repaint();
    }
    public void mouseMoved(MouseEvent me)
    {
        msg = "Moving at " + me.getX() + ", " + me.getY();
        repaint();
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.BLUE);
        g.setFont(new Font("Arial", Font.BOLD, 14));
        g.drawString(msg, mouseX, mouseY);
    }

}
