package ie.tudublin;

import java.util.ArrayList;
import processing.core.PApplet;
import processing.core.PImage;

public class UI extends PApplet
{
    //Dots
    Dot dt1;
    Dot dt2;
    Dot dt3;
    Dot dt4;
    Dot dt5;
    Dot dt6;

    Dot bigCircle;
    //Plates
    Plate p1;
    Plate p2;

    
    MovingSq[] sq1 = new MovingSq[4];
    MovingSS ms;
	PImage img;
	EnergyB[] eB = new EnergyB[5];
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
        p1 = new Plate(this, 0, 0, 390, 675, 105,105,105);
        p2 = new Plate(this, 50, 300, 290, 50, 0, 0, 0);

        radar = new Radar(this, 1, 120, height / 5, 100);
		for(int i =0; i < eB.length; i++)
        {
            eB[i] = new EnergyB(this, 250, 30 * (i+1), 70, 20, "" + (i+1)); 
        }
       
       
        dt1= new Dot(this, 100, 100, 10, 220, 20, 60);
        dt2= new Dot(this, 130, 90, 10, 220, 20, 60);
        dt3= new Dot(this, 120, 200, 10, 220, 20, 60);
        dt4= new Dot(this, 50, 80, 10, 220, 20, 60);
        dt5= new Dot(this, 150, 160, 10, 220, 20, 60);
        dt6= new Dot(this, 75, 140, 10, 220, 20, 60);

        bigCircle= new Dot(this, 190, 500, 250, 46, 139, 87);

        ms = new MovingSS(this, 125, 540, 190, 410, 255, 540);
 
        for(int i =0; i < sq1.length; i++)
        {
            sq1[i] = new MovingSq(this, 52 + (i*20), 300, 8 , 50, 255, 255, i * 50);
        }

        for(int i = 0; i < comets.length; i++)
        {
            comets[i] = new Comet(this, random(390,width), 0, 65, 226, 88, 34);
        }
    }

    Radar radar;

    public void draw()
    {
        background(img);
        p1.render();
        p2.render();
        //energybar
        for(int i =0; i < eB.length; i++)
        {
		eB[i].render();
        }
        
        radar.update();
        radar.render();
        //dot for rader
        dt1.render();
        dt2.render();
        dt3.render();
        dt4.render();
        dt5.render();
        dt6.render();

        bigCircle.render();

        ms.render();
        ms.update();

        for(int i = 0; i < comets.length; i++)
        {
            comets[i].render();
            comets[i].move1();
        }
        
        for(int i = 0; i < sq1.length; i++)
        {
            sq1[i].update();
            sq1[i].render();
        }

        
    
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

        
        

       

        if (checkKey(LEFT))
        {
            System.out.println("Left arrow key pressed");
        }
    }
}

