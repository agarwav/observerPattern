import java.util.*;

public class WeatherData implements Subject {
    float temp;
    float pres;
    float hum;
    ArrayList<Observer> observers;

    public WeatherData() {
        observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer o) {
        observers.add(o);
    }

    public void removeObserver(Observer o) {
        int index = observers.indexOf(o);
        if (index != null) {
            observers.remove(index);
        }
    }

    public void notifyObserver() {
        for(int i = 0; i < observers.size(); i++) {
            Observer o = observers.get(i);
            o.update(temp, pres, hum);
        }
    }

    public void measurementsChanged() {
        notifyObservers();
    }

    public void setMeasurements(float temp, float hum, float pres) {
        this.temp = temp;
        this.hum = hum;
        this.pres = pres;
        measurementsChanged();
    }
}
