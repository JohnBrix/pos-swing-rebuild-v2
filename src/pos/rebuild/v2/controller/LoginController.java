/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos.rebuild.v2.controller;

import javax.swing.JFrame;

/**
 *
 * @author john brix17
 */
public class LoginController extends javax.swing.JFrame {

    /**
     * Creates new form LoginController
     */
    int xMouse;
    int yMouse;

    public LoginController() {
        initComponents();
        int xx = 0;
        int yy = 0;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        login = new rojerusan.RSMaterialButtonRectangle();
        No_account_display = new javax.swing.JLabel();
        Createone_display = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        password = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        username = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        login_header1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setTitle("Pos fastfood");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(null);

        panel1.setBackground(new java.awt.Color(44, 62, 80));
        panel1.setForeground(new java.awt.Color(44, 62, 80));
        panel1.setLayout(null);
        getContentPane().add(panel1);
        panel1.setBounds(0, 0, 420, 500);

        panel2.setBackground(new java.awt.Color(255, 255, 255));
        panel2.setLayout(null);

        login.setBackground(new java.awt.Color(23, 32, 42));
        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        panel2.add(login);
        login.setBounds(50, 370, 250, 50);

        No_account_display.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        No_account_display.setForeground(new java.awt.Color(155, 155, 155));
        No_account_display.setText("No account? ");
        panel2.add(No_account_display);
        No_account_display.setBounds(110, 420, 80, 30);

        Createone_display.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        Createone_display.setForeground(new java.awt.Color(0, 102, 255));
        Createone_display.setText("Create one!");
        Createone_display.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Createone_displayMouseClicked(evt);
            }
        });
        panel2.add(Createone_display);
        Createone_display.setBounds(190, 420, 80, 30);

        jCheckBox1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/icons8-closed-eye-24.png"))); // NOI18N
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        panel2.add(jCheckBox1);
        jCheckBox1.setBounds(310, 290, 30, 40);

        password.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        password.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        password.setOpaque(false);
        password.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                passwordFocusLost(evt);
            }
        });
        panel2.add(password);
        password.setBounds(50, 290, 250, 40);

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel1.setText("Password");
        panel2.add(jLabel1);
        jLabel1.setBounds(50, 260, 100, 30);

        username.setFont(new java.awt.Font("Yu Gothic UI Light", 0, 20)); // NOI18N
        username.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(153, 153, 153)));
        username.setOpaque(false);
        username.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                usernameFocusLost(evt);
            }
        });
        username.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameActionPerformed(evt);
            }
        });
        panel2.add(username);
        username.setBounds(50, 200, 250, 40);

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 14)); // NOI18N
        jLabel4.setText("Username");
        panel2.add(jLabel4);
        jLabel4.setBounds(50, 170, 100, 30);

        login_header1.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 55)); // NOI18N
        login_header1.setText("Login");
        panel2.add(login_header1);
        login_header1.setBounds(100, 30, 150, 80);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 30)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("-");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        panel2.add(jLabel3);
        jLabel3.setBounds(320, 0, 30, 30);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        panel2.add(jLabel2);
        jLabel2.setBounds(350, 0, 30, 30);

        getContentPane().add(panel2);
        panel2.setBounds(420, 0, 390, 500);

        getAccessibleContext().setAccessibleDescription("");

        setSize(new java.awt.Dimension(805, 499));
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {                                      
        String user = username.getText();
        String pass = password.getText();
        if (user.contains("cashier") && pass.contains("cashier")) {
            CashierController admin = new CashierController();

            admin.setVisible(true);
            admin.setLocationRelativeTo(null);

            dispose();
        }
        else{
             System.out.print("PUTANGINA MO ");
        DashboardController admin = new DashboardController();
        admin.setVisible(true);
        admin.setLocationRelativeTo(null);

        dispose();
        }
       

    }                                     

    private void Createone_displayMouseClicked(java.awt.event.MouseEvent evt) {                                               

    }                                              

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        if (jCheckBox1.isSelected()) {
            password.setEchoChar((char) 0);
        } else {
            password.setEchoChar('???');
        }

    }                                          

    private void passwordFocusGained(java.awt.event.FocusEvent evt) {                                     

    }                                    

    private void passwordFocusLost(java.awt.event.FocusEvent evt) {                                   

    }                                  

    private void usernameFocusGained(java.awt.event.FocusEvent evt) {                                     

    }                                    

    private void usernameFocusLost(java.awt.event.FocusEvent evt) {                                   


    }                                  

    private void usernameActionPerformed(java.awt.event.ActionEvent evt) {                                         

    }                                        

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {                                     
        //fade

        this.setState(JFrame.ICONIFIED);

    }                                    

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {                                     
        for (double i = 1.0; i >= 0.0; i = i - 0.1) {
            String val = i + "";
            float f = Float.valueOf(val);
            this.setOpacity(f);
            try {
                Thread.sleep(30);
            } catch (Exception e) {

            }
        }

        System.exit(0);
    }                                    

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
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginController.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginController().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel Createone_display;
    private javax.swing.JLabel No_account_display;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private rojerusan.RSMaterialButtonRectangle login;
    private javax.swing.JLabel login_header1;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JPasswordField password;
    private javax.swing.JTextField username;
    // End of variables declaration                   
}
