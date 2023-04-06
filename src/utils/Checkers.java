package utils;

public class Checkers {

	
	public static void check(String textoRestriccion, Boolean condicion) {
		if (!condicion) {
			throw new IllegalArgumentException(
					Thread.currentThread().getStackTrace()[2].getClassName() +
					"." + 
					Thread.currentThread().getStackTrace()[2].getMethodName() +
					": " + 
					textoRestriccion);
		}
	}
	/**
	*public static void check(Integer entero) {
	*	if (0 > entero|| entero > 100  ) {
			throw new IllegalArgumentException(
					Thread.currentThread().getStackTrace()[2].getClassName() +
					"." + 
					Thread.currentThread().getStackTrace()[2].getMethodName() +
					": " + 
					entero);
		}
	}
	**/
}