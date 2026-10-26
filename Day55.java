import java.util.Scanner;

public class day55 {

    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);


        System.out.print("batas nilai: ");
        int b = sc.nextInt();
        if (b<=0) {
        System.out.println("batas harus lebih dari 0, batas anda: "+b);
        sc.close();
        return;
            
        }


        for (int i = 1; i <=b; i++) {
            if (i%2==0) {
                //System.out.println("nilai yang di lewati: "+i);
                continue;
                
            }if (i==100) {
                break;
                
            }
           System.out.println(i);
            
        }
    


        sc.close();

    }
    
}
