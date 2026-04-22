class Main{
  public static void main(String[] args){
    BankAccount ba = new BankAccount();
    ba.deposit(10000);
    ba.withdraw(3000);
    System.out.println("Current balance " + ba.getBalance());
  }
}

class BankAccount{
  private double balance;
  
  public void deposit(double amount){
    balance += amount;
    System.out.println(amount +" is deposited");
  }
  
  public double withdraw(double amount){
    if(balance>=amount){
      balance -= amount;
      System.out.println(amount +" is withdrawn");
    }
    return balance;
  }
  
  public double getBalance(){
    return balance;
  }
}
