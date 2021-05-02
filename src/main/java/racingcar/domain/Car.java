package racingcar.domain;

import java.util.Objects;

public class Car {
	private String name;

	public Car(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object obj){
		if(this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Car that = (Car) obj;
		return name == that.name;
	}

	@Override
	public int hashCode(){
		return Objects.hash(name);
	}
}
