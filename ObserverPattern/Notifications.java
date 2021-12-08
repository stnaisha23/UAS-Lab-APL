package ObserverPattern;

public class Notifications {
    private String notif;

    //method constructor dengan parameter String s
    public Notifications(String s){
        this.notif = s;
    }
    //untuk mendapatkan notif
    public String getNotif(){
        return this.notif;
    }
}
