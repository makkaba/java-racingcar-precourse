package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import utils.ValidationUtil;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ValidationUtilTest {

	@Test
	@DisplayName("자동차의_이름은_5자_초과이면_false")
	void 자동차의_이름은_5자_초과이면_false(){
		boolean actual = ValidationUtil.ValidNameLength("jeffchung");
		assertThat(actual).isFalse();
	}

	@Test
	@DisplayName("자동차의_이름은_5자_이하이면_true")
	void 자동차의_이름은_5자_이하이면_true(){
		boolean actual = ValidationUtil.ValidNameLength("jeffc");
		assertThat(actual).isTrue();
	}
}
