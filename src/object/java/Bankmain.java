package object.java;
/*1. Write a class called Main to write a main() method:
� public static void main(String[] args){

}
� Inside the main() method 
o Create 3 objects/instances of BankAccount called acc1, acc2 and acc3
o Set their fields to some value using the public methods.
o Call addInterest() on acc1 and acc3
o Print the information of each BankAccount using System.out.println()
*/
public class Bankmain{
  public static void main(String[]args){
    BankAccount acc1=new BankAccount();
    BankAccount acc2=new BankAccount();
    BankAccount acc3=new BankAccount();
    acc1.setName("name");
    acc1.setAccountID("12301019");
    acc1.setAddress("13/1");
    acc1.setBalance(1200);
    acc1.addInterest();
    System.out.println(acc1.getName());
    System.out.println(acc1.getAccountID());
    System.out.println(acc1.getAddress());
    System.out.println(acc1.getBalance());
    acc2.setName("acc2");
    acc2.setAccountID("12301036");
    acc2.setAddress("14/1");
    acc2.setBalance(900);
    acc2.addInterest();
    System.out.println(acc2.getName());
    System.out.println(acc2.getAccountID());
    System.out.println(acc2.getAddress());
    System.out.println(acc2.getBalance());
    acc3.setName("acc3");
    acc3.setAccountID("2013");
    acc3.setAddress("15/1");
    acc3.setBalance(600);
    System.out.println(acc3.getName());
    System.out.println(acc3.getAccountID());
    System.out.println(acc3.getAddress());
    System.out.println(acc3.getBalance());
    System.out.println(acc1);
    System.out.println(acc2);
    System.out.println(acc3);                   
  }
}