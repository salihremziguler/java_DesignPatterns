package nesneyonemlianaliz2;

import java.util.ArrayList;

public class Publisher implements ISUbject{
	
	 private ArrayList<Observer> subscribers=new ArrayList<>();

	    @Override
	    public void attach(Observer observer) {
	        subscribers.add(observer);
	    }

	    @Override
	    public void detach(Observer observer) {
	        subscribers.remove(observer);
	    }

	    @Override
	    public void notify(String message) {
	        for(Observer observer:subscribers)
	            observer.update(message);
	    }
}
