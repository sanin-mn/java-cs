import java.awt.event.*;
import java.awt.*;

public class Mydet extends Frame implements ActionListener{
    TextField t1,t2,t3,t4;
    Label l1,l2,l3,l4;
    Button b;
    
    public static void main (String args[])
    {
        Mydet m=new Mydet();
        m.setSize(500,500);
    }
    Mydet()
    {
        super("My Details");
        setLayout(new GridLayout(6,4));
        l1=new Label ("Name");
        l2=new Label ("Street");
        l3=new Label ("City");
        l4=new Label ("Pincode");
        
        t1=new TextField(20);
        t2=new TextField(20);
        t3=new TextField(20);
        t4=new TextField(20);
        
        b=new Button("My Details");
        
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(l4);
        add(t4);
        add(b);
        
        b.addActionListener(this);
        setVisible(true);
        addWindowListener(new WindowAdapter()
        {
            public void windowClosing(WindowEvent we)
            {
                System.exit(0);
            }
        });
        
    }
    public void actionPerformed(ActionEvent ae)
    {
        repaint();
        t1.setText("SANIN");
        t2.setText("KOPRAKKALAM");
        t3.setText("THRISSUR");
        t4.setText("680681");
        
    }
}