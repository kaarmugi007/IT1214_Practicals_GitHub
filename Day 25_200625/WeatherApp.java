/*Build a Weather Monitoring System

The system includes a central weather station that keeps track of temperature.
Whenever the temperature changes, it should automatically 
notify all registered display devices.*/

import java.util.*;
/*import java.util.List;
import java.util.ArrayList;*/

interface Observer{
	public void update(String s);
}

interface Subject{
	void addObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}

class DisplayDevice implements Observer{
	String name;
	DisplayDevice(String name){
		this.name=name;
	}
	
	public void update(String m){
		System.out.println(name + " Display Device: Got an Update message! \n" + m );
	}
}

class WeatherStation implements Subject{
	String name;
	int temp=30;
	String message; 
	
	Report r;
	
	WeatherStation(String name){
		this.name=name;
		
	}
	
	List<Observer> devices = new ArrayList<>();
	
	public void addObserver(Observer o){
		devices.add(o);
	}
	
	public void removeObserver(Observer o){
		devices.remove(o);
	}
	
	public void notifyObservers(){
		
		message="From " + name + ": Temperature is " + temp + " degree Celcius.";
		
		for(Observer e:devices){
			//e.update(message);
			e.update(r);
		}
	}
}


public class WeatherApp{
	public static void main(String [] args){
		Observer d1=new DisplayDevice("Nokia");
		DisplayDevice d2=new DisplayDevice("Sony");
		
		d1.update("Test 1");
		d2.update("Test 2");
		
		WeatherStation ws1=new WeatherStation("Vavuniya");
		ws1.addObserver(d1);
		ws1.addObserver(d2);
		ws1.notifyObservers();
		
		WeatherStation ws2=new WeatherStation("Kandy");
		ws2.addObserver(d2);
		ws1.notifyObservers();
		
	}
}