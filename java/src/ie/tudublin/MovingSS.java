package ie.tudublin;

import processing.core.PApplet;

public class MovingSS
{
    private float x1;
    private float dy1 = 1;
    private float dy2 = -1;
    private float dx = 1;
    private float y1;
    private float x2;
    private float y2;
    private float x3;
    private float y3;

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
        this.dy1 = dy1;
        this.dy2 = dy2;
        this.dx = dx;
    }
    
    public void render()
    {
        ui.stroke(255);
        ui.fill(102);
        
        ui.triangle(x1, y1, x2, y2, x3, y3);
    
        
       
        

    }

    public void update()
    {
        x1 += dx;
        x3 += dx; 
        if ((x1 < 100) || (x1 >150))
       {
          dx *= -1;
        }

       y1 += dy1;
       y3 += dy1;
       if ((y1 < 545)||(y1 > 555))
       {
           dy1 *= -1;
       }

    }
}
