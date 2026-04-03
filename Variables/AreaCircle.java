package Variables;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radius, area;

        System.out.print("Enter radius: ");
        radius = sc.nextDouble();

        // Using Math.PI for better accuracy
        area = Math.PI * radius * radius;

        System.out.println("Area of Circle = " + area);

        sc.close(); 
    }
}