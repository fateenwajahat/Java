import java.util.*;

public class TriangleAreaFinder {
	public static void main(String[] args) {
        float height, base;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Press 1 for using Formula for calculating area\nPress 2 for using Herons formula to calculate area:\nPress any other number to exit");
        int choice = scanner.nextInt();
            switch (choice) {
                case 1 -> {
                        System.out.println("Enter the height of the triangle: ");
                        height = scanner.nextFloat();
                        System.out.println("Enter the base of the triangle: ");
                        base = scanner.nextFloat();
                        float area = (base * height) / 2;
                        System.out.println("The area of the triangle is: " + area);
                        scanner.close();
                    }
                case 2 -> {
                        System.out.println("Enter the length of first side of the triangle(a): ");
                        float a = scanner.nextFloat();
                        System.out.println("Enter the length of second side of the triangle(b): ");
                        float b = scanner.nextFloat();
                        System.out.println("Enter the length of third side of the triangle(c): ");
                        float c = scanner.nextFloat();
                        double s = (a + b + c) / 2;
                        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                        System.out.println("The area of the triangle is: " + area);
                        scanner.close();
                    }
                default -> {
                    System.out.println("Exiting program");
                    System.exit(0);
                }
            }

    }
}