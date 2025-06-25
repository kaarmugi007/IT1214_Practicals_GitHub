/*Build a Weather Monitoring System

The system includes a central weather station that keeps track of temperature.
Whenever the temperature changes, it should automatically notify all registered display devices.*/

import java.util.*;

interface CentralWeatherStation{
	void addDevices(Devices d);
	void removeDevices(Devices d);
	void notifyDevices(String message);
}

interface Observer{
	void updateMessage(String message);
}

class WeatherStation implements Central WeatherStation{
	private List<Observer> followers = new ArrayList<>();
}