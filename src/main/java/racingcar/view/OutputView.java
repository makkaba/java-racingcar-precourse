package racingcar.view;

import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class OutputView {

	public static void printWhoIsWinner(List<Car> winners){
		List<String> names = new ArrayList<>();
		for (Car winner:winners) {
			names.add(winner.getName());
		}
		String winnerNamesInSeries = String.join(",",names);
		System.out.println(winnerNamesInSeries + "가 최종 우승했습니다");
	}

	public static void printCarStatus(Car car){
		StringBuilder stringBuilder = new StringBuilder();
		for (int i=0; i<car.getDistance(); i++){
			stringBuilder.append("-");
		}
		System.out.println(car.getName() + ":"+ stringBuilder.toString());
	}

	public static void printNewLine(){
		System.out.println("");
	}
}
