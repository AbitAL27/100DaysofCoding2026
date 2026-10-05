import java.util.Scanner;

/**
 * day34
 */
public class day34 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan nilai : ");
        int a = sc.nextInt();

        if (a>=90) {System.out.println("PREDIKAT A");

        }else if (a>=80) {System.out.println("PREDIKAT B");
            
        }else if (a>=70) {System.out.println("PREDIKAT C");
            
        }else if (a>=60) {System.out.println("PREDIKAT D");
            
        }else {System.out.println("PREDIKAT E");}


        sc.close();


        


    }
}
