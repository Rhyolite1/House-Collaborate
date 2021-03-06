/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2011.07.31
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle line1;
    private Circle line2;
    private Circle line3;
    private Circle blood1;
    private Triangle missing;
    private Square background;
    private Circle cover1;
    private Circle cover2;
    private Circle cover3;
    private Circle opening;
    private Person bond;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(-120);
        window.moveVertical(40);
        window.changeSize(40);
        window.makeVisible();

        roof = new Triangle();  
        roof.changeSize(60, 180);
        roof.moveHorizontal(20);
        roof.moveVertical(-60);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(100);
        sun.moveVertical(-40);
        sun.changeSize(80);
        sun.makeVisible();
    }
    public void draw_Moretti()
        {
            if(!drawn) {
                background.changeColor("black");
                background.changeSize(100000);
                background.moveHorizontal(-310);
                background.moveVertical(-200);
                background.makeVisible();
                
                line1.changeColor("white");
                line1.changeSize(600);
                line1.moveHorizontal(-230);
                line1.moveVertical(-170);
                line1.makeVisible();
                
                blood1.changeColor("red");
                blood1.changeSize(800);
                blood1.moveVertical(-900);
                blood1.moveHorizontal(-280);
                blood1.makeVisible();
                
                cover1.changeColor("black");
                cover1.changeSize(700);
                cover1.moveHorizontal(-222);
                cover1.moveVertical(-102);
                cover1.makeVisible();
                
                line2.changeColor("white");
                line2.changeSize(550);
                line2.moveHorizontal(-130);
                line2.moveVertical(-98);
                line2.makeVisible();
                
                missing.changeColor("black");
                missing.changeSize(190, 200);
                missing.moveVertical(100);
                missing.moveHorizontal(-40);
                missing.makeVisible();
                
                cover2.changeColor("black");
                cover2.changeSize(500);
                cover2.moveHorizontal(-90);
                cover2.moveVertical(-80);
                cover2.makeVisible();
                
                line3.changeColor("white");
                line3.changeSize(420);
                line3.moveHorizontal(-70);
                line3.moveVertical(-60);
                line3.makeVisible();
                
                cover3.changeColor("black");
                cover3.changeSize(350);
                cover3.moveHorizontal(-40);
                cover3.moveVertical(-40);
                cover3.makeVisible();
                
                opening.changeColor("white");
                opening.changeSize(250);
                opening.makeVisible();
                
                //bond.changeColor("blue");
                bond.changeSize(100, 100);
                bond.moveHorizontal(70);
                bond.moveVertical(-10);
                bond.makeVisible();
                
                drawn = true;
            }
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if (wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }
}
