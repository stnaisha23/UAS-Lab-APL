package DecoratorPattern;

//class interface Tools untuk diimplementasi
public class Tools implements Swimming{
    
    protected Swimming swim;

    public Tools(Swimming newSwim) {
        this.swim = newSwim;
    }
    //untuk mendapatkan deskripsi
    public String getDeskripsi() {
        return swim.getDeskripsi();
    }
    //untuk mnedapatkan harga
    public double getCost() {
        return swim.getCost();
    }
}
