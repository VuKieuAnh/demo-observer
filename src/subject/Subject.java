package subject;

import observer.Observer;

public interface Subject {
    void add(Observer o);
    void remove(Observer o);
    void notify(String mess);
}
