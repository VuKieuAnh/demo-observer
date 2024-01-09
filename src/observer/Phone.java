package observer;

public class Phone implements Observer {
    @java.lang.Override
    public void update(java.lang.String mess) {
        System.out.println("observer.Phone "+ mess);
    }
}
