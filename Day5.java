/**
 * day5
 */
public class day5 {

    public static void main(String[] args) {

        System.out.println("double digunakan dalam Java untuk menyimpan angka pecahan/desimal\ndengan tingkat ketelitian yang lebih tinggi dibandingkan float.");

        System.out.println();
        
        double harga = 12500.50;
        double berat = 2.75;
        double suhu = 36.5;

        System.out.println("Harga : Rp" + harga);
        System.out.println("Berat : " + berat + " kg");
        System.out.println("Suhu  : " + suhu + " °C");


        System.out.println();



        //menggunakan float
        System.out.println("float digunakan dalam Java untuk menyimpan angka pecahan/desimal\nyang tidak membutuhkan tingkat ketelitian setinggi double.");

        System.out.println();


        float jarak = 150.5f;
        float waktu = 2.5f;

        float kecepatan = jarak / waktu;

        System.out.println("Jarak      : " + jarak + " km");
        System.out.println("Waktu      : " + waktu + " jam");
        System.out.println("Kecepatan  : " + kecepatan + " km/jam");

        
    }
}
