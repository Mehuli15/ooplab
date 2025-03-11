public class Car {
    private String carColor;
    private String carBrand;
    private String fuelType;
    private String mileage;

    public void start() {
        System.out.println("car is started");
    }

    public void stop() {
        System.out.println("car is stopped");
    }

    public void service() {
        System.out.println("car is for service");
    }

    public static void main(String args[]) {
        Car c1 = new Car();
        c1.carColor = "grey";
        c1.carBrand = "wagen";
        c1.fuelType = "petrol";
        c1.mileage = "30";
        System.out.println("car color: " + c1.carColor + " car brand: " + c1.carBrand + " fuel type: " + c1.fuelType + " mileage: " + c1.mileage);
        c1.start();
         c1.stop();
         c1.service();
        
        Car c2 = new Car();
        c2.carColor = "Red";
        c2.carBrand = "Chevrolet Spark";
        c2.fuelType = "petrol";
        c2.mileage = "18";
        System.out.println("car color: " + c2.carColor + " car brand: " + c2.carBrand + " fuel type: " + c2.fuelType + " mileage: " + c2.mileage);
        c2.start();
         c2.stop();
         c2.service();
        

        Car c3 = new Car();
        c3.carColor = "White";
        c3.carBrand = "Swift";
        c3.fuelType = "petrol";
        c3.mileage = "28";
        System.out.println("car color: " + c3.carColor + " car brand: " + c3.carBrand + " fuel type: " + c3.fuelType + " mileage: " + c3.mileage);
        c3.start();
         c3.stop();
         c3.service();
        

       System.out.println("Mehuli Sarkar" );  
    }
}