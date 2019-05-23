package com.develop.patterns.observer;

public class ObserverImpl implements Observer, DTO {

    private int temperature;
    private int pressure;
    private Observable observable;

    public ObserverImpl(Observable observable) {
        this.observable = observable;
        observable.registerObserver(this);
    }

    @Override
    public void displayInformation() {
        System.out.println("Current conditions: temp - "+temperature+" pressure - " + pressure);
    }

    @Override
    public void update(int temp, int pressure) {
        this.temperature = temp;
        this.pressure = pressure;
        displayInformation();
    }
}
