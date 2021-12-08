package DecoratorPattern;

//class yang menginisialisasikan pilihan menu sewa alat renang
public class SwimmingTire extends Tools{

    public SwimmingTire(Swimming newSwim) {
        super(newSwim);
        System.out.println("              Ban Renang (10000)");
    }
    //mendapatkan deskripsi
    public String getDeskripsi() {
        return swim.getDeskripsi() + ", ban renang";
    }
    //mendapatkan harga
    public double getCost() {
        return swim.getCost()  + 10000;
    }
}