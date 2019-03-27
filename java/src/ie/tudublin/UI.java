package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class UI extends PApplet
{
    Button b;
    MovingCircle mc;
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
        size(1200, 553);
        // Use fullscreen instead of size to make your interface fullscreen
		img = loadImage("images/candybackground.jpg");
        //fullScreen(P3D); 
    }

    public void setup()
    {
        b = new Button(this, 50, 50, 300, 200, "I am a button");
        mc = new MovingCircle(this, width / 4, height * .85f, 60);
        radar = new Radar(this, 1, width / 2, height / 2, 100);
    }

    Radar radar;

    public void draw()
    {
        background(img);
        b.render();

        mc.update();
        mc.render();

        radar.update();
        radar.render();

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

