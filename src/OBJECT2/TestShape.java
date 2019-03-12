package OBJECT2;
public class TestShape{
  public static void main(String[]args){
    Shape s1=new Shape();
    System.out.println(s1);
    Shape s2=new Shape("Blue",false);
    System.out.println(s2);
    Shape s3=new Shape();
    s3.setColor("White");
    s3.setFilled(true);
    System.out.println(s3);
  }
}