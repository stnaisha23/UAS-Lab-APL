package ObserverPattern;

//Class NotifOne yang mengimplementasikan Observer
public class NotifOne implements Observer {
    //mengirimkan notifikasi ke Observer
    @Override
    public void update(Notifications s) {
        System.out.println("Baju Renang     = " + s.getNotif());
            
    }
}
