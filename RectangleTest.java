import java.util.Scanner;
import java.awt.Rectangle;


public class RectangleTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter height: ");
        int width = input.nextInt();
        System.out.print("Enter height: ");
        int height = input.nextInt();
        Rectangle box1 = new Rectangle(10, 10, 30, 40);
        Rectangle box2 = new Rectangle(10,10, width , height);
        System.out.println("box1: " + box1);
    }

}