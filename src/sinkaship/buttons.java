package sinkaship;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class buttons implements ActionListener {
    protected javax.swing.JButton butn;
    protected byte no;
    protected static Manager man=new Manager();
    @SuppressWarnings("LeakingThisInConstructor")
    public buttons(javax.swing.JButton b, byte n)
    {
        butn=b;
        no=n;
        this.butn.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        man.buttonhit(this);
    }
    protected void close()
    {
        
    }
    protected static void refresh()
    {
        man=null;
        man=new Manager();
    }
}