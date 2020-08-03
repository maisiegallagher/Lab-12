import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CarApp {

	public static Scanner scnr = new Scanner(System.in);
	public static List<Car> cars = new ArrayList<>();

	public static void main(String[] args) {

		System.out.println("Welcome to the GC Caqr terminal admin page!\n");

	}

	public static void addCar() {
		Car car = new Car();
		
		System.out.println("Make: ");
		car.setMake(scnr.nextLine());
		
		System.out.println("Model: ");
		car.setModel(scnr.nextLine());
		
		System.out.println("Year: ");
		car.setYear(scnr.nextInt());
		
		System.out.println("Price: ");
		car.setPrice(scnr.nextDouble());
		
		scnr.nextLine();
		
		cars.add(car);
		
	}

	public static void listCars() {

		for (int i = 0; i < cars.size(); i++) {
			System.out.println("Car " + (i + 1) + ": " + cars.get(i));
		}
	}
}
