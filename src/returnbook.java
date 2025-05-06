import java.sql.*;
import codes.connectionprovider;
import javax.swing.JOptionPane;

public class returnbook extends javax.swing.JFrame {


    public returnbook() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        searchbtn = new javax.swing.JButton();
        returnbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        rbidbox = new javax.swing.JTextField();
        rsidbox = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        isudatebox = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        duebox = new javax.swing.JTextField();
        rclosebtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 125));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setText("Return Book");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, -1, -1));

        searchbtn.setBackground(new java.awt.Color(204, 255, 255));
        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search.png"))); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        jPanel1.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 200, 120, 30));

        returnbtn.setBackground(new java.awt.Color(204, 204, 255));
        returnbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/return book png.png"))); // NOI18N
        returnbtn.setText("Return");
        returnbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                returnbtnActionPerformed(evt);
            }
        });
        jPanel1.add(returnbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 385, 100, 30));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Book ID");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 90, 25));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Student ID");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 100, 25));
        jPanel1.add(rbidbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, 200, 25));
        jPanel1.add(rsidbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 150, 200, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Due Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 320, 100, 25));
        jPanel1.add(isudatebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 200, 25));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        rclosebtn.setBackground(new java.awt.Color(255, 204, 204));
        rclosebtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red-x-mark-transparent-background-3.png"))); // NOI18N
        rclosebtn.setText("Close");
        rclosebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rclosebtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Issue Date");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                .addComponent(duebox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rclosebtn)
                .addGap(231, 231, 231))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(duebox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(rclosebtn)
                .addContainerGap())
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 670, 150));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 450));

        setSize(new java.awt.Dimension(713, 486));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        String bookid =rbidbox.getText();
        String studentid = rsidbox.getText();
        
        try
        {
            Connection conn=connectionprovider.getcon();
            Statement st=conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM issue WHERE bookid='" + bookid + "' AND studentid='" + studentid + "'");

            
            if(rs.next())
            {
                isudatebox.setText(rs.getString(3));
                duebox.setText(rs.getString(4));
                rbidbox.setEditable(false);
                rsidbox.setEditable(false);
            }else
            {
                JOptionPane.showMessageDialog(null, "Incorrect Student ID or Book ID");
                setVisible(false);
                new returnbook().setVisible(true);
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Connection Error");
            
        }
    }//GEN-LAST:event_searchbtnActionPerformed

    private void returnbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_returnbtnActionPerformed
        // TODO add your handling code here:
        String bookid =rbidbox.getText();
        String studentid = rsidbox.getText();
        
        try
        {
            Connection conn= connectionprovider.getcon();
            Statement st= conn.createStatement();
            st.executeUpdate("UPDATE issue SET returnbook='yes' WHERE studentid='" + studentid + "' AND bookid='" + bookid + "'");
            JOptionPane.showMessageDialog(null, "Book Successfully returned");
            setVisible(false);
            new returnbook().setVisible(true);
            
        }catch(Exception e)
        {
           JOptionPane.showMessageDialog(null, "Connection Error");
        }
    }//GEN-LAST:event_returnbtnActionPerformed

    private void rclosebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rclosebtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_rclosebtnActionPerformed


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
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(returnbook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new returnbook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField duebox;
    private javax.swing.JTextField isudatebox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField rbidbox;
    private javax.swing.JButton rclosebtn;
    private javax.swing.JButton returnbtn;
    private javax.swing.JTextField rsidbox;
    private javax.swing.JButton searchbtn;
    // End of variables declaration//GEN-END:variables
}
