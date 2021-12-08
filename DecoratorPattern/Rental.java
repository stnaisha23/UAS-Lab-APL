package DecoratorPattern;

public class Rental {
    //class main\ dari Decorator Pattern
    public void rental() {

        System.out.println("== Sewa Alat Renang ==");
        System.out.println("======================");
        System.out.print("Penyewa 1   :");
        //didekorasi dengan baju renang
        Swimming tools = new Swimsuit(new SwimmingTools());
        //menampilkan alat yang disewa dengan method getDeskripsi
        System.out.println("Menyewa     :" + tools.getDeskripsi()); 
        //menampilkan harga total dari alat-alat yang disewa
        System.out.println("Harga total : " + tools.getCost());
        System.out.println("======================================================");

        System.out.print("Penyewa 2   :");
        //didekorasi dengan baju renang dan kacamata renang
        Swimming tools2 = new SwimmingGoggles(new Swimsuit(new SwimmingTools()));
        System.out.println("Menyewa     :" + tools2.getDeskripsi());
        System.out.println("Harga total : " + tools2.getCost());
        System.out.println("======================================================");

        System.out.print("Penyewa 3   :");
        //didekorasi dengan baju renang, ban renang dan kacamata renang
        Swimming tools3 = new SwimmingGoggles(new SwimmingTire(new Swimsuit(new SwimmingTools())));
        System.out.println("Menyewa     :" + tools3.getDeskripsi());
        System.out.println("Harga total : " + tools3.getCost());
    }
}
