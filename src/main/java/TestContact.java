public class TestContact implements Car{
        public void getModel(String carName,int version){
                if(carName.equals("Suzuki") && 1==version){
                        System.outprintln("Test Contact :"+carName+"*** CarModel:"+"Alto MT");
                }
        }
        public void getPrice(String carName, String model){
                if(carName.equals("Suzuki") && "Alto".equals(model){
                        System.out.println("Test Contact Price : "+"4 lacs");
                }
        }
}

