import java.applet.Applet;
import java.awt.Graphics;
public class initApplet extends Applet{
    public void init(){
        resize(200,200);

    }
    public void paint(Graphics g){
        g.drawString("hello World",30,30);
    }
    
}
