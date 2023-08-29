public class _002_OOPs {
    public static void main(String[] args) {
        Account a1=new Account(12345,"Dhruv",10000,8);
        a1.calculateInterest();
        a1.displayAccountDetails();
    }
}
class Account{
    int accountNumber;
    String custName;
    int balance;
    int interestRate;
    int total;
    Account(int accountNumber,String custName,int balance,int interestRate){
        this.accountNumber=accountNumber;
        this.custName=custName;
        this.balance=balance;
        this.interestRate=interestRate;
    }
    public void calculateInterest(){
        total = balance + (interestRate*balance)/100;
    }
    public void displayAccountDetails(){
        System.out.println("Account Number = "+accountNumber+"\nCustomer Name = "+custName+"\nBalance = "+total);
    }
}
