
import java.text.SimpleDateFormat;
import codes.connectionprovider;
import java.sql.*;
import javax.swing.JOptionPane;


public class issubook extends javax.swing.JFrame {

   
    public issubook() {
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
        ibidbox = new javax.swing.JTextField();
        isidbox = new javax.swing.JTextField();
        dudate = new com.toedter.calendar.JDateChooser();
        issuebtn = new javax.swing.JButton();
        iclosebtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        isdate = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 125));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Book ID");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 160, 66, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Student ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Issue Date ");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 100, 25));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Due Date");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 310, 100, 25));

        ibidbox.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.add(ibidbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, 200, 25));

        isidbox.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.add(isidbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 210, 200, 25));
        jPanel1.add(dudate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, 200, 25));

        issuebtn.setBackground(new java.awt.Color(204, 255, 204));
        issuebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/issue book.png"))); // NOI18N
        issuebtn.setText("Issue");
        issuebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuebtnActionPerformed(evt);
            }
        });
        jPanel1.add(issuebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 380, -1, -1));

        iclosebtn.setBackground(new java.awt.Color(255, 204, 204));
        iclosebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red-x-mark-transparent-background-3.png"))); // NOI18N
        iclosebtn.setText("Close");
        iclosebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iclosebtnActionPerformed(evt);
            }
        });
        jPanel1.add(iclosebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, -1, -1));

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image-removebg-preview (1).png"))); // NOI18N
        jLabel5.setText("jLabel5");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-60, -1, 500, 490));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 390, 470));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel6.setText("Issue Book");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 50, -1, -1));
        jPanel1.add(isdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 260, 200, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 470));

        setSize(new java.awt.Dimension(801, 506));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void iclosebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iclosebtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_iclosebtnActionPerformed

    private void issuebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuebtnActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat  dFormat = new SimpleDateFormat("dd-mm-yyyy");
        
        String bookid = ibidbox.getText();
        String studentid = isidbox.getText();
        String issuedate = dFormat.format(isdate.getDate());
        String duedate = dFormat.format(dudate.getDate());
        String returnbook = "no";
        
        try
        {
           Connection conn=connectionprovider.getcon();
           Statement st=conn.createStatement();
           ResultSet rs=st.executeQuery("SELECT * FROM books WHERE bookid='"+bookid+"'");
           if (rs.next())
           {
               ResultSet rsl=st.executeQuery("SELECT * FROM student WHERE studentid='"+studentid+"'");
               if(rsl.next())
               {
                   st.executeUpdate("INSERT INTO issue VALUES('"+bookid+"','"+studentid+"','"+issuedate+"','"+duedate+"','"+returnbook+"')");
                   JOptionPane.showMessageDialog(null, "Book succuessfully issued");
                   setVisible(false);
                   new issubook().setVisible(true);
               }else
               {
                   JOptionPane.showConfirmDialog(null, "Incorrect Student id");
               }
           }else
           {
               JOptionPane.showConfirmDialog(null, "Incorrect bookid");
           }
           
        }catch(Exception e)
        {
            JOptionPane.showConfirmDialog(null, "Connection error");
        }
    }//GEN-LAST:event_issuebtnActionPerformed

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
            java.util.logging.Logger.getLogger(issubook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(issubook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(issubook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(issubook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new issubook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dudate;
    private javax.swing.JTextField ibidbox;
    private javax.swing.JButton iclosebtn;
    private com.toedter.calendar.JDateChooser isdate;
    private javax.swing.JTextField isidbox;
    private javax.swing.JButton issuebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
