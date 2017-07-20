import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by aibar on 7/18/2017.
 */
//Hold details about cars in an arraylist
//Print list when user input ends.
public class CarApp extends Validator{
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        Car car = new Car();
        String loop = "y";

        ArrayList<Car> carList = new ArrayList<>();
        while (loop.equalsIgnoreCase("y")) {
            car.setMake(getString(scnr, "Which company manufactures the car?"));
            car.setModel(getString(scnr, "What is the car model?"));
            car.setYear(getInt(scnr, "When was the car manufactured?"));
            car.setPrice(getDouble(scnr, "Price of the car?"));
            carList.add(car);
            loop = getString(scnr, "Another car?");
        }

        for (Car cars : carList) {
            System.out.println(cars.toString());
        }

    }
}
