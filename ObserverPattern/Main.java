package ObserverPattern;

//class Main dari Observer Pattern
public class Main {
    public void mainObserver() {
        //memanggil class
        NotifOne one = new NotifOne();
        NotifTwo two = new NotifTwo();
        NotifThree three = new NotifThree();
        SwimmingPool obser = new SwimmingPool(); 

        System.out.println("\nHarga Sewa Alat Renang");
        System.out.println("======================");
        System.out.println("");

        //menampilkan notifikasi
        obser.addObserver(one);
        obser.notifikasi(new Notifications("15000"));

        obser.addObserver(two);
        obser.removeObserver(one);
        obser.notifikasi(new Notifications("5000"));

        obser.addObserver(three);
        obser.removeObserver(two);
        obser.notifikasi(new Notifications("10000"));
        System.out.println("Jika menyewa 3 alat, maka akan mendapatkan diskon 15%!");
        System.out.println("");
    }
    
}
