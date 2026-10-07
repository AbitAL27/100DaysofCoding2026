import java.util.Scanner;

/**
 * day36
 */
public class day36 {

    public static void main(String[] args) {

        System.out.print("Masukan nilai : ");
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a%2==0) {System.out.println("Bilangan genap");
            
        }else {System.out.println("Bilangan ganjil");}



        


        sc.close();
    }
}
