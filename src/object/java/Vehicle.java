package object.java;
/*Task 1
Design a �Vehicle� class. A vehicle assumes that the whole world is a 2 dimensional graph paper. It maintains its x and y coordinates (both are integers). 
The vehicle gets manufactured (constructed?) at (0,0) coordinate.Write a class called �Vehicle�. It must have methods to move up, down, left, right and 
a toString method for printing current coordinate. Please note that all moves are 1 step. That means a single call to any move 
method changes value of either x or y or both by 1.
*/
public class Vehicle{
  int x=0;
  int y=0;
  Vehicle(){
  }
  public void moveUp(){
    y++;
  }
  public void moveLeft(){
    x--;
  }
  public void moveDown(){
    y--;
  }
  public void moveRight(){
    x++;
  }
  public String toString(){
    return "( "+x+","+y+")";
  }
}