import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp2 {

	public static Scanner scnr = new Scanner(System.in);
	public static List<Car> cars = new ArrayList<>();
	static {
		cars.add(new Car("Subaru", "Forester", 2018, 24000.00));
		cars.add(new Car("Ford", "F-150", 2019, 5000.00));
		cars.add(new Car("Honda", "Civic", 2020, 300.00));
		cars.add(new UsedCar("Jeep", "Grand Cherokee", 2004, 4500.00, 180000.00));
		cars.add(new UsedCar("Chevrolet", "Tahoe", 2017, 22000.00, 95000.00));
		cars.add(new UsedCar("Ford", "Edge", 2009, 7000.00, 165000.00));

	}

	public static void main(String[] args) {

		listCars();

	}

	public static void listCars() {
		for (int i = 0; i < cars.size(); i++) {
			System.out.println("Car " + (i + 1) + ": " + cars.get(i));
		}
	}

	public static void showCarById(int id) {
		System.out.println(cars.get(id - 1));

	}

	public static void buyCar(int id) {
		cars.remove(id - 1);

	}
}
