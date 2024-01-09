package observer;

public class Mail implements Observer {
    @java.lang.Override
    public void update(java.lang.String mess) {
        System.out.println("observer.Mail "+ mess);
    }
}
