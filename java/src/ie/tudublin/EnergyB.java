package ie.tudublin;

import processing.core.PApplet;

public class EnergyB
{
    UI ui;
    private float x;
    private float y;
    private float width;
    private float height;
	private String text;
    

    public EnergyB(UI ui, float x, float y, float width, float height, String text)
    {
        this.ui = ui;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.text = text;
    }

    public void render()
    {
        ui.fill(255,0,0);
        ui.stroke(0);
        ui.rect(x, y, width, height);
		ui.fill(0);
        ui.textAlign(PApplet.CENTER, PApplet.CENTER);
        ui.text(text, x + width * 0.5f, y + height * 0.5f);
    }
}