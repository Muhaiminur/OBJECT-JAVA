package OBJECT2;
/*The Rectangle class contains:
Two instance variables width (double) and length (double).
Three constructors as shown. The no-arg constructor initializes the width and length to 1.0.
Getter and setter for all the instance variables.
Methods getArea() and getPerimeter().
Override the toString() method inherited, to return "A Rectangle with width=xxx and length=zzz, which is a subclass of yyy",
where yyy is the output of the toString() method from the superclass.
*/
public class Rectangle extends Shape{
  double width=1.0;
  double length=1.0;
  Rectangle(){
  }
  Rectangle(double w,double l){
    width=w;
    length=l;
  }
  Rectangle(double i,double e,String c,boolean b){
    width=i;
    length=e;
    color=c;
    filled=b;
  }
  public void setWidth(double r){
     width= r;
   }
  public double getWidth(){
     return width; 
   }
  public void setLength(double r){
     length = r;
   }
  public double getLength(){
     return length; 
   }
  public double getArea() {
      return length*width*Math.PI;
   }
  public double getPerimeter() {
      return 1222.0;
   }
  public String toString(){
   return "A Rectangle with width= "+width+"and length= "+length+" which is a subclass of " +super.toString();
   }
}