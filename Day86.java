import java.util.Scanner;

public class day86 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan jumlah array: ");
        int a = sc.nextInt();
        int b[] = new int[a];

        System.out.println("=== INPUT ANGKA ===");

        
        for (int i = 0; i < b.length; i++) {
            System.out.print("Masukan angka ke-"+(i+1)+": ");
            b[i]=sc.nextInt();
            
        }

        

        boolean dapat = false;

        while (!dapat){
        System.out.print("\nMasukan angka yang di cari: ");
        int cari = sc.nextInt();
        

        for (int i = 0; i < b.length; i++) {
            if (b[i]==cari) {
                System.out.println("\nAngka di temukan!");
                System.out.println("Nilai: "+b[i]);
                System.out.println("Indeks: "+i);

                dapat=true;
                break;
            }
            
        }
        if (!dapat) {
            System.out.println("Angka tidak di temukan");
            System.out.println("Silahkan coba lagi.");
    }

        
    }

    sc.close();



    }
    
}
