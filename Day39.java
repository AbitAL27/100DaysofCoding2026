import java.util.Scanner;

/**
 * abid0506
 */
public class day39 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan angka pertama : ");
        int a = sc.nextInt();
        System.out.print("Masukan operator : ");
        char b = sc.next().charAt(0);
        System.out.print("Masukan angka kedua : ");
        int c = sc.nextInt();
        int hasil;

        if (b=='+') {hasil = a+c; System.out.println(hasil);
            
        }else if (b=='-') {hasil = a-c; System.out.println("Hasil : " + hasil);
            
        }else if (b=='*') {hasil = a*c; System.out.println(hasil);
            
        }else if (b=='/') {
            if (c !=0) {hasil = a/c; System.out.println(hasil);
                
            }else{System.out.println("Error tidak bisa di bagi 0");}
            
        }else {System.out.println("Operator tidak valid");}

        sc.close();

    }

}
