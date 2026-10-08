import java.util.Scanner;

/**
 * day37
 */
public class day37 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan angka : ");
        int a = sc.nextInt();

        if (a>0) {
            if (a%2==0) {
                System.out.println("Positif dan genap");
                
            }else{System.out.println("Positif dan ganjil");}
            
        }else if (a<0) {
            if (a%2==0) {
                System.out.println("Negatif dan genap");
                
            }else {System.out.println("Negatif dan ganjil");}
            
        }else {System.out.println(a+" Bilagan netral");}

        sc.close();


    }
}
