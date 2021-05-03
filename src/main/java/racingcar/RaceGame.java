package racingcar;

import racingcar.domain.Car;
import racingcar.domain.GameResult;
import utils.RandomGeneratorUtil;

import java.util.List;

public class RaceGame {
	private List<Car> cars;
	private int numRace;
	public RaceGame(List<Car> cars, int numRace){
		this.cars = cars;
		this.numRace = numRace;
	}

	public GameResult start() {
		for (int i=0; i<numRace; i++){
			process();
		}
		return new GameResult();
	}

	private void process() {
		cars.forEach(x -> {
			x.goFoward((RandomGeneratorUtil.generateRandom()));
			x.print();
		});
	}
}
