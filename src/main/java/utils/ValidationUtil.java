package utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidationUtil {
	public static final int MAX_NAME_LENGTH = 5;
	public static final int MIN_NAME_LENGTH = 0;

	public static boolean validNameLength(String name) {
		if(name.length() > MIN_NAME_LENGTH && name.length() <= MAX_NAME_LENGTH){
			return true;
		}
		return false;
	}

	public static List<String> parseStringWithDelimiter(String source, String delimiter){
		return new ArrayList<>(Arrays.asList(source.split(delimiter)));
	}
}
