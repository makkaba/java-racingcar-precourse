package racingcar;

import racingcar.domain.Car;
import racingcar.view.OutputView;
import utils.RandomGeneratorUtil;

import java.util.ArrayList;
import java.util.List;

public class RaceGame {
	private List<Car> cars;
	private List<Car> winners;
	private int circuitNum;

	public RaceGame(List<Car> cars, int circuitNum){
		this.cars = cars;
		this.circuitNum = circuitNum;
		this.winners = new ArrayList<>();
	}

	public List<Car> start() {
		for (int i = 0; i< circuitNum; i++){
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
}
