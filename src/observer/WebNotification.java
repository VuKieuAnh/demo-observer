package observer;

public class WebNotification implements Observer {
    @java.lang.Override
    public void update(java.lang.String mess) {
        System.out.println("Web "+ mess);
    }
}
