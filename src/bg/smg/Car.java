package bg.smg;

public class Car extends Vehicle{

    @Override
    public void drive(double speed) {
        System.out.println("We are driving a car " + getMake() + "with model " + getModel() + " from " + getYearProduction());
    }
//
//    @Override
//    public int compareTo(Car o) {
//        return 0;
//    }
}
