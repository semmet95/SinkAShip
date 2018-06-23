package sinkaship;
public class backUp extends javax.swing.JDialog {
    public backUp(String s) {
        initComponents();
        setLocationByPlatform(true);
        data.setText(s);
        Manager.ob.setEnabled(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        data = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Help");
        setLocationByPlatform(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            @Override
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new java.awt.FlowLayout());

        data.setEditable(false);
        data.setColumns(20);
        data.setFont(new java.awt.Font("Nirmala UI", 0, 14)); // NOI18N
        data.setLineWrap(true);
        data.setRows(9);
        data.setWrapStyleWord(true);
        jScrollPane1.setViewportView(data);

        getContentPane().add(jScrollPane1);

        pack();
    }// </editor-fold>                        

    private void formWindowClosed(java.awt.event.WindowEvent evt) {                                  
        Manager.ob.setEnabled(true);
        Manager.ob.setVisible(true);
    }                                 

    // Variables declaration - do not modify                     
    private javax.swing.JTextArea data;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}