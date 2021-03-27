package cs681;
import java.util.LinkedList;

public class Observable 
{

    private LinkedList<Observer> observers = new LinkedList<Observer>();
    private boolean changed = false;

    public Observable() {};

    public Observer getObserver(){
        return this.observers.get(0);
    }

    public void addObserver(Observer o) {
        if (observers.contains(o))
            System.out.println("Observer already added");
        else
            observers.add(o);
    };

    public void deleteObserver(Observer o) {
        if (observers.contains(o))
            observers.remove(o);
        else
            System.out.println("Observer doesn't exist, so it cannot be removed.");
        
    };

    protected void setChanged() {
        this.changed = true;
    };

    protected void clearChanged() {
        this.changed = false;
    };

    public boolean hasChanged() {
        return this.changed;
    };

    public void notifyObservers(Object obj) {
        if( hasChanged() ){
            for (Observer o : observers) {
                System.out.println("Updated with: " + o);
            }
            this.clearChanged();
        }
    }
}
