package ObserverPattern;

//Class NotifTwo yang mengimplementasikan Observer
public class NotifThree implements Observer {
    //mengirimkan notifikasi ke Observer
    @Override
    public void update(Notifications s) {
        System.out.println("Ban Renang      = " + s.getNotif());       
    }
}