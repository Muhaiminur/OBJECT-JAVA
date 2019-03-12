package OBJECT2;
/*Write a class called Square, as a subclass of Rectangle. Convince yourself that Square can be modeled as a subclass of Rectangle. 
 * Square has no instance variable, but inherits the instance variables width and length from its superclass Rectangle.
Provide the appropriate constructors (as shown in the class diagram). Hint: 
public Square(double side) {
   super(side, side);  // Call superclass Rectangle(double, double)
}
Override the toString() method to return "A Square with side=xxx, which is a subclass of yyy", where yyy is the output of the toString()
method from the superclass.
Do you need to override the getArea() and getPerimeter()? Try them out.
Override the setLength() and setWidth() to change both the width and length, so as to maintain the square geometry.
*/
public class Square extends Rectangle{
  Square(){
    super();
  }
  public Square(double side){
   super(side, side);  // Call superclass Rectangle(double, double)
  }
  Square(double a,String c,boolean b){
    width=a;
    length=a;
    color=c;
    filled=b;
  }
  public void setSide(double r){
    width=r;
    length=r;
  }
  public double getSide(){
     return width;
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
  public String toString() {
   return "A Square with side= "+width+" which is a subclass of " +super.toString();
   }
}