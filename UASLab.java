import java.util.Scanner;
import DecoratorPattern.Rental;
import ObserverPattern.Main;

//class main utama
public class UASLab {
    public static void main(String[] args) {

        //input pilihan
        String ulangi = "y";
        try (Scanner input = new Scanner(System.in)) {
            while (ulangi.equals("y")) {
                System.out.println("");
                //judul kasus dan pilihan menu
                System.out.println("===============================");
                System.out.println("== Swimming Equipment Rental ==");
                System.out.println("===============================");
                System.out.println("pilihan menu :");
                System.out.println("1. Menyewa Alat Renang"); //menggunakan Decorator Pattern
                System.out.println("2. Informasi Harga Sewa"); //menggunakan Observer pattern
                System.out.println("3. Keluar Aplikasi");
                System.out.println("");
                //menginput pilihan menu
                System.out.print("pilih menu : ");
                int menu = input.nextInt();
                System.out.println("");
                switch (menu) {
                    //menu untuk Menyewa Alat Renang (Decorator Pattern)
                    case 1: { 
                        Rental r = new Rental();
                        r.rental();
                        break;
                    }
                    //menu untuk Informasi harga sewa (Observer Pattern)
                    case 2: {
                        Main m = new Main();
                        m.mainObserver();
                        break;
                    }
                    //pilihan menu untuk keluar
                    case 3: {
                        System.exit(3);
                    //jika angka yang diinput tidak terdaftar, maka ulangi pilihan
                    }default:
                        System.out.println("Ulangi Pilihan");
                        break;
                }
                //mengulang input menu pilihan
                System.out.println("");
                System.out.print("Apakah anda ingin mengulang (y/n)? ");
                ulangi = input.next();
            }
            
        }
    }
}