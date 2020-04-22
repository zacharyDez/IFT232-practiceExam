package question2;

import java.util.ArrayList;

public abstract class Subject {
    ArrayList<Observer> observers = new ArrayList<>();
    ArrayList<Observer> vetos = new ArrayList<>();

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void attachVeto(Observer observer){
        observers.add(observer);
        vetos.add(observer);
    }

    public void sendNotif(Object obj){
        if(!checkVetos(obj))
            return;


        for(Observer o: observers){
            o.update(obj);
        }
    }

    public boolean checkVetos(Object o){
        for(Observer obs: vetos){
            if(!obs.checkVeto(o))
                return false;
        }

        return true;
    }
}
