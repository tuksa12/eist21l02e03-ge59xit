package de.tum.in.ase.eist;

public class SlowCar extends Car {

	private static final String SLOW_CAR_IMAGE_FILE = "SlowCar.gif";

	private static final int MIN_SPEED_SLOW_CAR = 2;
	private static final int MAX_SPEED_SLOW_CAR = 5;

	public SlowCar(Dimension2D gameBoardSize) {
		super(gameBoardSize);
		setMinSpeed(MIN_SPEED_SLOW_CAR);
		setMaxSpeed(MAX_SPEED_SLOW_CAR);
		setRandomSpeed();
		setIconLocation(SLOW_CAR_IMAGE_FILE);
	}
}
