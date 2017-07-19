import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by aibar on 7/18/2017.
 */
public class CarApp {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Car car = new Car();
        String loop = "y";

        LinkedList<Car> carList = new LinkedList<>();
        while (loop.equalsIgnoreCase("y")) {
            System.out.println("Which company manufactures the car?");
            car.setMake(scnr.nextLine());
            System.out.println("What is the car model?");
            car.setModel(scnr.nextLine());
            System.out.println("When was the car manufactured?");
            car.setYear(scnr.nextInt());
            System.out.println("Price of the car?");
            car.setPrice(scnr.nextDouble());
            carList.add(car);
            System.out.println("Another car?");
            scnr.nextLine();
            loop = scnr.nextLine();
        }
        System.out.println(carList);

        for (Car cars : carList) {
            System.out.println(cars.toString());
        }

    }
}
