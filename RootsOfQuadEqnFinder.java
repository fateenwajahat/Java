import java.util.Scanner;

public class RootsOfQuadEqnFinder {
    public static void main(String[] args) {
        System.out.println("This is a program to find the roots of a quadratic equation.");
        int a, b, c, discriminant;
        double root1, root2;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the coefficient of x^2: ");
            a = scanner.nextInt();
            System.out.print("Enter the coefficient of x: ");
            b = scanner.nextInt();
            System.out.print("Enter the constant term: ");
            c = scanner.nextInt();
        }
        discriminant = (b * b) - (4 * a * c);
        if (discriminant > 0) {
            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
            System.out.println("Roots are: " + root1 + " and " + root2);
        } 
        else if (discriminant == 0) {
            root1 = -b / (2 * a);
            System.out.println("Root is: " + root1);
        }
        else if (discriminant < 0) {
            System.out.println("Roots are complex and not real.");
        }
        else{
            System.out.println("Invalid options entered");
            System.exit(0);
        }
    }
}
