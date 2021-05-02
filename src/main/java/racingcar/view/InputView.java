package racingcar.view;

import utils.ValidationUtil;

import java.util.List;
import java.util.Scanner;

public class InputView {
	public static final String INPUT_CAR_NAMES_MESSAGE = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
	public static final String DELIMITER = ",";

	public static List<String> enterCarNames(){
		System.out.println(INPUT_CAR_NAMES_MESSAGE);
		Scanner scanner = new Scanner(System.in);
		String userInput = scanner.nextLine();
		return ValidationUtil.parseStringWithDelimiter(userInput, DELIMITER);
	}
}
