package controller;

public class Destrutor {
	public static void Destroyer(Object obj) {
		obj = null;
		System.gc();
	}
}
