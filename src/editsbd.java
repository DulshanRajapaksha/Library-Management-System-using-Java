
import codes.connectionprovider;
import java.sql.*;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


public class editsbd extends javax.swing.JFrame {


    public editsbd() {
        initComponents();
        tbload1();
    }
    
      private void tbload1(){
        try
        {
           Connection conn=connectionprovider.getcon();
           Statement st=conn.createStatement();
           ResultSet rs=st.executeQuery("SELECT * FROM student");
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
           ResultSet rsl=st.executeQuery("SELECT * FROM dvds");
           jTable3.setModel(DbUtils.resultSetToTableModel(rsl));
           ResultSet rsk=st.executeQuery("SELECT * FROM books");
           jTable2.setModel(DbUtils.resultSetToTableModel(rsk));
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        
 
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        sid = new javax.swing.JTextField();
        coursebox = new javax.swing.JTextField();
        batchbox = new javax.swing.JTextField();
        dle = new javax.swing.JButton();
        updatebtn = new javax.swing.JButton();
        searchbtn = new javax.swing.JButton();
        sname1 = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        tsearch = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        dvdid = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        dname = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ddir = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        dtitle = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        ddur = new javax.swing.JTextField();
        jPanel6 = new javax.swing.JPanel();
        searchbox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        dle2 = new javax.swing.JButton();
        updatebtn1 = new javax.swing.JButton();
        searchbtn1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        bid = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        bname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        isbn = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        pyear = new javax.swing.JTextField();
        bpub = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        tsearch2 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        updatebtn2 = new javax.swing.JButton();
        searchbtn2 = new javax.swing.JButton();
        tab1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTabbedPane1.setBackground(new java.awt.Color(204, 255, 255));

        jPanel4.setBackground(new java.awt.Color(204, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Student ID");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 100, 25));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Student Name");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 100, 25));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Course");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 100, 25));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Batch");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 100, 25));
        jPanel4.add(sid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 200, 25));
        jPanel4.add(coursebox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 200, 25));
        jPanel4.add(batchbox, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, 200, 25));

        dle.setText("Delete");
        dle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dleActionPerformed(evt);
            }
        });
        jPanel4.add(dle, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 100, 25));

        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });
        jPanel4.add(updatebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 100, 25));

        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        jPanel4.add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 100, 25));
        jPanel4.add(sname1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, 200, 25));

        jPanel5.setBackground(new java.awt.Color(255, 255, 204));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        tsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tsearchActionPerformed(evt);
            }
        });
        tsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tsearchKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Search");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(tsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, 480, 190));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel18.setText("Student");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 40, -1, -1));

        jTabbedPane1.addTab("tab3", jPanel4);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel2.add(dvdid, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 74, 200, 25));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setText("DVD ID");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 73, 100, 25));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setText("DVD Name");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 119, 100, 25));

        dname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dnameActionPerformed(evt);
            }
        });
        jPanel2.add(dname, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 119, 200, 26));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setText("Title");
        jPanel2.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 163, 100, 25));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setText("Director");
        jPanel2.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 207, 100, 25));
        jPanel2.add(ddir, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 208, 200, 25));

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jTable3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable3KeyPressed(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, 110));
        jPanel2.add(dtitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 164, 200, 25));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setText("Duration");
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 251, 100, 25));
        jPanel2.add(ddur, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 252, 200, 25));

        jPanel6.setBackground(new java.awt.Color(255, 255, 204));

        searchbox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchboxActionPerformed(evt);
            }
        });
        searchbox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchboxKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Search");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(105, 105, 105)
                .addComponent(jLabel3)
                .addGap(12, 12, 12)
                .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(searchbox, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(141, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, 480, 180));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setText("DVDs");
        jPanel2.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        dle2.setText("Delete");
        dle2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dle2ActionPerformed(evt);
            }
        });
        jPanel2.add(dle2, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 100, 25));

        updatebtn1.setText("Update");
        updatebtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(updatebtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 100, 25));

        searchbtn1.setText("Search");
        searchbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtn1ActionPerformed(evt);
            }
        });
        jPanel2.add(searchbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, 100, 25));

        jTabbedPane1.addTab("tab1", jPanel2);

        jPanel3.setBackground(new java.awt.Color(255, 204, 255));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Book  ID");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Book Name");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setText("Publisher");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("ISBN");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setText("Publish Year");

        jPanel7.setBackground(new java.awt.Color(255, 255, 204));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable2MouseClicked(evt);
            }
        });
        jTable2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jTable2KeyPressed(evt);
            }
        });
        jScrollPane2.setViewportView(jTable2);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Search");

        tsearch2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tsearch2KeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(12, 12, 12)
                        .addComponent(tsearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(tsearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel20.setText("Books");

        jButton5.setText("Delete");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        updatebtn2.setText("Update");
        updatebtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtn2ActionPerformed(evt);
            }
        });

        searchbtn2.setText("Search");
        searchbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtn2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addComponent(jLabel20))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pyear, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bid, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bname, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bpub, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updatebtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel20)
                .addGap(11, 11, 11)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(bid, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(bname, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(bpub, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(isbn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(pyear, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(searchbtn2)
                        .addGap(15, 15, 15)
                        .addComponent(updatebtn2)
                        .addGap(15, 15, 15)
                        .addComponent(jButton5)))
                .addGap(45, 45, 45)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jTabbedPane1.addTab("tab2", jPanel3);

        jPanel1.add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(178, -33, 520, 530));

        tab1.setBackground(new java.awt.Color(204, 255, 255));
        tab1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/graduate.png"))); // NOI18N
        tab1.setText("Student");
        tab1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tab1ActionPerformed(evt);
            }
        });
        jPanel1.add(tab1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 140, -1));

        jButton2.setBackground(new java.awt.Color(255, 204, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/dvd.png"))); // NOI18N
        jButton2.setText("DVDs");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 140, -1));

        jButton3.setBackground(new java.awt.Color(204, 255, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/return.png"))); // NOI18N
        jButton3.setText("Books");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 140, -1));

        jButton1.setBackground(new java.awt.Color(255, 204, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/red-x-mark-transparent-background-3.png"))); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 439, 140, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(712, 534));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void tab1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tab1ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(0);
    }//GEN-LAST:event_tab1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        jTabbedPane1.setSelectedIndex(2);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void dnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dnameActionPerformed

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
         try
         {
            Connection conn=connectionprovider.getcon();
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM student WHERE studentid='"+sid.getText()+"'"); 
         
          if(rs.next())
          {
              sid.setText(rs.getString("studentid"));
              sname1.setText(rs.getString("studentname"));
              coursebox.setText(rs.getString("course"));
              batchbox.setText(rs.getString("batch"));
          }
         }catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e);
         }
    }//GEN-LAST:event_searchbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        // TODO add your handling code here:
        String stid=sid.getText();
        String stname= sname1.getText();
        String course = coursebox.getText();
        String batch = batchbox.getText();
        
        try
        {
           Connection conn=connectionprovider.getcon();
           Statement su=conn.createStatement();
           su.executeUpdate("UPDATE student SET studentname='" + stname + "', course='" + course + "', batch='" + batch + "' WHERE Studentid='" + stid + "'");
           JOptionPane.showMessageDialog(null,"Successfully Update");
           
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void dleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dleActionPerformed
        // TODO add your handling code here:
        String stid=sid.getText();
         try
        {
           Connection conn=connectionprovider.getcon();
           Statement su=conn.createStatement();
           su.executeUpdate("DELETE FROM student WHERE Studentid='" + stid + "'");
           JOptionPane.showMessageDialog(null,"Successfully Deleted");
           
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
         
       
    }//GEN-LAST:event_dleActionPerformed

    private void tsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tsearchKeyReleased
        // TODO add your handling code here:
        String id = tsearch.getText();
        
        try
        {
           Connection conn=connectionprovider.getcon();
           Statement st=conn.createStatement();
           ResultSet rs = st.executeQuery("SELECT * FROM student WHERE Studentid='" + id + "'");
           jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tsearchKeyReleased

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        int i = jTable1.getSelectedRow();
        
        String studentid= jTable1.getValueAt(i, 0).toString();
        String stname= jTable1.getValueAt(i, 1).toString();
        String course= jTable1.getValueAt(i, 2).toString();
        String batch= jTable1.getValueAt(i, 3).toString();
        
        sid.setText(studentid);
        sname1.setText(stname);
        coursebox.setText(course);
        batchbox.setText(batch);
    }//GEN-LAST:event_jTable1MouseClicked

    private void dle2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dle2ActionPerformed
        // TODO add your handling code here:
        String dvdsid=dvdid.getText();
         try
        {
           Connection conn=connectionprovider.getcon();
           Statement su=conn.createStatement();
           su.executeUpdate("DELETE FROM student WHERE dvdid='" + dvdsid + "'");
           JOptionPane.showMessageDialog(null,"Successfully Deleted");
           
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_dle2ActionPerformed

    private void updatebtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtn1ActionPerformed
        // TODO add your handling code here:
        String dvdsid=dvdid.getText();
        String dvdname= dname.getText();
        String title = dtitle.getText();
        String director = ddir.getText();
        String duration = ddur.getText();
        
        try
        {
           Connection conn=connectionprovider.getcon();
           Statement su=conn.createStatement();
           su.executeUpdate("UPDATE dvds SET dvdname='" + dvdname + "', title='" + title + "', director='" + director + "', duration='"+duration+"' WHERE dvdid='" + dvdsid + "'");
           JOptionPane.showMessageDialog(null,"Successfully Update");
           
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_updatebtn1ActionPerformed

    private void searchbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtn1ActionPerformed
        // TODO add your handling code here:
        try
         {
            Connection conn=connectionprovider.getcon();
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM dvds WHERE dvdid='"+dvdid.getText()+"'"); 
         
          if(rs.next())
          {
              dvdid.setText(rs.getString("dvdid"));
              dname.setText(rs.getString("dvdname"));
              dtitle.setText(rs.getString("title"));
              ddir.setText(rs.getString("director"));
              ddur.setText(rs.getString("duration"));
          }
         }catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e);
         }
    }//GEN-LAST:event_searchbtn1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void updatebtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updatebtn2ActionPerformed

    private void searchbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtn2ActionPerformed
        // TODO add your handling code here:
        try
         {
            Connection conn=connectionprovider.getcon();
            Statement st=conn.createStatement();
            ResultSet rs=st.executeQuery("SELECT * FROM books WHERE bookid='"+bid.getText()+"'"); 
         
          if(rs.next())
          {
              bid.setText(rs.getString("bookid"));
              bname.setText(rs.getString("bname"));
              bpub.setText(rs.getString("publisher"));
              isbn.setText(rs.getString("ISBN"));
              pyear.setText(rs.getString("pdate"));
          }
         }catch(Exception e)
         {
             JOptionPane.showMessageDialog(null, e);
         }
    }//GEN-LAST:event_searchbtn2ActionPerformed

    private void tsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tsearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tsearchActionPerformed

    private void searchboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchboxActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_searchboxActionPerformed

    private void jTable2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable2KeyPressed
        // TODO add your handling code here:
         int i = jTable2.getSelectedRow();
        
        String studentid= jTable1.getValueAt(i, 0).toString();
        String stname= jTable1.getValueAt(i, 1).toString();
        String course= jTable1.getValueAt(i, 2).toString();
        String batch= jTable1.getValueAt(i, 3).toString();
        
        sid.setText(studentid);
        sname1.setText(stname);
        coursebox.setText(course);
        batchbox.setText(batch);
    }//GEN-LAST:event_jTable2KeyPressed

    private void jTable3KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTable3KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable3KeyPressed

    private void searchboxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchboxKeyReleased
        // TODO add your handling code here:
        String tsid = searchbox.getText();
        
        try
        {
           Connection conn=connectionprovider.getcon();
           Statement st=conn.createStatement();
           ResultSet rs = st.executeQuery("SELECT * FROM dvds WHERE dvdid='" + tsid + "'");
           jTable3.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchboxKeyReleased

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
         int i = jTable3.getSelectedRow();
        
        String dvdsid= jTable3.getValueAt(i, 0).toString();
        String dvdname= jTable3.getValueAt(i, 1).toString();
        String title= jTable3.getValueAt(i, 2).toString();
        String director= jTable3.getValueAt(i, 3).toString();
        String duration= jTable3.getValueAt(i, 4).toString();
        
        dvdid.setText(dvdsid);
        dname.setText(dvdname);
        dtitle.setText(title);
        ddir.setText(director);
        ddur.setText(duration);
    }//GEN-LAST:event_jTable3MouseClicked

    private void tsearch2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tsearch2KeyReleased
        // TODO add your handling code here:
        String dvid = tsearch2.getText();
        
        try
        {
           Connection conn=connectionprovider.getcon();
           Statement st=conn.createStatement();
           ResultSet rs = st.executeQuery("SELECT * FROM books WHERE bookid='" + dvid + "'");
           jTable2.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_tsearch2KeyReleased

    private void jTable2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable2MouseClicked
        // TODO add your handling code here:
        int i = jTable2.getSelectedRow();
        
        String bookid= jTable2.getValueAt(i, 0).toString();
        String bookname= jTable2.getValueAt(i, 1).toString();
        String publiser= jTable2.getValueAt(i, 2).toString();
        String isbn1= jTable2.getValueAt(i, 3).toString();
        String puyear= jTable2.getValueAt(i, 4).toString();
        
        bid.setText(bookid);
        bname.setText(bookname);
        bpub.setText(publiser);
        isbn.setText(isbn1);
        pyear.setText(puyear);
    }//GEN-LAST:event_jTable2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(editsbd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editsbd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editsbd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editsbd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editsbd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField batchbox;
    private javax.swing.JTextField bid;
    private javax.swing.JTextField bname;
    private javax.swing.JTextField bpub;
    private javax.swing.JTextField coursebox;
    private javax.swing.JTextField ddir;
    private javax.swing.JTextField ddur;
    private javax.swing.JButton dle;
    private javax.swing.JButton dle2;
    private javax.swing.JTextField dname;
    private javax.swing.JTextField dtitle;
    private javax.swing.JTextField dvdid;
    private javax.swing.JTextField isbn;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField pyear;
    private javax.swing.JTextField searchbox;
    private javax.swing.JButton searchbtn;
    private javax.swing.JButton searchbtn1;
    private javax.swing.JButton searchbtn2;
    private javax.swing.JTextField sid;
    private javax.swing.JTextField sname1;
    private javax.swing.JButton tab1;
    private javax.swing.JTextField tsearch;
    private javax.swing.JTextField tsearch2;
    private javax.swing.JButton updatebtn;
    private javax.swing.JButton updatebtn1;
    private javax.swing.JButton updatebtn2;
    // End of variables declaration//GEN-END:variables
}
