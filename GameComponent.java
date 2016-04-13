package se.liu.ida.leope892.tddd78_project;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GameComponent extends JComponent
{
    private List<GameObject> goList;

    public GameComponent(final List goList) {
	this.goList = goList;


    }

    @Override protected void paintComponent(Graphics g) {
	super.paintComponent(g);
	final Graphics2D g2d = (Graphics2D) g;
	for (GameObject o : goList) {
	    g2d.setColor(Color.RED);
	    g2d.draw(o.getSprite());
	    g2d.setColor(Color.BLUE);
	    g2d.fill(o.getSprite());
	}
    }
}
