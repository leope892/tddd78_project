package se.liu.ida.leope892.tddd78_project;

import java.awt.*;
import java.awt.Image;
import java.awt.geom.Rectangle2D;

public class Player implements GameObject
{
    int positionX;
    int positionY;
    int velocity;
    Shape sprite;

    public Player(final int positionX, final int positionY) {
	this.positionX = positionX;
	this.positionY = positionY;
	this.sprite = new Rectangle2D.Float(positionX,positionY, 20, 20);
	velocity = 0;

    }

    public int getPositionX() {
	return positionX;
    }

    public int getPositionY() {
	return positionY;
    }

    public int getVelocity() {
	return velocity;
    }

    @Override public Shape getSprite() {
	return sprite;
    }
}
