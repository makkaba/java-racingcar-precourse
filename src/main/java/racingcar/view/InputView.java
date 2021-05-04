package racingcar.view;

import utils.ValidationUtil;

import java.util.List;
import java.util.Scanner;

public class InputView {
	public static final String INPUT_CAR_NAMES_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	public static final String INPUT_NUM_RACE_MESSAGE = "시도할 회수는 몇회인가요?";
	public static final String DELIMITER = ",";

	public static List<String> enterCarNames(){
		System.out.println(INPUT_CAR_NAMES_MESSAGE);
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		return ValidationUtil.parseStringWithDelimiter(userInput, DELIMITER);
	}

	public static int askCircuitNum(){
		int userInput;
		do {
			System.out.println(INPUT_NUM_RACE_MESSAGE);
			Scanner scanner = new Scanner(System.in);
			userInput = scanner.nextInt();
		} while (ValidationUtil.validNumRace(userInput) == false);
		return userInput;
	}
}
