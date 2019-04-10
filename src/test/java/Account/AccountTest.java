/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Account;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Alex
 */
public class AccountTest {
    
    public AccountTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of withdraw method, of class Account.
     */
    @Test
    public void testWithdraw1() {
        double ammount = 20.0;
        Account instance = new Account(20);
        instance.withdraw(ammount);
    }

    @Test
    public void testWithdraw2() {
        double ammount = 20.0;
        Account instance = new Account(20);
        instance.withdraw(ammount);
    }
    
    @Test
    public void testWithdraw3() {
        double ammount = 20.0;
        Account instance = new Account(30);
        instance.withdraw(ammount);
    }
    /**
     * Test of deposit method, of class Account.
     */
    @Test
    public void testDeposit1() {
        double ammount = 20.0;
        Account instance = new Account(0);
        instance.deposit(ammount);
    }
    
    @Test
    public void testDeposit2() {
        double ammount = 20.0;
        Account instance = new Account(10);
        instance.deposit(ammount);
    }
    
    @Test
    public void testDeposit3() {
        double ammount = 20.0;
        Account instance = new Account(-10);
        instance.deposit(ammount);
    }
}
