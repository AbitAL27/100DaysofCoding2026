import java.util.Scanner;

public class day21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // String ke int
        System.out.print("Masukkan angka string ke int: ");
        String teksInt = input.nextLine();
        int angkaInt = Integer.parseInt(teksInt);

        // String ke double
        System.out.print("Masukkan angka string ke double: ");
        String teksDouble = input.nextLine();
        double angkaDouble = Double.parseDouble(teksDouble);

        // String ke float
        System.out.print("Masukkan angka string ke float: ");
        String teksFloat = input.nextLine();
        float angkaFloat = Float.parseFloat(teksFloat);

        // String ke long
        System.out.print("Masukkan angka string ke long: ");
        String teksLong = input.nextLine();
        long angkaLong = Long.parseLong(teksLong);

        // String ke boolean
        System.out.print("Masukkan boolean (true/false): ");
        String teksBoolean = input.nextLine();
        boolean status = Boolean.parseBoolean(teksBoolean);

        System.out.println();
        System.out.println("===== HASIL KONVERSI =====");
        System.out.println("Int     : " + angkaInt);
        System.out.println("Double  : " + angkaDouble);
        System.out.println("Float   : " + angkaFloat);
        System.out.println("Long    : " + angkaLong);
        System.out.println("Boolean : " + status);

        input.close();
    }
}
