package racingcar.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CarTest {

	@DisplayName("goFoward")
    @Test
    void goFoward() {
    	Car car = new Car("jeff");
    	car.goFoward(6);
		Assertions.assertEquals(1, car.getDistance());
    }
}
