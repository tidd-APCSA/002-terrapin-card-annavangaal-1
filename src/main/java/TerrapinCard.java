public class TerrapinCard {

  private double balance;

  public TerrapinCard(double balance) {
    this.balance = balance;
  }

  public String toString() {
    return "The card has " + balance + " dollars";
  }

  public void payEconomical(){
    if(balance >= 2.50){
      balance -= 2.50;
    }else{
      balance = balance;
    }
  }

  public void payGourmet(){
    if(balance >= 4.00){
      balance -= 4.00;
    }else{
      balance = balance;
    }
  }

  public void loadMoney(double amount){
    if(amount > 0){
      balance = balance + amount;
    }else{
      balance = balance;
    }

    if(balance > 150){
      balance = 150;
    }
  } 
}

