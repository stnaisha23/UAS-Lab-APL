package DecoratorPattern;

//class yang mengimplementasikan class Swimming
public class SwimmingTools implements Swimming{
    //untuk mendapatkan deskripsi dan harga
    @Override
    public String getDeskripsi() {
        return " Peralatan ";
    }

    @Override
    public double getCost() {
        return 0;
    }
}