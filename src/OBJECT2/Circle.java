package OBJECT2;
/*1��Exercise: The Circle Class
A class called circle is designed as shown in the following class diagram. It contains:
Two private instance variables: radius (of type double) and color (of type String), with default value of 1.0 and "red", respectively.
Two overloaded constructors;
Two public methods: getRadius() and getArea().
The source codes for Circle is as follows:
public class Circle {           // save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;
   // 1st constructor, which sets both radius and color to default
   public Circle() {
      radius = 1.0;
      color = "red";
   }
   // 2nd constructor with given radius, but color default
   public Circle(double r) {
      radius = r;
      color = "red";
   }
   // A public method for retrieving the radius
   public double getRadius() {
     return radius; 
   }   
   // A public method for computing the area of circle
   public double getArea() {
      return radius*radius*Math.PI;
   }
Compile "Circle.java". Can you run the Circle class? Why? This Circle class does not have a main() method. 
Hence, it cannot be run directly. This Circle class is a �building block� and is meant to be used in another program.*/
public class Circle {           // save as "Circle.java"
   // private instance variable, not accessible from outside this class
   private double radius;
   private String color;
   // 1st constructor, which sets both radius and color to default
   public Circle() {
      radius = 1.0;
      color = "red";
   }
   // 2nd constructor with given radius, but color default
   public Circle(double r) {
      radius = r;
      color = "red";
   }
   // my work
   public Circle(double r,String s){
     radius=r;
     color=s;
   }
   // A public method for retrieving the radius
   public double getRadius() {
     return radius; 
   }   
   // A public method for computing the area of circle
   public double getArea() {
      return radius*radius*Math.PI;
   }
   public String getColor(){
     return color;
   }
   public void setRadius(double r){
     radius = r;
   }
   public void setColor(String c){
     color=c;
   }
   public String toString() {
   return "Circle: radius=" + radius + " color=" + color;
   }
}