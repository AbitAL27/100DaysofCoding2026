import java.util.Scanner;

/**
 * day43
 */
public class day43 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan nilai : ");
        int a = sc.nextInt();

        if (a%3==0 && a%5==0) {
            System.out.println(a + " Merupakan kelipatan 3 & 5");
            
        }else if (a%3==0) {
            System.out.println(a + " Merupakan kelipatan 3");
            
        }else if (a%5==0) {
            System.out.println(a + " Merupakan kelipatan 5");
            
        }else {
            System.out.println(a + " Bukan kelipatan 3 atau 5");
        }


        sc.close();
    }
}
