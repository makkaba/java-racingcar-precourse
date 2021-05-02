package racingcar;

import racingcar.domain.Car;
import utils.ValidationUtil;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

	public static List<Car> createWithNames(List<String> names) throws CarException {
		List<Car> resultCars = new ArrayList<Car>();
		for (String name:names) {
			if(!ValidationUtil.validNameLength(name)){
				throw new CarException("name is too long");
			}
			resultCars.add(new Car(name));
		}
		return resultCars;
	}
}
