/*
#ProProgrammer
*/
package Account;

import java.util.Random;


public class User{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    
    public String performTest(int i,Account acc){
        double ammount= new Random().nextInt(50-10+1)+10;
        if(i == 0){
            acc.deposit(ammount);
            return new String().format("%s deposited %f Euro", name,ammount);
        }else{
            acc.withdraw(ammount);
            return new String().format("%s withdrawed %f Euro", name,ammount);
        }
    }

    @Override
    public String toString() {
        return  name;
    }
    
    
    
}
