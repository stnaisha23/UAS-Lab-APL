package ObserverPattern;
import java.util.ArrayList;

//menampung Observer
public class SwimmingPool implements Observerable {
    private ArrayList<Observer> swimPool = new ArrayList<>();
    //untuk menambah Observer
    @Override
    public void addObserver(Observer observer) {
        swimPool.add(observer);
    }
    //untuk remove Observer
    @Override
    public void removeObserver(Observer observer) {
        swimPool.remove(observer);
    }
    //perulangan untuk megirimkan notifikasi
    @Override
    public void notifikasi(Notifications s) {
        for (Observer swimmingPool : swimPool) {
            swimmingPool.update(s);
        }
    }
}
