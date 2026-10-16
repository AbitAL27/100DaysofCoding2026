import java.util.Scanner;

public class day45 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan warna lampu lalu lintas : ");
        String a = sc.nextLine();

        switch (a) {
            case "Merah":
                System.out.println("Berhenti");
                
                break;
                case "Kuning":
                    System.out.println("Hati-Hati");
                    break;
                    
                    case "Hijau":
                        System.out.println("Jalan");
                        break;
        
            default:
                        System.out.println("Bukan warna lampu lalu lintas");
                break;
        }

        sc.close();

    }
    
}
