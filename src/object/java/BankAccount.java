package object.java;
/*Task 4
Create a class called BankAccount as described below:
� Fields: 
name, address, accountID, balance
� Methods: 
public String getName()
public void setName(String n)
public String getAccountID()
public void setAccountID(String i)
public String getAddress()
public void setAddress(String a)
public double getBalance()
public void setBalance(double c)
public void addInterest() //adds 7% of the balance
*/
public class BankAccount{
  String name;
  String accountID;
  String add;
  Double balance;
  public void setName(String n){
    name=n;
  }
  public String getName(){
    return name;
  }
  public void setAccountID(String i){
    accountID=i;
  }
  public String getAccountID(){
    return accountID;
  }
  public void setAddress(String a){
    add=a;
  }
  public String getAddress(){
    return add;
  }
  public void setBalance(double c){
    balance=c;
  }
  public double getBalance(){
    return balance;
  }
  public void addInterest(){
    balance=balance*3;
  }
  public String toString(){
    return "( "+name+" "+accountID+" "+add+" "+balance+")";
  }
}