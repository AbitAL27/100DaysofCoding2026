import java.util.Scanner;

/**
 * day17
 */
public class day17 {

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.print("Masukan Angka \t: ");
        int angka = sc.nextInt();
        System.out.println();
        System.out.println("====== HASIL NYA ======");
        System.out.println();

        angka +=10;
        System.out.println("Setelah +=10 \t: " + angka);

        angka -=5;
        System.out.println("Setelah -=5 \t: " + angka);

        angka *=15;
        System.out.println("Setelah *=15 \t: " + angka);

        angka /=2;
        System.out.println("Setelah /=2 \t: " + angka);

        angka %=3;
        System.out.println("Setelah %=3 \t: " + angka);
        


        sc.close();
        




    }
}
