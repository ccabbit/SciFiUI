package ie.tudublin;

import processing.core.PApplet;

public class Dot
{
    private float x;
    private float y;
    private float r;
    private float g;
    private float b;
    private float diameter;
    private float radius;
    public float dropSpeed = 5;
    
    UI ui;

    public Dot (UI ui,float x, float y, float diameter, float r, float g, float b)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.r = r;
        this.g = g;
        this.b = b;
        this.diameter = diameter;
    }


    public void render()
    {
        ui.noStroke();
        ui.fill(r,g,b);
        ui.ellipse(x,y,diameter, diameter);
    }

}