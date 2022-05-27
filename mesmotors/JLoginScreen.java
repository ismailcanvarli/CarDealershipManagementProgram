
package mesmotors;
//Bu main class ve login ekranı oluyor.

public class JLoginScreen extends javax.swing.JFrame {
    /**
     * Public ve static olarak JInterfaceScreen,CarList,CustomerQueue nesneleri
     * olusturulmustur.
     * Cünkü tek bir tane bu nesnelerden kullanilmasi ve bütün ekranlarda
     * kullanilmasi gerekirse ayni
     * nesne üzerinden islem yapabilmemiz icin.
     */
    public static JInterfaceScreen jInterfaceScreen = new JInterfaceScreen();
    static CarList carList = new CarList(new Car("Mercedes", "G Wagon", "White", 2019, 25000, 5500000));
    public static CustomerQueue customerQueue = new CustomerQueue();

    /**
     * Yeni JLoginScreen olusturulur.
     */
    public JLoginScreen() {
        initComponents();
    }

    /**
     * Designerdan otomatik olarak yazdirilan ayarlardir.
     * 
     */

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnEnter = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        btnExit = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        cboxShowPassword = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblMessage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Yönetici Giriş Ekranı");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesmotors/mes_motors_picture.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(52, 52, 52)
                                .addComponent(jLabel1)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));

        jPanel3.setBackground(new java.awt.Color(204, 0, 51));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnEnter.setBackground(new java.awt.Color(0, 0, 51));
        btnEnter.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnEnter.setForeground(new java.awt.Color(204, 0, 51));
        btnEnter.setText("Giriş Yap");
        btnEnter.setBorder(null);
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        txtName.setBackground(new java.awt.Color(204, 0, 51));
        txtName.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 51));
        txtName.setText("Kullanıcı Adı");
        txtName.setBorder(null);
        txtName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNameFocusGained(evt);
            }
        });
        txtName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNameMouseClicked(evt);
            }

            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txtNameMouseEntered(evt);
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                txtNameMouseExited(evt);
            }
        });
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        txtName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtNameKeyPressed(evt);
            }
        });

        txtPassword.setBackground(new java.awt.Color(204, 0, 51));
        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtPassword.setForeground(new java.awt.Color(0, 0, 51));
        txtPassword.setText("şifre");
        txtPassword.setToolTipText("");
        txtPassword.setBorder(null);
        txtPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPasswordFocusGained(evt);
            }
        });
        txtPassword.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtPasswordMouseClicked(evt);
            }
        });
        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });

        btnExit.setBackground(new java.awt.Color(0, 0, 51));
        btnExit.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnExit.setForeground(new java.awt.Color(204, 0, 51));
        btnExit.setText("Çıkış");
        btnExit.setBorder(null);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        jSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        cboxShowPassword.setBackground(new java.awt.Color(204, 0, 51));
        cboxShowPassword.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cboxShowPassword.setForeground(new java.awt.Color(0, 0, 51));
        cboxShowPassword.setText("Şifreyi Göster");
        cboxShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxShowPasswordActionPerformed(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(0, 0, 51));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesmotors/user_30px.png"))); // NOI18N

        jLabel3.setForeground(new java.awt.Color(0, 0, 51));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesmotors/padlock_30px.png"))); // NOI18N

        lblMessage.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(37, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(btnEnter, javax.swing.GroupLayout.Alignment.TRAILING,
                                                javax.swing.GroupLayout.PREFERRED_SIZE, 97,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout
                                                .createSequentialGroup()
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel2)
                                                        .addComponent(jLabel3))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                188, Short.MAX_VALUE)
                                                        .addComponent(txtName, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                188, Short.MAX_VALUE)
                                                        .addComponent(txtPassword, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                188, Short.MAX_VALUE)
                                                        .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                188, Short.MAX_VALUE)
                                                        .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                Short.MAX_VALUE))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cboxShowPassword)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 84,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap()));
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(46, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtPassword,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE, 17,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(cboxShowPassword))
                                                .addGap(2, 2, 2)
                                                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(btnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGap(8, 8, 8)
                                                .addComponent(lblMessage, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addContainerGap()));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param (employee.login(txtName.getText()
     * @param txtPassword.getText())
     */
    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtNameActionPerformed

    }// GEN-LAST:event_txtNameActionPerformed

    /**
     * Butona basildiginda giris islemine girer ve login fonksiyonuna dallanilir.
     * 
     * @param (employee.login(txtName.getText()
     * @param txtPassword.getText())
     *                                          Arayüze kullanan kisinin girdigi
     *                                          kullanici adi ve sifre methodlara
     *                                          parametre olarak gönderilir.
     */
    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnEnterActionPerformed
        Employee employee = new Employee();

        if (employee.login(txtName.getText(), txtPassword.getText())) {
            jInterfaceScreen.show();
            dispose();
        } else {
            lblMessage.setText("Kullanıcı adı veya şifre yanlış.");
        }
    }// GEN-LAST:event_btnEnterActionPerformed

    /**
     * @param (cboxShowPassword.isSelected()
     *                                       Uygulamdan cikis yapilir.
     */
    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnExitActionPerformed
        dispose();
    }// GEN-LAST:event_btnExitActionPerformed

    /**
     * @param (cboxShowPassword.isSelected()
     *                                       Girilen sifrenin acikca gösterilmesi
     *                                       saglanir.
     */
    private void cboxShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_cboxShowPasswordActionPerformed
        if (cboxShowPassword.isSelected()) {
            txtPassword.setEchoChar((char) 0);
        } else {
            txtPassword.setEchoChar('*');
        }
    }// GEN-LAST:event_cboxShowPasswordActionPerformed

    /**
     * @param args[]
     */
    private void txtNameMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtNameMouseClicked
        txtName.setText("");
    }// GEN-LAST:event_txtNameMouseClicked

    /**
     * @param args[]
     */
    private void txtNameMouseEntered(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtNameMouseEntered

    }// GEN-LAST:event_txtNameMouseEntered

    /**
     * @param args[]
     */
    private void txtNameMouseExited(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtNameMouseExited
        // TODO add your handling code here:
    }// GEN-LAST:event_txtNameMouseExited

    /**
     * @param args[]
     */
    private void txtNameKeyPressed(java.awt.event.KeyEvent evt) {// GEN-FIRST:event_txtNameKeyPressed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtNameKeyPressed

    /**
     * @param args[]
     */
    private void txtNameFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtNameFocusGained

    }// GEN-LAST:event_txtNameFocusGained

    /**
     * @param args[]
     */
    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_txtPasswordActionPerformed

    /**
     * @param args[]
     */
    private void txtPasswordFocusGained(java.awt.event.FocusEvent evt) {// GEN-FIRST:event_txtPasswordFocusGained

    }// GEN-LAST:event_txtPasswordFocusGained

    /**
     * @param args[]
     */
    private void txtPasswordMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_txtPasswordMouseClicked
        txtPassword.setText("");
    }

    /**
     * @param args
     *             Main code kismidir.Program buradan baslatilir.
     */
    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JLoginScreen.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }

        /* Giris ekrani görünür hale getirilr. */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JLoginScreen().setVisible(true);
            }
        });

        carList.createDefaultCar();
    }

    // Degiskenler designer tarafindan tanimlanmistir.
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnExit;
    private javax.swing.JCheckBox cboxShowPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblMessage;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    // End of variables declaration//GEN-END:variables
}
