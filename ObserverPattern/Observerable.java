package ObserverPattern;

//class yang akan diimplementasikan untuk membuat notifikasi
interface Observerable {
    public void addObserver(Observer observer);

    public void removeObserver(Observer observer);
    
    public void notifikasi(Notifications s);
}
