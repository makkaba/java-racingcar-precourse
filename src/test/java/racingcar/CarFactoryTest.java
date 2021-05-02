package racingcar;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.assertj.core.api.AssertionsForClassTypes.assertThatThrownBy;

public class CarFactoryTest {

	@DisplayName("이름리스트로_자동차생성")
	@Test
	void 이름리스트로_자동차생성() {
		List<String> names = new ArrayList<>(Arrays.asList("david", "jeff", "joshua"));
		try {
			List<Car> actual = CarFactory.createWithNames(names);
			assertThat(actual.contains(new Car("david"))).isTrue();
			assertThat(actual.contains(new Car("jeff"))).isTrue();
			assertThat(actual.contains(new Car("joshua"))).isTrue();
		} catch (CarException e) {
			e.printStackTrace();
		}
	}

	@Test
	void 다섯자_이하의_이름만_생성된다(){
		assertThatThrownBy(() -> {
			List<String> names = new ArrayList<>(Arrays.asList("davidjeff", "jeff", "joshua"));
			List<Car> cars = CarFactory.createWithNames(names);
		})
			.isInstanceOf(CarException.class)
			.hasMessageContaining("name is too long");
	}
}
