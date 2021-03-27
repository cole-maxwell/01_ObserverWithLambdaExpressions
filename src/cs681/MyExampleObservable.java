package cs681;

public class MyExampleObservable { 

    public static void main(String[] args) {


        Observable observable = new Observable();

        observable.addObserver( (observer, obj)->
                                {System.out.println(obj);});

        observable.setChanged();
        observable.notifyObservers(observable);

        observable.deleteObserver( (observer, obj)->
                                {observable.getObserver();});
        
        observable.setChanged();
        observable.notifyObservers(observable);

    }
    
    
}