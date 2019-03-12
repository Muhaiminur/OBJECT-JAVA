package object.java;
/*Task 3
Create a class called Student as described below:
� Fields: 
name, id, address, cgpa
� Methods: 
public String getName()
public void setName(String n)
public String getID()
public void setID(String i)
public String getAddress()
public void setAddress(String a)
public double getCGPA()
public void setCGPA(double c)

Write a class called Main to write a main() method:
� public static void main(String[] args){

}
� Inside the main() method 
o Create 3 objects/instances of Student called john, mike and carol
o Set their fields to some value using the public methods.
o Print the information of each Student using System.out.println()
*/
public class Student{
  String name;
  String id;
  String add;
  Double cgpa;
  public void setName(String n){
    name=n;
  }
  public String getName(){
    return name;
  }
  public void setID(String i){
    id=i;
  }
  public String getID(){
    return id;
  }
  public void setAddress(String a){
    add=a;
  }
  public String getAddress(){
    return add;
  }
  public void setCGPA(double c){
    cgpa=c;
  }
  public double getCGPA(){
    return cgpa;
  }
  public String toString(){
    return "( "+name+" "+id+" "+add+" "+cgpa+")";
  }
}