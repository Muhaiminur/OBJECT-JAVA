package object.java;
/*Task 2
Design a Vehicle2010 class which inherits movement methods from Task1 and adds new methods called move 
UpperRight, UpperLeft, LowerRight, LowerLeft. Each of these diagonal move methods must re use two inherited and appropriate move methods.
Write user class as well which will show that all of your methods are working. A small user class is shown below as an example. 
Note: All moves are 1 step. That means a single call to any move method changes value of either x or y or both by 1. */
public class Vehicle2010 extends Vehicle{
  Vehicle2010(){
  }
  public void moveUpperRight(){
    moveUp();
    moveRight();
  }
  public void moveUpperLeft(){
    moveUp();
    moveLeft();
  }
  public void moveLowerRight(){
    moveDown();
    moveRight();
  }
  public void moveLowerLeft(){
    moveDown();
    moveLeft();
  }
  public boolean equals(Vehicle2010 c){
    if(x==c.x && y==c.y){
      return true;
    }
    else
    {
      return false;
    }
}
}