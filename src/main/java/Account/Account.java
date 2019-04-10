/*
#ProProgrammer
 */
package Account;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Account {

    private double val;
    private String name;
    private ArrayList<User> users = new ArrayList();

    public Account(String name) {
        this.name = name;
        this.val = 50;
    }

    public Account(double val) {
        this.val = val;
    }
    
    public synchronized void withdraw(double ammount) {
        if (this.val - ammount >= 0) {
            this.val -= ammount;
        } else {
            this.notifyAll();
            try {
                System.out.println(Thread.currentThread().getName());
                this.wait();
            } catch (InterruptedException ex) {
                Logger.getLogger(Account.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public synchronized void deposit(double ammount) {
        this.val += ammount;
        this.notifyAll();
    }

    public void addUser(User u) {
        this.users.add(u);
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

    public void setName(String name) {
        this.name = name;
    }
    
    

}
