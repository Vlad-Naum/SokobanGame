package model;

import java.awt.*;

public class Player extends CollisionObject implements Movable {
    public Player(int x, int y) {
        super(x, y);
    }

    @Override
    public void draw(Graphics graphics) {
        graphics.setColor(Color.GREEN);

        int xc = getX();
        int yc = getY();
        int height = getHeight();
        int width = getWidth();

        graphics.fillOval(xc - width / 2, yc - height / 2, width, height);
    }

    @Override
    public void move(int x, int y) {
        this.setX(this.getX()+x);
        this.setY(this.getY()+y);
    }
}
