package sinkaship;
import java.awt.Color;
public class Result extends javax.swing.JDialog {
    public Result(boolean R) {
        initComponents();
        setBackground(Color.BLACK);
        TA.setText((R)?"YOU WIN":"YOU LOST");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TA = new javax.swing.JTextArea();
        NG = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);

        TA.setEditable(false);
        TA.setBackground(new java.awt.Color(0, 0, 0));
        TA.setColumns(5);
        TA.setFont(new java.awt.Font("Harry Potter", 0, 36)); // NOI18N
        TA.setForeground(new java.awt.Color(204, 0, 0));
        TA.setRows(1);
        TA.setTabSize(5);
        TA.setWrapStyleWord(true);
        jScrollPane1.setViewportView(TA);

        NG.setText("New Game");
        NG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NGActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(NG))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NG))
        );

        pack();
    }// </editor-fold>                        

    private void NGActionPerformed(java.awt.event.ActionEvent evt) {                                   
        this.dispose();
        Base.newG.doClick();
    }                                  

    // Variables declaration - do not modify                     
    private javax.swing.JButton NG;
    private javax.swing.JTextArea TA;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}