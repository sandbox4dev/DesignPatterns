package com.develop.patterns.observer.test;

import com.develop.patterns.observer.ObservableData;
import com.develop.patterns.observer.ObserverImpl;

public class ObseverTest {
    public static void main(String[] args) {
        ObservableData observableData = new ObservableData();

        ObserverImpl observer = new ObserverImpl(observableData);

        observableData.setMeasurements(25, 45);
        try {
        Thread.sleep(5000);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
        observableData.setMeasurements(115, 65);
        observer.displayInformation();
    }
}
