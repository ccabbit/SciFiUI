package ie.tudublin;

import processing.core.PApplet;
import processing.core.PImage;

public class UI extends PApplet
{
    Plate p;
    MovingSS ms;
	PImage img;
	EnergyB e1;

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
        //ms = new MovingSS(this, 785, 625, 795, 585, 805, 625);
        radar = new Radar(this, 1, 120, height / 5, 100);
		e1 = new EnergyB(this, 250, 30, 70, 20, "1"); 
    }

    Radar radar;

    public void draw()
    {
        background(img);
        p.render();
		e1.render();
        radar.update();
        radar.render();
        translate(mouseX, mouseY);
  fill(102);
  stroke(255);
  strokeWeight(2);
  beginShape();
  vertex(0, -50);
  vertex(14, -20);
  vertex(47, -15);
  vertex(23, 7);
  vertex(29, 40);
  vertex(0, 25);
  vertex(-29, 40);
  vertex(-23, 7);
  vertex(-47, -15);
  vertex(-14, -20);
  endShape(CLOSE);
        //ms.
        //ms.render();

       

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

