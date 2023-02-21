import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class Demonstration_23 extends Applet {
    public int val1 = 500;
    public int val2 = 500;

    public void init(){
        resize(val1,val2);
        setBackground(Color.YELLOW);
        

    }
    public void paint (Graphics g){
        g.drawString("height of box is 300  and width is 300",10,50);

    }

    
}
