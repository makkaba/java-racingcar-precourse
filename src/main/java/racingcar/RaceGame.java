package racingcar;

import racingcar.domain.Car;

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
		System.out.println("process");
	}
}
