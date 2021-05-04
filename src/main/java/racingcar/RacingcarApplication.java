package racingcar;

import racingcar.domain.Car;
import racingcar.domain.GameResult;
import racingcar.domain.LeaderBoard;
import racingcar.view.InputView;
import racingcar.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class RacingcarApplication {

    public static void main(String[] args){
		List<Car> cars = new ArrayList<>();
        List<String> carNames = InputView.enterCarNames();
        try {
        	cars = CarFactory.createWithNames(carNames);
		} catch (Exception e) {
			e.printStackTrace();
		}
        int numRace = InputView.enterNumRace();
        RaceGame raceGame = new RaceGame(cars, numRace);
        List<Car> carsAfterRace = raceGame.start();
		LeaderBoard leaderBoard = new LeaderBoard(carsAfterRace);
		OutputView.printWhoIsWinner(leaderBoard.whoIsWinner());
	}
}
