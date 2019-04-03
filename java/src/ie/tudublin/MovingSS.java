package ie.tudublin;

import processing.core.PApplet;

public class MovingSS
{
    private float x;
    private float dx = 1;
    private float y;
    private float diameter;
    private float radius;
    UI ui;

    public MovingSS(UI ui, float x, float y, float diameter)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.diameter = diameter;
        radius = diameter / 2;
    }
    
    public void render()
    {
        ui.stroke(255);
        ui.noFill();
        ui.ellipse(x, y, diameter, diameter);
        ui.fill(255);
        // Static field
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text("Yum", x, y);

    }

    public void update()
    {
        x += dx;
        if ((x < 417) || (x < radius)||(x > ui.width - radius))
        {
            dx *= -1;
        }
    }
}