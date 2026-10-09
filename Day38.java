import java.util.Scanner;

/**
 * day38
 */
public class day38 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("=== SILAHKAN PILIH MENU ===");
        System.out.println("1. nasgor goreng");
        System.out.println("2. mie ayam chiken");
        System.out.println("3. es teh panas hot");
        System.out.println("0. exit keluar");
        System.out.print("Silahkan memilih : ");
        int a = sc.nextInt();

        if (a==1) {
            System.out.println("Harga nasgor goreng : 15.000");
            
        }else if (a==2) {
            System.out.println("Harga mie ayam chiken : 20.000");
            
        }else if (a==3) {
            System.out.println("Harga es teh panas hot : 5.000");
            
        }else if (a==0) {
            System.out.println("Terimah kasih :)");
            
        }else{
            System.out.println("Yang anda masukan salah");
        }


        sc.close();
    }
}
