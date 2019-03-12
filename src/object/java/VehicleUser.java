package object.java;
/*public class VehicleUser{
    public static void main(String[] args){
        Vehicle car = new Vehicle();
        System.out.println(car.toString());
        car.moveUp();
        System.out.println(car.toString());
        car.moveLeft();
        System.out.println(car.toString());
        car.moveDown();
        System.out.println(car.toString());
        car.moveRight();

// After, you have written your own toString method, please observe that, // output for following two lines are same because toString() is 
// automatically called. So, you should omit toString when printing.
        System.out.println(car.toString());
        System.out.println(car); 
    }
}
Expected Output: 
(0, 0)
(0, 1)
(-1, 1)
(-1, 0)
(0, 0)
(0, 0)
*/
public class VehicleUser{
    public static void main(String[] args){
        Vehicle car = new Vehicle();
        System.out.println(car.toString());
        car.moveUp();
        System.out.println(car.toString());
        car.moveLeft();
        System.out.println(car.toString());
        car.moveDown();
        System.out.println(car.toString());
        car.moveRight();
        System.out.println(car.toString());
        System.out.println(car);
    }
}