package sinkaship;
import java.awt.Color;
import static java.util.logging.Logger.getLogger;
import static javax.swing.UIManager.getInstalledLookAndFeels;
import static javax.swing.UIManager.setLookAndFeel;
import static sinkaship.buttons.refresh;
public class Base extends javax.swing.JFrame {
    javax.swing.JTextArea tF1;
    javax.swing.JTextArea tF2;
    @SuppressWarnings("LeakingThisInConstructor")
    public Base() {
        tF1=new javax.swing.JTextArea();
        tF1.setColumns(8);
        tF1.setRows(1);
        tF1.setBackground(Color.CYAN);
        tF1.setEditable(false);
        tF2=new javax.swing.JTextArea();
        tF2.setColumns(8);
        tF2.setRows(1);
        tF2.setBackground(Color.CYAN);
        tF2.setEditable(false);
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            getLogger(Base.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        initComponents();
        buttons.man.addtoBase(this);  
        add(tF1);
        add(tF2);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        newG = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        Instructions = new javax.swing.JMenuItem();
        about = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sink A Ship 1.0");
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(400, 500));
        setResizable(false);
        getContentPane().setLayout(new java.awt.FlowLayout());

        jMenu1.setText("Game");

        newG.setText("New Game");
        newG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newGActionPerformed(evt);
            }
        });
        jMenu1.add(newG);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        jMenu1.add(exit);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Help");

        Instructions.setText("Instructions");
        Instructions.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InstructionsActionPerformed(evt);
            }
        });
        jMenu2.add(Instructions);

        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jMenu2.add(about);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>                        

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {                                     
        dispose();
    }                                    

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {                                      
        new backUp("Sink A Ship"+"\n"+"Version 1.0"+"\n"+"Programmed by Amit Singh").setVisible(true);
    }                                     

    private void InstructionsActionPerformed(java.awt.event.ActionEvent evt) {                                             
        new backUp("Sink A Ship is the JAVA version of the popular game Minesweeper."+"\n"+"In this simple game all you need to do is hit the buttons."+"\n"+"It will return either a hit or a miss, generated randomly, which are showed at the bottom."+"\n"+"If you get 15 hits first, you win, else if you get 18 misses first, you lose.").setVisible(true);
    }                                            

    private void newGActionPerformed(java.awt.event.ActionEvent evt) {                                     
        refresh();
        dispose();
        new Base().setVisible(true);
    }                                    

    // Variables declaration - do not modify                     
    private javax.swing.JMenuItem Instructions;
    private javax.swing.JMenuItem about;
    private javax.swing.JMenuItem exit;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    protected static javax.swing.JMenuItem newG;
    // End of variables declaration                   
}