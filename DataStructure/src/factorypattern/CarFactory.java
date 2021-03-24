package factorypattern;

public class CarFactory {

    public Car getCar(CarType carType){
        //logic for returning the car
        if (carType == CarType.SUV){
            return new Suv(); //upcasting
        }
        if (carType == CarType.MINI){
            return new MiniSuv();
        }
        else{
            return new Truck();
        }
    }
}
