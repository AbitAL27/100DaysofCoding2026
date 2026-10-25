import java.util.Scanner;

public class day54 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);

        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();

        if (Y>X) {
            X=X+1;
            
        }
        if (Z>X) {
            X=X+2;
            
        }
        if (Y<X) {
            X=X-1;
            
        }
        if (Z<X) {
            X=X-2;
            
        }
        System.out.println(X);





        //soal 2
        double N = sc.nextDouble();

        // Memeriksa bilangan bulat atau pecahan
        if (N % 1 == 0) {
            // Bilangan bulat
            if (N % 2 == 0) {
                System.out.println("Bulat Genap");
            } else {
                System.out.println("Bulat Ganjil");
            }
        } else {
            // Bilangan pecahan
            System.out.println("Pecahan");
        }

        // Memeriksa bilangan positif atau negatif
        if (N > 0) {
            System.out.println("Positif");
        } else if (N < 0) {
            System.out.println("Negatif");
        }

        // Memeriksa bilangan natural/cacah
        if (N >= 0 && N % 1 == 0) {
            System.out.println("Natural/Cacah");
        }




        //soal3

         int a = sc.nextInt();

        for (int i = 1; i <= a; i++) {
             if ((i % 3 == 0 || i % 4 == 0)
                    && !(i % 3 == 0 && i % 4 == 0)) {
                System.out.print(i + " ");
            }
        }


        sc.close();
    }
    
}

