import java.util.Scanner;

public class day26 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Masukkan Nama     :"); String nama = s.nextLine();
        System.out.print("Masukkan NIM      :"); String nim = s.nextLine();
        System.out.print("Masukkan Kelas    :"); char kelas = s.next().charAt(0);
        System.out.print("Masukkan Umur     :"); int umur = s.nextInt();
        s.nextLine();
        System.out.print("Masukkan Prodi    :"); String prodi = s.nextLine();
        System.out.print("Masukkan IPK      :"); double ipk = s.nextDouble();
        System.out.print("Status Keaktifan  :"); boolean aktif = s.nextBoolean();
        
        System.out.println();
        
        System.out.println("===== BIODATA MAHASISWA =====");
        System.out.println("Nama            :" + nama);
        System.out.println("NIm             :" + nim);
        System.out.println("Kelas           :" + kelas);
        System.out.println("Umur            :" + umur);
        System.out.println("Prodi           :" + prodi);
        System.out.printf("IPK\t\t:%.2f\n", ipk);
        System.out.println("Status Aktif    :" + aktif);
        System.out.println("=============================");



        //SOAL 2

        final double PI = 3.14;
        double r = s.nextDouble();
        System.out.println(PI*r*r);

        //SOAL 3

        int a = s.nextInt();
        int b = s.nextInt();
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println(a);
        System.out.println(b);

        s.close();

    }
    
}
