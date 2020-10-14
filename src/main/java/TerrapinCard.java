public class TerrapinCard {

  private double balance;

  public TerrapinCard(double balance) {
    this.balance = balance;
  }

  public String toString() {
    return "The card has " + balance + " dollars";
  }

  public void payEconomical(){
    balance = balance - 2.50;
  }

  public void payGourmet(){
    balance = balance - 4.00;
  } 
}

