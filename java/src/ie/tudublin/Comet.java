package ie.tudublin;

import processing.core.PApplet;

public class Comet
{
    private float x;
    private float y;
    private float r;
    private float g;
    private float b;
    private float diameter;
    private float radius;
    UI ui;

    public Comet (UI ui,float x, float y, float diameter, float r, float g, floatb)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.r = r;
        this.g = g;
        this.b = b;
        this.diameter = diameter;
    }
}