/*
#ProProgrammer
*/
package Account;

import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;


public class User{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public String performTest(boolean i,Account acc){
        double ammount= new Random().nextInt(50-10+1)+10;
        try {
            Thread.sleep(new Random().nextInt(3000-1+1)+1);
        } catch (InterruptedException ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
        }
                    
        if(i){
            acc.deposit(ammount);
            return new String().format("%s deposited %.2f Euro \n", name,ammount);
        }else{
            acc.withdraw(ammount);
            return new String().format("%s withdrawed %.2f Euro\n", name,ammount);
        }
    }

    @Override
    public String toString() {
        return  name;
    }
    
    
    
}
