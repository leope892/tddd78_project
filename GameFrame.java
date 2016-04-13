package se.liu.ida.leope892.tddd78_project;

import javax.swing.*;
import java.awt.*;
import java.util.List;

public class GameFrame extends JFrame
{
    private GameComponent comp;
    private List goList;

    public GameFrame(final String title, final List goList){
	super(title);
	this.comp = new GameComponent(goList);
	this.setSize(new Dimension(500, 500));
	this.add(this.comp);
	this.pack();
	this.setVisible(true);

    }
}
