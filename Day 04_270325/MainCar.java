class Car{
	
private String model;

//Getter

public String getModel(){
	return model;
}

//setter
public void setModel(String newModel){
	
	this.model=newModel;
}
}
public class MainCar
{
	public static void main(String[] args)
	{
		Car c1=new Car();
		c1.setModel("Toyoto Corolla");
		System.out.println(c1.getModel());
	}
}
