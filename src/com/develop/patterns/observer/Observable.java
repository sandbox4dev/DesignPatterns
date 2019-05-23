package com.develop.patterns.observer;

 interface Observable {
     void registerObserver(Observer observer);
     void unregisterObserver(Observer observer);
     void notifyObservers();

}
