package ObserverPattern;

//Class NotifThree yang mengimplementasikan Observer
public class NotifTwo implements Observer {
    //mengirimkan notifikasi ke Observer
    @Override
    public void update(Notifications s) {
        System.out.println("Kacamata Renang = " + s.getNotif());       
    }
}
