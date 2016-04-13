package se.liu.ida.leope892.tddd78_project;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class Block implements GameObject
{
    int positionX;
    int positionY;
    int width;
    int height;
    Shape sprite;


    public Block(final int positionX, final int positionY, final int width, final int height) {
	this.positionX = positionX;
	this.positionY = positionY;
	this.width = width;
	this.height = height;
	this.sprite = new Rectangle2D.Float(positionX, positionY, 20, 20);;
    }

    public int getPositionX() {
	return positionX;
    }

    public int getPositionY() {
	return positionY;
    }

    public int getWidth() {
	return width;
    }

    public int getHeight() {
	return height;
    }

    @Override public Shape getSprite() {
	return sprite;
    }
}
