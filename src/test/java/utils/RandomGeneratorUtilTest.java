package utils;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RandomGeneratorUtilTest {

	@DisplayName("랜덤범위검사")
	@Test
	void 랜덤범위검사(){
		assertThat((RandomGeneratorUtil.generateRandom() > 0) && (RandomGeneratorUtil.generateRandom() <= 9)).isTrue();
	}
}
