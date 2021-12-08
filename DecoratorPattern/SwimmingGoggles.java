package DecoratorPattern;

//class yang menginisialisasikan pilihan menu sewa alat renang
public class SwimmingGoggles extends Tools{

    public SwimmingGoggles(Swimming newSwim) {
        super(newSwim);
        System.out.println("              Kacamata Renang (5000)");
    }
    //mendapatkan deskripsi
    public String getDeskripsi() {
        return swim.getDeskripsi() + ", dan kacamata renang";
    }
    //mendapatkan harga
    public double getCost() {
        return swim.getCost()  + 5000;
    }
}