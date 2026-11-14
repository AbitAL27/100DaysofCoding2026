import java.util.Scanner;

public class day74 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.print("Masukan nama: ");
        String nama = sc.nextLine();
        System.out.println(nama.length());
        System.out.println(nama.toUpperCase());
        System.out.println(nama.toLowerCase());
        sc.close();
    }

    
    
}
