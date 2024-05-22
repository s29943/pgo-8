
public class Main {
    public static void main(String[] args) {

        Car car1=new Car("jeep","1",2004,5678,90);
        Truck truck1=new Truck("bmw","9",2018,3456,100,85);

        System.out.println(car1.calculateFuelEfficiency());
        System.out.println(truck1.calculateFuelEfficiency());
        }
    }
