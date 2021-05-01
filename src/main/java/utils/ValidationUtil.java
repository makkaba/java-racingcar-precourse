package utils;

public class ValidationUtil {
	public static final int MAX_NAME_LENGTH = 5;
	public static final int MIN_NAME_LENGTH = 0;

	public static boolean ValidNameLength(String name) {
		if(name.length() > MIN_NAME_LENGTH && name.length() <= MAX_NAME_LENGTH){
			return true;
		}
		return false;
	}
}
