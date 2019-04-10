package GUI;

import Account.Account;
import Account.User;
import java.awt.Component;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JOptionPane;

public class KontoGUI extends java.awt.Frame {

    private Account acc;
    private ArrayList<Account> accounts = new ArrayList<Account>();
    private DefaultListModel model = new DefaultListModel<>();
    
    public KontoGUI() {
        initComponents();
        this.acc = new Account("default");
        accounts.add(acc);
        
        this.lbCurrentAcc.setText(acc.getName());
        jList1.setModel(model);
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
        jtfOutput = new javax.swing.JTextArea();
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
        cbMiDefault.setEnabled(false);
        cbMiDefault.setName("default"); // NOI18N
        cbMiDefault.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbMiDefaultItemStateChanged(evt);
            }
        });
        menuAvailableAcc.add(cbMiDefault);

        jPopupMenu2.add(menuAvailableAcc);

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                exitForm(evt);
            }
        });

        jtfOutput.setColumns(20);
        jtfOutput.setRows(5);
        jtfOutput.setBorder(javax.swing.BorderFactory.createTitledBorder("Log-Output"));
        jtfOutput.setComponentPopupMenu(jPopupMenu2);
        jScrollPane1.setViewportView(jtfOutput);

        jScrollPane2.setComponentPopupMenu(jPopupMenu1);

        jList1.setBorder(javax.swing.BorderFactory.createTitledBorder("User"));
        jList1.setComponentPopupMenu(jPopupMenu1);
        jScrollPane2.setViewportView(jList1);

        lbVal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbVal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbVal.setText("50 , 00 Euro");
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
        model.addElement(c);
    }//GEN-LAST:event_miAddUserActionPerformed

    private void miPerformTestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPerformTestActionPerformed
        new Thread(new Runnable() {
            @Override
            public void run() {
                ArrayList<User> users = acc.getUsers();
                ArrayList<User> selectUsers = new ArrayList<User>();
                int[] select = jList1.getSelectedIndices();
                for (int i : select) {
                    selectUsers.add(users.get(i));
                }
                
                for (User user : selectUsers) {
                    Thread t = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            for (int i = 0; i < 10; i++) {
                                jtfOutput.append(user.performTest(new Random().nextBoolean(), acc));
                                lbVal.setText(acc.getVal() + " Euro");
                            }
                        }
                    });
                    t.setName(user.getName());
                    t.setPriority(Thread.MAX_PRIORITY);
                    t.start();
                }
                
            }

        }).start();

    }//GEN-LAST:event_miPerformTestActionPerformed

    private void miAddAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miAddAccountActionPerformed
        acc = new Account(JOptionPane.showInputDialog("Name: "));
        for (Account account : accounts) {
            while (account.getName().equalsIgnoreCase(acc.getName())) {
                acc.setName(acc.getName() + "Copy");
            }
        }
        accounts.add(acc);
        
        this.lbCurrentAcc.setText(acc.getName());
        this.lbVal.setText(acc.getVal() + " Euro");
        this.jtfOutput.setText("");
        this.model.clear();

        for (Component menuComponent : menuAvailableAcc.getMenuComponents()) {
            ((JCheckBoxMenuItem) menuComponent).setSelected(false);
            ((JCheckBoxMenuItem) menuComponent).setEnabled(true);
        }
        
        JCheckBoxMenuItem item = new JCheckBoxMenuItem(acc.getName());
        item.setName(acc.getName());
        
        item.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent ie) {
                JCheckBoxMenuItem item = (JCheckBoxMenuItem) ie.getSource();
                if (item.isEnabled()) {
                    checkBoxChanged(item);
                }
            }
        });
        item.setSelected(true);
        item.setEnabled(false);
        this.menuAvailableAcc.add(item);
    }//GEN-LAST:event_miAddAccountActionPerformed

    private void cbMiDefaultItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbMiDefaultItemStateChanged
        JCheckBoxMenuItem item = (JCheckBoxMenuItem) evt.getSource();
        if (item.isEnabled()) {
            checkBoxChanged(item);
        }
    }//GEN-LAST:event_cbMiDefaultItemStateChanged

    private void checkBoxChanged(JCheckBoxMenuItem item) {
        for (Account account : accounts) {
            if (account.getName().equalsIgnoreCase(item.getName())) {
                acc = account;
                for (Component menuComponent : menuAvailableAcc.getMenuComponents()) {
                    ((JCheckBoxMenuItem) menuComponent).setSelected(false);
                    ((JCheckBoxMenuItem) menuComponent).setEnabled(true);
                }
                model.clear();
                for (User user : acc.getUsers()) {
                    this.model.addElement(user);
                }
                
                this.lbCurrentAcc.setText(acc.getName());
                this.lbVal.setText(acc.getVal() + " Euro");
                this.jtfOutput.setText("");
                
                item.setEnabled(false);
                item.setSelected(true);
            }
        }
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
    private javax.swing.JTextArea jtfOutput;
    private javax.swing.JLabel lbCurrentAcc;
    private javax.swing.JLabel lbVal;
    private javax.swing.JMenu menuAvailableAcc;
    private javax.swing.JMenuItem miAddAccount;
    private javax.swing.JMenuItem miAddUser;
    private javax.swing.JMenuItem miPerformTest;
    // End of variables declaration//GEN-END:variables

}
