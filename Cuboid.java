import java.util.*;

public class Cuboid {
    public static void main(String[] args) {        
        int length, width, height;
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("This is a program to calculate the volume,LSA and TSA of a cuboid");
            System.out.println("Press 1 to find the volume,2 for LSA and 3 for TSA of a cuboid. Press 4 to exit");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1 ->{
                    System.out.print("Enter the length of the cuboid: ");
                    length = scanner.nextInt();
                    System.out.print("Enter the width of the cuboid: ");
                    width = scanner.nextInt();
                    System.out.print("Enter the height of the cuboid: ");
                    height = scanner.nextInt();
                    System.out.println("Volume of the cuboid: " + (length * width * height));
                }
                case 2 ->{
                    System.out.print("Enter the length of the cuboid: ");
                    length = scanner.nextInt();
                    System.out.print("Enter the width of the cuboid: ");
                    width = scanner.nextInt();
                    System.out.print("Enter the height of the cuboid: ");
                    height = scanner.nextInt();
                    System.out.println("LSA (Least Surface Area) of the cuboid: " + (2 * (length * height + width * height + length * width)));
                }
                case 3 ->{
                    System.out.print("Enter the length of the cuboid: ");
                    length = scanner.nextInt();
                    System.out.print("Enter the width of the cuboid: ");
                    width = scanner.nextInt();
                    System.out.print("Enter the height of the cuboid: ");
                    height = scanner.nextInt();
                    System.out.println("TSA (Total Surface Area) of the cuboid: " + (2 * (length * width + length * height + width * height)));
                }
                default ->{
                System.out.println("Exiting...");
                    System.exit(0);
                    break;
                }
            }
        } 
    }
}
