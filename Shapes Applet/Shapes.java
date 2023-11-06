import java.awt.*;
import java.applet.*;

/*<applet code="Shapes" width=500 height=500></applet>*/

public class Shapes extends Applet{
    public void paint (Graphics g)
    {
        g.drawLine(10,5,250,5);
        g.drawRect(10,100,70,50);
        g.drawRect(200,100,70,50);
        g.drawRoundRect(10,300,70,50,10,10);
        g.fillRoundRect(200,300,70,50,10,10);
        g.drawOval(10,10,70,70);
        g.fillOval(200,10,70,70);
        g.drawArc(10,200,70,70,10,180);
        g.fillArc(200,200,70,70,0,180);
    }
}