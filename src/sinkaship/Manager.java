package sinkaship;
import static java.lang.Math.random;
import java.util.ArrayList;
public class Manager {
    protected ArrayList<buttons> buttonset = new ArrayList<>();
    protected static Base ob;
    protected int h=0,m=0;
    protected void addtoBase(Base obj)
    {
        ob=obj;
        for(int i=0;i<40;i++)
        {
            buttonset.add(new buttons(new javax.swing.JButton(new javax.swing.ImageIcon(getClass().getResource("fire.png"))),(byte)(random()*10)));
            ob.add(buttonset.get(i).butn);
        }
    }
    protected void buttonhit(buttons curbut)
    {
        if(h>=14||m>=17)
        {
            ob.dispose();
            new Result((h==14)?true:false).setVisible(true);
        }
        if(curbut.no<=3)
        {
            ob.tF1.setText("HITS = "+ ++h);
        }
        else
        {
            ob.tF2.setText("MISS = "+ ++m);
        }
        curbut.butn.setEnabled(false);
    }
}