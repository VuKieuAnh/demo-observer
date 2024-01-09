import observer.Mail;
import observer.Phone;
import observer.WebNotification;
import subject.Account;

public class Main {
    public static void main(String[] args) {
        Account ka = new Account();
        Mail m = new Mail();
        Phone p = new Phone();
        WebNotification w = new WebNotification();
        ka.add(m);
        ka.add(p);
        ka.add(w);

        ka.notify("Chuyen 300K cho Minh");
        ka.remove(p);

        ka.notify("Nhan 20K tu Thang");
    }
}
