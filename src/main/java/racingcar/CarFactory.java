package racingcar;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

	public static List<Car> createWithNames(List<String> names) {
		List<Car> resultCars = new ArrayList<Car>();
		for (String name:names) {
			resultCars.add(new Car(name));
		}
		return resultCars;
	}
}
