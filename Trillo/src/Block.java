import java.awt.Rectangle;

import javax.imageio.ImageIO;

import java.awt.Image;
import java.awt.Component;
import java.awt.Graphics;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Block extends Rectangle {
    private Image pic;
    private boolean destoryed;
    String s;

    // x - x coordinate. y - y coordinate. w - weight, h - height s - location of
    // the image
    public Block(int x, int y, int w, int h, String s) {
        this.x = x;
        this.y = y;
        this.width = w;
        this.height = h;
        this.s = s;
        try {
            pic = ImageIO.read(new File(s));
        } catch (IOException e) {
            System.out.println(e.toString());
        }

    }

    public void draw(Graphics g, Component c) {
        if (!this.destoryed) {
            g.drawImage(pic, this.x, this.y, this.width, this.height, c);
        }
    }
}
