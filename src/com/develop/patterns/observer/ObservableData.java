package com.develop.patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class ObservableData implements Observable {
    private List<Observer> observerList;
    private int currentTemperature;
    private int currentPressure;

    public ObservableData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        if (observer!=null && !observerList.contains(observer)) {
            observerList.add(observer);
        } else throw new IllegalArgumentException("observer is already signed or observer is null");
    }

    @Override
    public void unregisterObserver(Observer observer) {
        if (observer!=null && observerList.contains(observer)) {
            observerList.remove(observer);
        } else {
            throw new IllegalArgumentException("Can't find subscriber in observerList or subscriber is null");
        }
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(currentTemperature, currentPressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(int currentTemperature, int currentPressure){
        this.currentTemperature = currentTemperature;
        this.currentPressure = currentPressure;
        measurementsChanged();
    }

    public int getCurrentTemperature() {
        return currentTemperature;
    }

    public int getCurrentPressure() {
        return currentPressure;
    }
}
