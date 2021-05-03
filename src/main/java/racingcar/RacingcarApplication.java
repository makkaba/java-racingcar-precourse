package racingcar;

import racingcar.domain.Car;
import racingcar.domain.GameResult;
import racingcar.view.InputView;

import java.util.ArrayList;
import java.util.List;

public class RacingcarApplication {

    public static void main(String[] args){
		List<Car> cars = new ArrayList<Car>();
        List<String> carNames = InputView.enterCarNames();
        try {
        	cars = CarFactory.createWithNames(carNames);
		} catch (Exception e) {
			e.printStackTrace();
		}
        int numRace = InputView.enterNumRace();
        RaceGame raceGame = new RaceGame(cars, numRace);
        GameResult gameResult = raceGame.start();
	}
}
