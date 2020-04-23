package de.tum.in.ase.eist;

public final class Bumpers {

	private Bumpers() {
		// Private constructor because a utility class should not be instantiable.
	}

	public static void main(String[] args) {
		// This is a workaround for a known issue when starting JavaFX applications
		BumpersApplication.startApp(args);
	}
}
