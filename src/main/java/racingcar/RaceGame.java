package racingcar;

import racingcar.domain.Car;
import racingcar.domain.GameResult;
import racingcar.view.OutputView;
import utils.RandomGeneratorUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RaceGame {
	private List<Car> cars;
	private List<Car> winners;
	private int numRace;

	public RaceGame(List<Car> cars, int numRace){
		this.cars = cars;
		this.numRace = numRace;
		this.winners = new ArrayList<>();
	}

	public List<Car> start() {
		for (int i=0; i<numRace; i++){
			process();
		}
		return cars;
	}

	private void process() {
		cars.forEach(car -> {
			car.goFoward((RandomGeneratorUtil.generateRandom()));
			OutputView.printCarStatus(car);
		});
		OutputView.printNewLine();
	}

	public List<Car> getCars() {
		return cars;
	}
}
