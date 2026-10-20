import java.util.Scanner;

public class day49 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan umur : ");

        int a = sc.nextInt();

        String b = (a>=18) ? "Dewasa" : "Belum dewasa";

        System.out.println(b);
        sc.close();




    }
    
}
