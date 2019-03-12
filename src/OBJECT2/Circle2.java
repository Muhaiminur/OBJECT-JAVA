package OBJECT2;
/*Write a test program to test all the methods defined in Shape.
Write two subclasses of Shape called Circle and Rectangle, as shown in the class diagram.
The Circle class contains:
An instance variable radius (double).
Three constructors as shown. The no-arg constructor initializes the radius to 1.0.
Getter and setter for the instance variable radius.
Methods getArea() and getPerimeter().
Override the toString() method inherited, to return "A Circle with radius=xxx, which is a subclass of yyy",
where yyy is the output of the toString() method from the superclass.
*/
public class Circle2 extends Shape{
  double radius=1.0;
  Circle2(){
  }
  Circle2(double r){
    radius=r;
  }
  Circle2(double a,String c,boolean b){
    radius=a;
    color=c;
    filled=b;
  }
  public void setRadius(double r){
     radius = r;
   }
  public double getRadius(){
     return radius; 
   }
  public double getArea() {
      return radius*radius*Math.PI;
   }
  public double getPerimeter() {
      return 1111.0;
   }
  public String toString() {
   return "A Circle with radius= "+radius+" which is a subclass of " +super.toString();
   }
}