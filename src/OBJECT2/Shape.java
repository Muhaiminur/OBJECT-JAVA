package OBJECT2;
public class Shape{
  String color="Red";
  boolean filled=true;
  Shape(){
    color="Green";
    filled=true;
  }
  Shape(String s,boolean b){
    color=s;
    filled=b;
  }
  public void setColor(String c){
     color=c;
   }
  public String getColor(){
     return color;
   }
  public void setFilled(boolean o){
     filled=o;
   }
  public boolean isFilled(){
     return filled;
   }
  public String toString(){
    return "A Shape with color of "+color+" and "+filled;
  }
}