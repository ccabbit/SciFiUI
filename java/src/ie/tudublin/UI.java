package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class UI extends PApplet
{
    Plate p;
    MovingSS ms;
	PImage img;

    boolean[] keys = new boolean[1024];

    public void keyPressed()
    {
        keys[keyCode] = true;
    }
    
    public void keyReleased()
    {
        keys[keyCode] = true;
    }

    public boolean checkKey(int c)
    {
        return keys[c] || keys [Character.toUpperCase(c)];
    }
    

    public void settings()
    {
        size(1200, 675);
        // Use fullscreen instead of size to make your interface fullscreen
		img = loadImage("images/galaxybg.jpg");
        //fullScreen(P3D); 
    }

    public void setup()
    {
        p = new Plate(this, 0, 0, 390, 675, "");
        ms = new MovingSS(this, width / 2, height * .85f, 60);
        radar = new Radar(this, 1, 120, height / 5, 100);
    }

    Radar radar;

    public void draw()
    {
        background(img);
        p.render();

        ms.update();
        ms.render();

        radar.update();
        radar.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

