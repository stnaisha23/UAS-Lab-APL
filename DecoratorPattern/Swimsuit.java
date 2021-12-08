package DecoratorPattern;

//class yang menginisialisasikan pilihan menu sewa alat renang
public class Swimsuit extends Tools{

    public Swimsuit(Swimming newSwim) {
        super(newSwim);
        System.out.println(" Baju Renang (15000)");
    }
    //mendapatkan deskripsi
    public String getDeskripsi() {
        return swim.getDeskripsi() + "Baju renang";
    }
    //mendapatkan harga
    public double getCost() {
        return swim.getCost()  + 15000;
    }
}
