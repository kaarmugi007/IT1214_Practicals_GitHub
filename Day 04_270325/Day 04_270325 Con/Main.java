class Car{
	
public String model;

//Getter

public String getModel(){
	return model;
}

//setter
public void setModel(String newModel){
	
	this.model=newModel;
}

Car(String k){//constuctor overloading
		model=k;
	}	
	
}
public class Main
{
	public static void main(String[] args)
	{
		Car c1=new Car("Ferrari");
		c1.setModel("Toyoto Corolla");
		System.out.println(c1.getModel());
	}
}
