package mesmotors;

//Bu müsteri listesi ekranı oluyor.

import javax.swing.table.DefaultTableModel;
/**
 * Bütün programda kullanilan static nesneler ayni nesne üzerinde islem yapabilmek icin import edilmistir.
*/
import static mesmotors.JLoginScreen.customerQueue;

public class JCustomerList extends javax.swing.JFrame {

    /**
     * JCustomerList olusturulur.
     */

    public JCustomerList() {
        initComponents();
    }

    /**
     * Designerdan otomatik olarak yazdirilan ayarlardir.
     */

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCustomerList = new javax.swing.JButton();
        btnAddCustomer = new javax.swing.JButton();
        btnDeleteCustomer = new javax.swing.JButton();
        btnGoManagementScreen = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCustomer = new javax.swing.JTable();
        txtSearchStick = new javax.swing.JTextField();
        lblNextCustomer = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Müşteri Sıra Ekranı");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btnCustomerList.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnCustomerList.setText("Müşteri Listesi");
        btnCustomerList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerListActionPerformed(evt);
            }
        });

        btnAddCustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddCustomer.setText("Müşteri Ekle");
        btnAddCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddCustomerActionPerformed(evt);
            }
        });

        btnDeleteCustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnDeleteCustomer.setText("Müşteri Çıkart");
        btnDeleteCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteCustomerActionPerformed(evt);
            }
        });

        btnGoManagementScreen.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnGoManagementScreen.setText("Yönetici Ekranına dön");
        btnGoManagementScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGoManagementScreenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnCustomerList, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnGoManagementScreen, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnDeleteCustomer, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnAddCustomer, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap()));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btnCustomerList, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnDeleteCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnGoManagementScreen, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        jPanel2.setBackground(new java.awt.Color(204, 0, 51));

        jTableCustomer.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jTableCustomer.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][] {

                },
                new String[] {
                        "Müşteriler"
                }) {
            boolean[] canEdit = new boolean[] {
                    false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit[columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableCustomer);
        if (jTableCustomer.getColumnModel().getColumnCount() > 0) {
            jTableCustomer.getColumnModel().getColumn(0).setResizable(false);
        }

        txtSearchStick.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        txtSearchStick.setText("İsminizi giriniz");
        txtSearchStick.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchStickMouseClicked(evt);
            }
        });
        txtSearchStick.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSearchStickActionPerformed(evt);
            }
        });

        lblNextCustomer.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblNextCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 230,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel2Layout
                                                .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                                .addComponent(txtSearchStick, javax.swing.GroupLayout.Alignment.LEADING,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)))
                                .addGap(66, 66, 66)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(txtSearchStick, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18,
                                        Short.MAX_VALUE)
                                .addComponent(lblNextCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 260,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param printCustomerTable(
     */
    private void btnGoManagementScreenActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnGoManagementScreenActionPerformed
        JLoginScreen.jInterfaceScreen.show();
        this.dispose();
    }// GEN-LAST:event_btnGoManagementScreenActionPerformed

    /**
     * @param printCustomerTable(
     */
    private void btnCustomerListActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCustomerListActionPerformed
        printCustomerTable();
    }// GEN-LAST:event_btnCustomerListActionPerformed

    /**
     * @param printCustomerTable(
     */
    private void btnAddCustomerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnAddCustomerActionPerformed
        addCustomerList();
        printCustomerTable();
    }// GEN-LAST:event_btnAddCustomerActionPerformed

    /**
     * @param printCustomerTable(
     */
    private void txtSearchStickActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtSearchStickActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtSearchStickActionPerformed

    private void txtSearchStickMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtSearchStickMouseClicked
        txtSearchStick.setText("");
    }// GEN-LAST:event_txtSearchStickMouseClicked

    /**
     * Kuyruk yapisina uygun olarak ilk eklenen müsteri kuyruktan cikartilir.
     * customerQueue sinifinin removeCustomer() methodu calisir.
     * Müsteri listesi yeniden yazdirilir.
     */

    private void btnDeleteCustomerActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnDeleteCustomerActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTableCustomer.getModel();
        customerQueue.removeCustomer();

        printCustomerTable();
    }// GEN-LAST:event_btnDeleteCustomerActionPerformed

    /**
     * Müsteri listesi jtable´da gösterilir.
     */

    public void printCustomerTable() {
        DefaultTableModel model = (DefaultTableModel) jTableCustomer.getModel();
        Object rowData[] = new Object[1];

        Node temp = customerQueue.front;
        Node next;

        model.getDataVector().removeAllElements();

        while (temp != null) {
            rowData[0] = ((Customer) temp.data).getName();

            temp = temp.next;
            model.addRow(rowData);
        }

    }

    /**
     * Kuyruk yapisina uygun olarak sona müsteri eklenir.
     * customerQueue sinifinin addCustomer() methodu calisir.
     */

    public void addCustomerList() {
        if (txtSearchStick.getText().equals("")) {
            lblNextCustomer.setText("Yanlış yada eksik isim girdiniz.");
        } else {
            customerQueue.addCustomer(new Customer(txtSearchStick.getText()));
        }
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JCustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCustomerList.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JCustomerList().setVisible(true);
            }
        });
    }

    // Degiskenler designer tarafindan tanimlanmistir.
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnCustomerList;
    private javax.swing.JButton btnDeleteCustomer;
    private javax.swing.JButton btnGoManagementScreen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCustomer;
    private javax.swing.JLabel lblNextCustomer;
    private javax.swing.JTextField txtSearchStick;
    // End of variables declaration//GEN-END:variables

}
