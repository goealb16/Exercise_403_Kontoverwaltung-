/*
#ProProgrammer
 */
package Account;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Account {

    private double val = 50;
    private String name;
    private ArrayList<User> users = new ArrayList();

    public synchronized void withdraw(double val) {
        if (this.val - val >= 0) {
            this.val -= val;
        } else {
            this.notifyAll();
            try {
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public synchronized void deposit(double val) {
        this.val += val;
        this.notifyAll();
    }

    public void addUser(User u) {
        this.users.add(u);
    }

    public Account(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public double getVal() {
        return val;
    }
    
    

}
