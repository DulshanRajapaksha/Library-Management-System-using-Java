import java.sql.*;
import codes.connectionprovider;
import javax.swing.JOptionPane;

public class newstudent extends javax.swing.JFrame {

    public newstudent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        sname = new javax.swing.JTextField();
        sid = new javax.swing.JTextField();
        batchbox = new javax.swing.JTextField();
        cname = new javax.swing.JComboBox<>();
        savebtn = new javax.swing.JButton();
        sclosebtn = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 100));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Student id");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 95, 23));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Student Name");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, 23));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("Course Name");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, 29));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("Batch ");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 280, 95, 23));

        sname.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sname.setBorder(null);
        jPanel1.add(sname, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 190, 200, 25));

        sid.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        sid.setBorder(null);
        jPanel1.add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, 200, 25));

        batchbox.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        batchbox.setBorder(null);
        jPanel1.add(batchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 280, 200, 25));

        cname.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        cname.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Computer Science", "Information Technology", "Software Engineering" }));
        jPanel1.add(cname, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, 146, -1));

        savebtn.setBackground(new java.awt.Color(204, 204, 255));
        savebtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        savebtn.setForeground(new java.awt.Color(51, 51, 255));
        savebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/save-icon--1.png"))); // NOI18N
        savebtn.setText("Save");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });
        jPanel1.add(savebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 340, -1, -1));

        sclosebtn.setBackground(new java.awt.Color(255, 204, 204));
        sclosebtn.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        sclosebtn.setForeground(new java.awt.Color(255, 51, 51));
        sclosebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red-x-mark-transparent-background-3.png"))); // NOI18N
        sclosebtn.setText("Close");
        sclosebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sclosebtnActionPerformed(evt);
            }
        });
        jPanel1.add(sclosebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 340, 100, -1));

        jLabel6.setBackground(new java.awt.Color(255, 204, 255));
        jLabel6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel6.setText("Student Form");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 70, 170, -1));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/R.jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 10, 460, 400));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 450));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 700));

        setSize(new java.awt.Dimension(714, 487));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void sclosebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sclosebtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_sclosebtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        
        String studentid=sid.getText();
        String studentname=sname.getText();
        String coursename=(String)cname.getSelectedItem();
        String batch=batchbox.getText();
        
        try
        {
           Connection conn=connectionprovider.getcon();
           Statement st=conn.createStatement();
           st.execute("INSERT INTO student VALUES('"+studentid+"','"+studentname+"','"+coursename+"','"+batch+"')");
           JOptionPane.showMessageDialog(null,"Insert data successfully");
           setVisible(false);
           new newstudent().setVisible(true);
        }
        catch(Exception e)
        {
           JOptionPane.showMessageDialog(null,"Student id already exist");
           setVisible(false);
           new newstudent().setVisible(true);
        }
    }//GEN-LAST:event_savebtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(newstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(newstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(newstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(newstudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new newstudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField batchbox;
    private javax.swing.JComboBox<String> cname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton savebtn;
    private javax.swing.JButton sclosebtn;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField sname;
    // End of variables declaration//GEN-END:variables
}
