public class CarProgram {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.drive();
        car1.setCurrentColor("Rot");
        System.out.println(car1.getCurrentColor());
    }
}
