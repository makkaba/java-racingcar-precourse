package utils;

import racingcar.constant.RaceConstant;

public class RandomGeneratorUtil {

	public static int generateRandom(){
		return (int) (Math.random() * (RaceConstant.RANDOM_MAX - RaceConstant.RANDOM_MIN + 1) + RaceConstant.RANDOM_MIN);
	}
}
