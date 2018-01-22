import java.util.Scanner;

/**
 * Chapter 2 Exercise16:
 *
 *      (Geometry: area of a hexagon)
 *
 * Created by Simon Legesse on 01/21/18.
 */
public class Exercise16 {

    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the side: ");
        double side = input.nextDouble();

        double area = 3 * 1.732 * side * side / 2;

        System.out.println("The area of the hexagon is " + area);

    }
}