import java.util.Scanner;

public class Con2Dec {
    public static void main(String[] args) {
System.out.println("Welcome to Con2Dec, this program converts different number system codes into decimal number!\n\n");
        
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("1 for Binary to Decimal conversion:\n2 for Octal to Decimal conversion:\n3 for Hexadecimal to Decimal conversion:\n");
            int x = sc.nextInt();
            int a; // Declare variable a outside of the switch

            switch (x) {
                case 1 ->  {
                    System.out.println("\nEnter Binary Code");
                    sc.useRadix(2);  
                    try {
                        a = sc.nextInt();
                        System.out.println("\nThe given integer is: "+a);
                    } catch (Exception e) {
                        System.out.println("Invalid Binary Code");
                    }
                }

                case 2 ->  {
                    System.out.println("\nEnter Octal Code");
                    sc.useRadix(8);
                    try {
                        a = sc.nextInt();
                        System.out.println("\nThe given integer is: "+a);
                    } catch (Exception e) {
                        System.out.println("Invalid Octal Code");
                    }
                }

                case 3 ->  {
                    System.out.println("\nEnter Hex Code");
                    sc.useRadix(16);
                    try {
                        a = sc.nextInt();
                        System.out.println("\nThe given integer is: "+a);
                    } catch (Exception e) {
                        System.out.println("Invalid Hexadecimal Code");
                    }
                }

                default ->  {
                    System.out.println("Choose a correct option");
                }
            }
        }
    }
}
