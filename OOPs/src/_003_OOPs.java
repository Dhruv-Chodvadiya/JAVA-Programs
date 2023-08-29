public class _003_OOPs {
    public static void main(String[] args) {
        Account1 a2=new Account1();
        a2.setAccountDetails(12345,"Dhruv",10000);
        a2.deposit(5000);
        a2.withdraw(3000);
        a2.dispAccountDetails();
    }
}
class Account1{
    int accountNo;
    String custName;
    int accountBalance;

    public void setAccountDetails(int accountNo,String custName,int accountBalance){
        this.accountNo=accountNo;
        this.custName=custName;
        this.accountBalance=accountBalance;
    }
    public void withdraw(int withdraw){
        this.accountBalance=accountBalance-withdraw;
    }
    public void deposit(int deposit){
        this.accountBalance=accountBalance+deposit;
    }
    public void dispAccountDetails(){
        System.out.println("Account Number = "+accountNo+"\nCustomer Name ="+custName+"\nBalance = "+accountBalance);
    }
}
