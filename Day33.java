import java.util.Scanner;

/**
 * day33
 */
public class day33 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan umur : ");
        int a = sc.nextInt();

        if (a >= 18) { System.out.println("Sudah dewasa");
            
        } else {System.out.println("Belum dewasa");}

        sc.close();
        


    }
}
