package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PImage;

public class UI extends PApplet
{
    Dot dt1;
    Dot dt2;
    Dot dt3;
    Dot dt4;
    Dot dt5;
    Dot dt6;
    Plate p;
    MovingSS ms;
	PImage img;
	EnergyB e1;
    //ArrayList<Comet> cm = new ArrayList<Comet>();
    Comet[] comets = new Comet[6];

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
        //fullScreen(); 
    }

    public void setup()
    {
        p = new Plate(this, 0, 0, 390, 675, "");
        //ms = new MovingSS(this, 785, 625, 795, 585, 805, 625);
        radar = new Radar(this, 1, 120, height / 5, 100);
		e1 = new EnergyB(this, 250, 30, 70, 20, "1"); 
       // cm.add(new Comet(this, random(390,width), 0, 65, 255, 250, 250));
        dt1= new Dot(this, 100, 100, 10, 220, 20, 60);
        dt2= new Dot(this, 130, 90, 10, 220, 20, 60);
        dt3= new Dot(this, 200, 50, 10, 220, 20, 60);
        dt4= new Dot(this, 50, 80, 10, 220, 20, 60);
        dt5= new Dot(this, 150, 160, 10, 220, 20, 60);
        dt6= new Dot(this, 75, 140, 10, 220, 20, 60);

        for(int i = 0; i < comets.length; i++)
        {
            comets[i] = new Comet(this, random(390,width), 0, 65, 226, 88, 34);
        }
    }

    Radar radar;

    public void draw()
    {
        background(img);
        p.render();
        //energybar
		e1.render();
        //e2 render();
        
        radar.update();
        radar.render();
        //dot for rader
        dt1.render();
        for(int i = 0; i < comets.length; i++)
        {
            comets[i].render();
            comets[i].move1();
        }

        // for(Comet c:cm)
        // {
        //     c.render();
        //     float move = random(0,1);
        //     if(move == 0)
        //     {
        //         c.move1();
        //     }
        // }
        if(mouseX>390 && mouseX<1200)
        {
            translate(mouseX, mouseY);
            fill(102);
            stroke(255);
            strokeWeight(2);
            beginShape();
            vertex(0, -20);
            vertex(10, 10);
            vertex(30, 20);
            vertex(20, 20);
            vertex(10, 25);
            vertex(-10, 25);
            vertex(-20, 20);
            vertex(-30, 20);
            vertex(-10, 10);
            endShape(CLOSE);
        }

        
        //ms.
        //ms.render();

       

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

