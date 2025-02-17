package org.example;

public class Code8
{
     double balance;

     public Code8(double CurrentBalance)
     {
         this.balance= CurrentBalance;
     }

     public double deposit(double amount)
     {
          balance = balance + amount;
         return balance ;
     }
     public double withdraw(double amount)
     {
         if(amount > balance)
         {
             System.out.println("Unable to process request");
             return 0;
         }
         balance = balance - amount;
         return balance ;
     }

     public double getBalance()
     {
         return balance;
     }

    public static void main(String[] args) {
        Code8 c = new Code8(40000);
        c.deposit(6000);
        c.withdraw(4000);
        System.out.println(c.getBalance());

    }
}
