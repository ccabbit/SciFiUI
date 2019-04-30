package ie.tudublin;

import processing.core.PApplet;

public class MovingSS
{
    private float x1;
    private float dx = 1;
    private float y1;
    private float x2;
    private float y2;
    private float x3;
    private float y3;
    private float diameter;
    private float radius;
    UI ui;

    public MovingSS(UI ui, float x1, float y1, float x2, float y2, float x3, float y3)
    {
        this.ui = ui;
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
        //this.diameter = diameter;
        //radius = diameter / 2;
    }
    
    public void render()
    {
        ui.stroke(255);
        //ui.noFill();
       // ui.beginShape();
        ui.triangle(x1, y1, x2, y2, x3, y3);
    
        //ui.endShape(CLOSE);
        ui.fill(255);
        // Static field
       // ui.textAlign(PApplet.CENTER, PApplet.CENTER);
       // ui.text("SS", x, y);

    }

    public void update()
    {
       // x += dx;
       // if ((x < 417) || (x < radius)||(x > ui.width - radius))
      //  {
       //     dx *= -1;
      //  }
    }
}
