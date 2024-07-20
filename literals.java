public class literals {
    public static void main(String[] args) {
        int a = 0b1010;
        int b = 0112;
        int c = 101;
        int d = 0xa; 
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        for(char ch = 0x0900; ch<=0x0970;ch++)
            System.out.print(ch+" ");
        
    }
}
