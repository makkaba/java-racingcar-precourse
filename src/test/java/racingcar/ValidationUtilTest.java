package racingcar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.ValidationUtil;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ValidationUtilTest {

	@Test
	@DisplayName("자동차의_이름은_5자_초과이면_false")
	void 자동차의_이름은_5자_초과이면_false(){
		boolean actual = ValidationUtil.validNameLength("jeffchung");
		assertThat(actual).isFalse();
	}

	@Test
	@DisplayName("자동차의_이름은_5자_이하이면_true")
	void 자동차의_이름은_5자_이하이면_true(){
		boolean actual = ValidationUtil.validNameLength("jeffc");
		assertThat(actual).isTrue();
	}

	@Test
	@DisplayName("이름을_콤마_기준으로_자르기")
	void 이름을_콤마_기준으로_자르기(){
		String testSource = "jeff,david,evan,goody";
		ArrayList<String> expect = new ArrayList<String>(Arrays.asList("jeff", "david", "evan", "goody"));
		List<String> actual = ValidationUtil.parseStringWithDelimiter(testSource, ",");
		Assertions.assertEquals(expect, actual);
	}

	@Test
	@DisplayName("레이스횟수_음수_불허용")
	void 레이스횟수_음수_불허용(){
		boolean isValidNumRace = ValidationUtil.validNumRace(-10);
		assertThat(isValidNumRace).isFalse();
	}
}
