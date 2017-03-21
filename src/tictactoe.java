
import util.Sutil;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class tictactoe extends javax.swing.JFrame {

    /**
     * Creates new form tictactoe
     */
    public tictactoe() {
        initComponents();
        
        setLocationRelativeTo(null);
        updateTurn();
        checkWin();
    }
    
    private void updateTurn() {
        if (turn % 2 == 1) {
            lblInfo.setText("Player-1 turn!");
        }
        else {
            lblInfo.setText("Player-2 turn!");
        }
    }
    
    private int turn = 1;
    
    private void checkWin() {
        // Player-1
        if (btnA.getText().equals("X") && btnB.getText().equals("X") && btnC.getText().equals("X")){
            
            Sutil.msg(this, "Player-1 (X) Win!\n Game Over.");
            btnD.setEnabled(false);
            btnE.setEnabled(false);
            btnF.setEnabled(false);
            btnG.setEnabled(false);
            btnH.setEnabled(false);
            btnI.setEnabled(false);
        }
        else if (btnA.getText().equals("X") && btnD.getText().equals("X")&& btnG.getText().equals("X")){
            Sutil.msg(this, "Player-1 (X) Win!\n Game Over.");
            btnB.setEnabled(false);
            btnC.setEnabled(false);
            btnE.setEnabled(false);
            btnF.setEnabled(false);
            btnH.setEnabled(false);
            btnI.setEnabled(false);
            
        }
        else if (btnA.getText().equals("X")&& btnE.getText().equals("X") && btnI.getText().equals("X")) {
            Sutil.msg(this, "Player-1 (X) Win!\n Game Over.");
            btnB.setEnabled(false);
            btnC.setEnabled(false);
            btnD.setEnabled(false);
            btnF.setEnabled(false);
            btnG.setEnabled(false);
            btnH.setEnabled(false);
        }
        else if (btnB.getText().equals("X") && btnE.getText().equals("X") && btnH.getText().equals("X")) {
            Sutil.msg(this, "Player-1 (X) Win!\n Game Over.");
            btnA.setEnabled(false);
            btnC.setEnabled(false);
            btnD.setEnabled(false);
            btnF.setEnabled(false);
            btnG.setEnabled(false);
            btnI.setEnabled(false);
        }
        else if (btnC.getText().equals("X") && btnF.getText().equals("X") && btnI.getText().equals("X")) {
            Sutil.msg(this, "Player-1 (X) Win!\n Game Over.");
            btnA.setEnabled(false);
            btnB.setEnabled(false);
            btnD.setEnabled(false);
            btnE.setEnabled(false);
            btnG.setEnabled(false);
            btnH.setEnabled(false);
        }
        else if (btnC.getText().equals("X") && btnE.getText().equals("X") && btnG.getText().equals("X")) {
            Sutil.msg(this, "Player-1 (X) Win!\n Game Over.");
            btnA.setEnabled(false);
            btnB.setEnabled(false);
            btnD.setEnabled(false);
            btnF.setEnabled(false);
            btnH.setEnabled(false);
            btnI.setEnabled(false);
        }
        else if (btnD.getText().equals("X") && btnE.getText().equals("X") && btnF.getText().equals("X")) {
            Sutil.msg(this, "Player-1 (X) Win!\n Game Over.");
            btnA.setEnabled(false);
            btnB.setEnabled(false);
            btnC.setEnabled(false);
            btnG.setEnabled(false);
            btnH.setEnabled(false);
            btnI.setEnabled(false);
        }
        else if (btnG.getText().equals("X") && btnH.getText().equals("X") && btnI.getText().equals("X")) {
            Sutil.msg(this, "Player-1 (X) Win!\n Game Over.");
            btnA.setEnabled(false);
            btnB.setEnabled(false);
            btnC.setEnabled(false);
            btnD.setEnabled(false);
            btnE.setEnabled(false);
            btnF.setEnabled(false);
        }
        // Player-2
        if (btnA.getText().equals("O") && btnB.getText().equals("O") && btnC.getText().equals("O")){
            Sutil.msg(this, "Player-2 (O) Win!\n Game Over.");
            btnD.setEnabled(false);
            btnE.setEnabled(false);
            btnF.setEnabled(false);
            btnG.setEnabled(false);
            btnH.setEnabled(false);
            btnI.setEnabled(false);
        }
        else if (btnA.getText().equals("O") && btnD.getText().equals("O") && btnG.getText().equals("O") ) {
            Sutil.msg(this, "Player-2 (O) Win!\n Game Over.");
            btnB.setEnabled(false);
            btnC.setEnabled(false);
            btnE.setEnabled(false);
            btnF.setEnabled(false);
            btnH.setEnabled(false);
            btnI.setEnabled(false);
        }
        else if (btnA.getText().equals("O") && btnE.getText().equals("O") && btnI.getText().equals("O") ) {
            Sutil.msg(this, "Player-2 (O) Win!\n Game Over.");
            btnB.setEnabled(false);
            btnC.setEnabled(false);
            btnD.setEnabled(false);
            btnF.setEnabled(false);
            btnG.setEnabled(false);
            btnH.setEnabled(false);
        }
        else if (btnB.getText().equals("O") && btnE.getText().equals("O") && btnH.getText().equals("O") ) {
            Sutil.msg(this, "Player-2 (O) Win!\n Game Over.");
            btnA.setEnabled(false);
            btnC.setEnabled(false);
            btnD.setEnabled(false);
            btnF.setEnabled(false);
            btnG.setEnabled(false);
            btnI.setEnabled(false);
        }
        else if (btnC.getText().equals("O") && btnF.getText().equals("O") && btnI.getText().equals("O") ) {
            Sutil.msg(this, "Player-2 (O) Win!\n Game Over.");
            btnA.setEnabled(false);
            btnB.setEnabled(false);
            btnD.setEnabled(false);
            btnE.setEnabled(false);
            btnG.setEnabled(false);
            btnH.setEnabled(false);
        }
        else if (btnC.getText().equals("O") && btnE.getText().equals("O") && btnG.getText().equals("O") ) {
            Sutil.msg(this, "Player-2 (O) Win!\n Game Over.");
            btnA.setEnabled(false);
            btnB.setEnabled(false);
            btnD.setEnabled(false);
            btnF.setEnabled(false);
            btnH.setEnabled(false);
            btnI.setEnabled(false);
        }
        else if (btnD.getText().equals("O") && btnE.getText().equals("O") && btnF.getText().equals("O") ) {
            Sutil.msg(this, "Player-2 (O) Win!\n Game Over.");
            btnA.setEnabled(false);
            btnB.setEnabled(false);
            btnC.setEnabled(false);
            btnG.setEnabled(false);
            btnH.setEnabled(false);
            btnI.setEnabled(false);
        }
        else if (btnG.getText().equals("O") && btnH.getText().equals("O") && btnI.getText().equals("O") ) {
            Sutil.msg(this, "Player-2 (O) Win!\n Game Over.");
            Sutil.msg(this, "Player-1 (X) Win!\n Game Over.");
            btnA.setEnabled(false);
            btnB.setEnabled(false);
            btnC.setEnabled(false);
            btnD.setEnabled(false);
            btnE.setEnabled(false);
            btnF.setEnabled(false);
        }
        
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnA = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnE = new javax.swing.JButton();
        btnF = new javax.swing.JButton();
        btnG = new javax.swing.JButton();
        btnH = new javax.swing.JButton();
        btnI = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnFile = new javax.swing.JMenu();
        mnNew = new javax.swing.JMenuItem();
        mnExit = new javax.swing.JMenuItem();
        mnEdit = new javax.swing.JMenu();
        mnAbout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Swing Tic Tac Toe");
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnA.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });

        btnB.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });

        btnC.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });

        btnD.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });

        btnE.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEActionPerformed(evt);
            }
        });

        btnF.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFActionPerformed(evt);
            }
        });

        btnG.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGActionPerformed(evt);
            }
        });

        btnH.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHActionPerformed(evt);
            }
        });

        btnI.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        btnI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIActionPerformed(evt);
            }
        });

        lblInfo.setText("...");
        lblInfo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnA, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnG, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnH, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnF, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnA, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                    .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnB, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnD, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnF, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnG, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnI, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnE, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnH, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblInfo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnA, btnB, btnC, btnD, btnE, btnF, btnG, btnH, btnI});

        mnFile.setText("System");

        mnNew.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        mnNew.setText("New Game");
        mnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnNewActionPerformed(evt);
            }
        });
        mnFile.add(mnNew);

        mnExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        mnExit.setText("Exit");
        mnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnExitActionPerformed(evt);
            }
        });
        mnFile.add(mnExit);

        jMenuBar1.add(mnFile);

        mnEdit.setText("Help");

        mnAbout.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        mnAbout.setText("About");
        mnAbout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mnAboutActionPerformed(evt);
            }
        });
        mnEdit.add(mnAbout);

        jMenuBar1.add(mnEdit);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        // TODO add your handling code here:
        if (turn % 2 == 1 ) {
            btnC.setText("X");
            turn++;
        }
        else  {
            btnC.setText("O");
            turn++;
        }
        updateTurn();
        btnC.setEnabled(false);
        checkWin();
        checkDraw();
    }//GEN-LAST:event_btnCActionPerformed

    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        // TODO add your handling code here:
        if (turn % 2 == 1 ) {
            btnB.setText("X");
            turn++;
            
        }
        else {
            btnB.setText("O");
            turn++;
        }
        updateTurn();
        btnB.setEnabled(false);
        checkWin();
        checkDraw();
    }//GEN-LAST:event_btnBActionPerformed

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        // TODO add your handling code here:
        if (turn % 2 == 1) {
            btnA.setText("X");
            turn++;
        }
        else {
            btnA.setText("O");
            turn++;
        }
        updateTurn();
        btnA.setEnabled(false);
        checkWin();
        checkDraw();
    }//GEN-LAST:event_btnAActionPerformed

    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        // TODO add your handling code here:
        if (turn % 2 == 1) {
            btnD.setText("X");
            turn++;
        }
        else {
            btnD.setText("O");
            turn++;
        }
        updateTurn();
        btnD.setEnabled(false);
        checkWin();
        checkDraw();
    }//GEN-LAST:event_btnDActionPerformed

    private void btnEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEActionPerformed
        // TODO add your handling code here:
        if (turn % 2 == 1) {
            btnE.setText("X");
            turn++;
        }
        else{
            btnE.setText("O");
            turn++;
        }
        updateTurn();
        btnE.setEnabled(false);
        checkWin();
        checkDraw();
    }//GEN-LAST:event_btnEActionPerformed

    private void btnFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFActionPerformed
        // TODO add your handling code here:
        if (turn% 2 == 1) {
            btnF.setText("X");
            turn++;
        }
        else  {
            btnF.setText("O");
            turn++;
        }
        updateTurn();
        btnF.setEnabled(false);
        checkWin();
        checkDraw();
    }//GEN-LAST:event_btnFActionPerformed

    private void btnGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGActionPerformed
        // TODO add your handling code here:
        if (turn % 2 == 1) {
            btnG.setText("X");
            turn++;
        }
        else {
            btnG.setText("O");
            turn++;
        }
        updateTurn();
        btnG.setEnabled(false);
        checkWin();
        checkDraw();
    }//GEN-LAST:event_btnGActionPerformed

    private void btnHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHActionPerformed
        // TODO add your handling code here:
        if (turn % 2 == 1) {
            btnH.setText("X");
            turn++;
        }
        else {
            btnH.setText("O");
            turn++;
        }
        updateTurn();
        btnH.setEnabled(false);
        checkWin();
        checkDraw();
    }//GEN-LAST:event_btnHActionPerformed

    private void checkDraw() {
        if (turn==10) {
            Sutil.msg(this, "Draw!\nGame Over.");
        }
    }
    
    private void btnIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIActionPerformed
        // TODO add your handling code here:
        if (turn% 2 == 1) {
            btnI.setText("X");
            turn++;
        }
        else  {
            btnI.setText("O");
            turn++;
        }
        updateTurn();
        btnI.setEnabled(false);
        checkWin();
        checkDraw();
    }//GEN-LAST:event_btnIActionPerformed

    private void mnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnNewActionPerformed
        // TODO add your handling code here:
        btnA.setText("");
        btnB.setText("");
        btnC.setText("");
        btnD.setText("");
        btnE.setText("");
        btnF.setText("");
        btnG.setText("");
        btnH.setText("");
        btnI.setText("");
        
        btnA.setEnabled(true);
        btnB.setEnabled(true);
        btnC.setEnabled(true);
        btnD.setEnabled(true);
        btnE.setEnabled(true);
        btnF.setEnabled(true);
        btnG.setEnabled(true);
        btnH.setEnabled(true);
        btnI.setEnabled(true);
        
        turn = 1;
        lblInfo.setText("New Game. Player-1 Turn!");
        
    }//GEN-LAST:event_mnNewActionPerformed

    private void mnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnExitActionPerformed
        // TODO add your handling code here:
        if (Sutil.msq(this, "Are you sure?") == 0) {
             System.exit(0);
        }
        else {
            
        }

    
        
    }//GEN-LAST:event_mnExitActionPerformed

    private void mnAboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mnAboutActionPerformed
        // TODO add your handling code here:
        Sutil.msg(this, "Swing Tic Tac Toe\n Version 1.0 \n Author : Valerie Leonie");
    }//GEN-LAST:event_mnAboutActionPerformed

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
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tictactoe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tictactoe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnE;
    private javax.swing.JButton btnF;
    private javax.swing.JButton btnG;
    private javax.swing.JButton btnH;
    private javax.swing.JButton btnI;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JMenuItem mnAbout;
    private javax.swing.JMenu mnEdit;
    private javax.swing.JMenuItem mnExit;
    private javax.swing.JMenu mnFile;
    private javax.swing.JMenuItem mnNew;
    // End of variables declaration//GEN-END:variables
}
