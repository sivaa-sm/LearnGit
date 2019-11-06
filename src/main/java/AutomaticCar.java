public class AutomaticCar implements Car{
	public void getModel(String carName,int version){
		if(carName.equals("Suzuki") && 1==version){
			System.outprintln("Automatic carName :"+carName+"*** CarModel:"+"Alto AT");
			System.out.println("Added by Lead");
		}
	}

	public void getPrice(String carName, String model){
		if(carName.equals("Suzuki") && "Alto".equals(model){
			System.out.println("Automatic Price : "+"5 lacs");
			System.out.println("Added by Lead");
		}
	}
}
