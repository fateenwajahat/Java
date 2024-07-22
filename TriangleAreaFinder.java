import java.util.*;
public class TriangleAreaFinder {
	public static void main(String[] args) {
        float height, base;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the height of the triangle: ");
        height = scanner.nextFloat();
        System.out.println("Enter the base of the triangle: ");
        base = scanner.nextFloat();
        float area = (base * height) / 2;
        System.out.println("The area of the triangle is: " + area);
        scanner.close();

    }
}