package racingcar.domain;

import racingcar.constant.RaceConstant;

import java.util.Objects;

public class Car {
	private String name;
	private int distance;

	public Car(String name) {
		this.name = name;
		this.distance = 0;
	}

	public void goFoward(int number){
		if(number >= RaceConstant.FOWARD_MIN){
			distance++;
		}
	}

	public int getDistance(){
		return this.distance;
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

	public void print() {
		System.out.println(this.name + ":"+ visualizeDistance());
	}

	public String visualizeDistance(){
		StringBuilder stringBuilder = new StringBuilder();
		for (int i=0; i<distance; i++){
			stringBuilder.append("-");
		}
		return stringBuilder.toString();
	}
}
