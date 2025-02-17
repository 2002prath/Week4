package org.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class Code8Test {

    Code8 checker = new Code8(40000);
    @Test
    public void depositmoney()
    {
        assertEquals(46000,checker.deposit(6000));
    }

    @Test
    public void withdrawmoney()
    {
        assertEquals(36000,checker.withdraw(4000));
    }
    @Test
    public void Finalbalance()
    {
        assertEquals(40000,checker.getBalance());
    }
}
