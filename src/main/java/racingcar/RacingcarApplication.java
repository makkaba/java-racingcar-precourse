package racingcar;

import racingcar.domain.Car;
import racingcar.view.InputView;

import java.util.List;

public class RacingcarApplication {
    public static void main(String[] args){
        System.out.println("hello world");
        List<String> carNames = InputView.enterCarNames();
        try {
			List<Car> cars = CarFactory.createWithNames(carNames);
		} catch (Exception e) {
			e.printStackTrace();
		}
        int numRace = InputView.enterNumRace();
	}
}
