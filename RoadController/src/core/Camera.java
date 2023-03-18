package core;

public class Camera {
    public static Car getNextCar() {
        String randomNumber = Double.toString(Math.random()).substring(2, 5);
        int randomHeight = (int) (1000 + 3400. * Math.random());
        double randomWeight = 600 + 10000 * Math.random();
        double doubleLimit = Math.round(randomWeight * 100.0) / 100.0;

        Car car = new Car();
        car.number = randomNumber;
        car.height = randomHeight;
        car.weight = doubleLimit;
        car.hasVehicle = Math.random() > 0.2;
        car.isSpecial = Math.random() < 0.15;

        return car;
    }
}