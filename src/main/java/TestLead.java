public class TestLead implements Car{
	public void getModel(String carName,int version){
		if(carName.equals("Suzuki") && 1==version){
			System.outprintln("Test lead carName :"+carName+"*** CarModel:"+"Alto MT");
		}
	}
	public void getPrice(String carName, String model){
		if(carName.equals("Suzuki") && "Alto".equals(model){
			System.out.println("Test Lead Price : "+"4 lacs");
			System.out.println("Test Lead, added new line");
		}
	}
}


