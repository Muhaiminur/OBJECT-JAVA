package object.java;
/*Write a class called Main to write a main() method:
� public static void main(String[] args){

}
public String getName()
public void setName(String n)
public String getID()
public void setID(String i)
public String getAddress()
public void setAddress(String a)
public double getCGPA()
public void setCGPA(double c)
� Inside the main() method 
o Create 3 objects/instances of Student called john, mike and carol
o Set their fields to some value using the public methods.
o Print the information of each Student using System.out.println()
*/
public class main{
  public static void main(String[]args){
    Student john=new Student();
    Student mike=new Student();
    Student carol=new Student();
    john.setName("name");
    john.setID("12301019");
    john.setAddress("13/1");
    john.setCGPA(3.5);
    System.out.println(john.getName());
    System.out.println(john.getID());
    System.out.println(john.getAddress());
    System.out.println(john.getCGPA());
    mike.setName("mike");
    mike.setID("12301036");
    mike.setAddress("14/1");
    mike.setCGPA(3.6);
    System.out.println(mike.getName());
    System.out.println(mike.getID());
    System.out.println(mike.getAddress());
    System.out.println(mike.getCGPA());
    carol.setName("carol");
    carol.setID("2013");
    carol.setAddress("15/1");
    carol.setCGPA(31.0);
    System.out.println(carol.getName());
    System.out.println(carol.getID());
    System.out.println(carol.getAddress());
    System.out.println(carol.getCGPA());
    System.out.println(john);
    System.out.println(mike);
    System.out.println(carol);                   
  }
}