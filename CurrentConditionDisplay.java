public class CurrentConditionDisplay implements Observer,Display {
    float temp;
    float hum;
    float pres;
    Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    public void update(float temp, float hum, float pres) {
        this.temp = temp;
        this.hum = hum;
        this.pres = pres;
    }

    public void display() {
        System.out.println(temp + " " + pres + " " + hum);
    }
}
