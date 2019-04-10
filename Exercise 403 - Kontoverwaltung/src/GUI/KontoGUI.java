

package GUI;

import Account.Account;
import Account.User;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JOptionPane;


public class KontoGUI extends java.awt.Frame {
private Account acc;
private ArrayList<Account> accounts = new ArrayList<Account>();

    public KontoGUI() {
        initComponents();
        this.acc = new Account("default");
        this.lbCurrentAcc.setText(acc.getName());
    }

   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        miAddUser = new javax.swing.JMenuItem();
        miPerformTest = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        miAddAccount = new javax.swing.JMenuItem();
        menuAvailableAcc = new javax.swing.JMenu();
        cbMiDefault = new javax.swing.JCheckBoxMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        lbVal = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbCurrentAcc = new javax.swing.JLabel();

        miAddUser.setText("Add user");
        miAddUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddUserActionPerformed(evt);
            }
        });
        jPopupMenu1.add(miAddUser);

        miPerformTest.setText("Perform account test");
        miPerformTest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPerformTestActionPerformed(evt);
            }
        });
        jPopupMenu1.add(miPerformTest);

        miAddAccount.setText("add account");
        miAddAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miAddAccountActionPerformed(evt);
            }
        });
        jPopupMenu2.add(miAddAccount);

        menuAvailableAcc.setText("Available Accounts");

        cbMiDefault.setSelected(true);
        cbMiDefault.setText("Default");
        menuAvailableAcc.add(cbMiDefault);

        jPopupMenu2.add(menuAvailableAcc);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(javax.swing.BorderFactory.createTitledBorder("Log-Output"));
        jTextArea1.setComponentPopupMenu(jPopupMenu2);
        jScrollPane1.setViewportView(jTextArea1);

        jScrollPane2.setComponentPopupMenu(jPopupMenu1);

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder("User"));
        jList1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(jList1);

        lbVal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbVal.setText("00 , 00 Euro");
        lbVal.setBorder(javax.swing.BorderFactory.createTitledBorder("Account"));

        jLabel2.setText("Current Account: ");
        jLabel2.setToolTipText("");

        lbCurrentAcc.setText(" ");
        lbCurrentAcc.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbVal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbCurrentAcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lbCurrentAcc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 264, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbVal, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void exitForm(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_exitForm
        System.exit(0);
    }//GEN-LAST:event_exitForm

    private void miAddUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddUserActionPerformed
        User c = new User(JOptionPane.showInputDialog("Name: "));
        acc.addUser(c);
    }//GEN-LAST:event_miAddUserActionPerformed

    private void miPerformTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPerformTestActionPerformed
        ArrayList<User> users = acc.getUsers();
        for (int i = 0; i < 10; i++) {
            int index = new Random().nextInt(users.size()+1);
            User u = users.get(index);
            
            
        }
    }//GEN-LAST:event_miPerformTestActionPerformed

    private void miAddAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddAccountActionPerformed
        acc = new Account(JOptionPane.showInputDialog("Name: "));
        this.lbCurrentAcc.setText(acc.getName());
        this.lbVal.setText(acc.getVal()+" Euro");
        
        for (Component menuComponent : menuAvailableAcc.getMenuComponents()) {
            ((JCheckBoxMenuItem) menuComponent).setSelected(false);
        }
        
        this.menuAvailableAcc.add(new JCheckBoxMenuItem(acc.getName())).setSelected(true);
    }//GEN-LAST:event_miAddAccountActionPerformed

    private void checkBoxChanged(JCheckBoxMenuItem item){
        
    }
    
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KontoGUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBoxMenuItem cbMiDefault;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lbCurrentAcc;
    private javax.swing.JLabel lbVal;
    private javax.swing.JMenu menuAvailableAcc;
    private javax.swing.JMenuItem miAddAccount;
    private javax.swing.JMenuItem miAddUser;
    private javax.swing.JMenuItem miPerformTest;
    // End of variables declaration//GEN-END:variables

}
