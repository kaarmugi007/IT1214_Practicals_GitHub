/*What is the main goal of the observer
1.Reduce code
2.Modify multiple objects simultaneously of changes in another objects
3.Improve UI design
4.Simplify method calls*/

import java.util.*;

	//Subject interface
	interface Subject{
		void subscribe(Observer o);
		void unsubscribe(Observer o);
		void notifyObserver(String message);
	}
	
	//Observer interface
	interface Observer{
		void update(String message);
	}
	
	//Concrete subject(Youtube channel)
	class YouTubeChannel implements Subject{
		private List<Observer> subscribers = new ArrayList<>();
		
		@Override
		public void subscribe(Observer o){
			subscribers.add(o);
		}
		
		@Override
		public void unsubscribe(Observer o){
			subscribers.remove(o);
		}
		
		@Override
		public void notifyObserver(String message){
			for(Observer o: subscribers){
				o.update(message);
			}
			
		}
		
		public void uploadNewVideo(String title){
			System.out.println("New Video Uploaded: "+title);
			notifyObserver("Watch Now: "+ title);
		}
	}
	
	class Subscriber implements Observer{
		private String name;
		
		public Subscriber(String name){
			this.name = name;
		}
		
		@Override
		public void update(String message)
		{
			System.out.println(name+", you have a new notification"+ message);
		}
	}
	
	//Main method to test
	public class ObserverPatternDemo{
		public static void main(String[] args){
		YouTubeChannel channel = new YouTubeChannel();
		
		Observer alice = new Subscriber("alice");
		Observer bob = new Subscriber("bob");
		Observer charlie = new Subscriber("charlie");
		
		channel.subscribe(alice);
		
		channel.subscribe(bob);
		channel.uploadNewVideo("Observer pattern in java");
		
		channel.unsubscribe(bob);
		channel.uploadNewVideo("Strategy pattern in java");
		
		channel.subscribe(charlie);
		channel.uploadNewVideo("Factory pattern in java");
		}
	
	}



