package View;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.GridLayout;
import java.awt.Point;
import javax.swing.JFrame;

public class Frame extends JFrame{
    public Frame(){
        initComponent();
    }

    private void initComponent(){
        int height = 700;
        int width = 500;
        Point center = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        this.setBounds(center.x-width/2, center.y-height/2, width, height);
        this.setResizable(false);
        this.setBackground(Color.decode("#F3F3E0"));
        this.setLayout(new GridLayout(0,2));
    }
}
