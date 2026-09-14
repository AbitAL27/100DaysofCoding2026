import java.util.Scanner;

/**
 * evalusai
 */
public class evaluasi {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        String a = input.nextLine();
        int b = input.nextInt();
        long c = input.nextLong();
        float d = input.nextFloat();
        double e = input.nextDouble();
        short f = input.nextShort();
        byte g = input.nextByte();
        char h = input.next().charAt(0);
        boolean i = input.nextBoolean();

        System.out.println("===PRINTLN===");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);


        System.out.println("===PRINT===");
        System.out.print(a + "\n");
        System.out.print(b + "\n");
        System.out.print(c + "\n");
        System.out.print(d + "\n");
        System.out.print(e + "\n");
        System.out.print(f + "\n");
        System.out.print(g + "\n");
        System.out.print(h + "\n");
        System.out.print(i + "\n");

        System.out.println("===PRINTF===");
        System.out.printf(a + "\n");
        System.out.printf(b + "\n");
        System.out.printf(c + "\n");
        System.out.printf(d + "\n");
        System.out.printf(e + "\n");
        System.out.printf(f + "\n");
        System.out.printf(g + "\n");
        System.out.printf(h + "\n");
        System.out.printf(i + "\n");
        



        input.close();



    }
}
