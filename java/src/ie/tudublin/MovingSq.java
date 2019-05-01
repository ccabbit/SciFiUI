package ie.tudublin;

import processing.core.PApplet;

public class MovingSq
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
    private float r;
    private float g;
    private float b;
    private float dx = 5;

    public MovingSq(UI ui, float x, float y, float width, float height, float r, float g, float b)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.r = r;
        this.g = g;
        this.b = b;
        
    }

    public void render()
    {
        ui.fill(r,g,b);
        ui.stroke(0);
        ui.rect(x, y, width, height);
       // ui.textAlign(PApplet.CENTER, PApplet.CENTER);
    }

    public void update()
    {
        x = x + dx;
        if ((x < 50) || (x > 330))//||(x > ui.width - radius))
       {
           dx *= -1;
       }
    }
}