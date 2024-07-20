
import java.util.Scanner;

public class DataTypes {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);        
        while (true) {
            System.out.println("This is a program that displays information about data types!\nPRESS\n1 for byte\n2 for short\n3 for int\n4 for long\n5 for float\n6 for double\n7 for character\n8 to exit:");
            a = sc.nextInt();
            if (a == 8) {
                System.out.println("Exiting the program...");
                break;
            }
        switch (a) {
            case 1 -> {
                System.out.println("About Byte\n");
                System.out.println("Min value:"+Byte.MIN_VALUE);
                System.out.println("Max value:"+Byte.MAX_VALUE);
                System.out.println("Bytes:"+Byte.BYTES);
                System.out.println("Size:"+Byte.SIZE+"\n\n");
            }
            
        }
        switch (a) {
            case 2 -> {
                System.out.println("About Shorts\n");
                System.out.println("Min value:"+Short.MIN_VALUE);
                System.out.println("Max value:"+Short.MAX_VALUE);
                System.out.println("Bytes:"+Short.BYTES);
                System.out.println("Size:"+Short.SIZE+"\n\n");
            }
        }       
        switch (a) {
            case 3 -> {
                System.out.println("About Integers\n");
                System.out.println("Min value:"+Integer.MIN_VALUE);
                System.out.println("Max value:"+Integer.MAX_VALUE);
                System.out.println("Bytes:"+Integer.BYTES);
                System.out.println("Size:"+Integer.SIZE+"\n\n");
            }
        }
        switch (a) {
            case 4 -> {
                System.out.println("About Longs\n");
                System.out.println("Min value:"+Long.MIN_VALUE);
                System.out.println("Max value:"+Long.MAX_VALUE);
                System.out.println("Bytes:"+Long.BYTES);
                System.out.println("Size:"+Long.SIZE+"\n\n");
            }
        }
        switch (a) {
            case 5 -> {
                System.out.println("About Floats\n");
                System.out.println("Min value:"+Float.MIN_VALUE);
                System.out.println("Max value:"+Float.MAX_VALUE);
                System.out.println("Bytes:"+Float.BYTES);
                System.out.println("Size:"+Float.SIZE+"\n\n");
            }
        }
        switch (a) {
            case 6 -> {
                System.out.println("About Doubles\n");
                System.out.println("Min value:"+Double.MIN_VALUE);
                System.out.println("Max value:"+Double.MAX_VALUE);
                System.out.println("Bytes:"+Double.BYTES);
                System.out.println("Size:"+Double.SIZE+"\n\n");
            }
        }
        switch (a) {
            case 7 -> {
                System.out.println("About Characters\n");
                System.out.println("Min value:"+Character.MIN_VALUE);
                System.out.println("Max value:"+Character.MAX_VALUE);
                System.out.println("Bytes:"+Character.BYTES);
                System.out.println("Size:"+Character.SIZE);
                sc.close();
                }
            }   
        }
    }
}
