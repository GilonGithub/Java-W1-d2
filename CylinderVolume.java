import java.util.Scanner;
import java.lang.Math.*;

public class CylinderVolume {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the cyclinder's radius: ");
        double r = input.nextDouble();
        System.out.print("Enter the cylinder's length: ");
        double l = input.nextDouble();

        double area = r * r * Math.PI;

        System.out.println("The area is " + area);
        System.out.println("The volume is " + area * l);


    }

}
