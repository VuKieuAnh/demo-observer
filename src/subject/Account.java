package subject;

import java.util.List;
import java.util.ArrayList;
import observer.Observer;

public class Account implements Subject {
    private List<Observer> observerList = new ArrayList<>();
    @java.lang.Override
    public void add(Observer o) {
        observerList.add(o);
    }

    @java.lang.Override
    public void remove(Observer o) {
        observerList.remove(o);
    }

    @java.lang.Override
    public void notify(java.lang.String mess) {
        for (Observer o: observerList){
            o.update(mess);
        }
    }
}
