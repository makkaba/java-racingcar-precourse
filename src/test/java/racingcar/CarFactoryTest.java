package racingcar;

import org.assertj.core.api.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class CarFactoryTest {

	@DisplayName("이름리스트로_자동차생성")
	@Test
	void 이름리스트로_자동차생성(){
		List<String> names = new ArrayList<>(Arrays.asList("david", "jeff", "joshua"));
		List<Car> actual = CarFactory.createWithNames(names);
		assertThat(actual.contains(new Car("david"))).isTrue();
		assertThat(actual.contains(new Car("jeff"))).isTrue();
		assertThat(actual.contains(new Car("joshua"))).isTrue();
	}
}
