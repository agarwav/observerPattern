public class CurrentConditionDisplay implements Observer,Display {
    float temp;
    float hum;
    float pres;
    Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }
}
