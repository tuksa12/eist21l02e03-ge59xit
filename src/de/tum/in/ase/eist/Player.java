package de.tum.in.ase.eist;

/**
 * This class defines the player. Each player has its own car.
 */
public class Player {

	private static final double START_X_COORDINATE = 0.0;
	private static final double START_Y_COORDINATE = 0.0;
	private static final int START_DIRECTION = 90;

	private Car car;

	/**
	 * Constructor that allocates a car to the player.
	 *
	 * @param car the car that should be the player's car
	 */
	public Player(Car car) {
		this.car = car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Car getCar() {
		return this.car;
	}

	/**
	 * Prepares player's car for the start of the game.
	 */
	public void setup() {
		// The player always starts in the upper left corner facing to the right
		car.setPosition(START_X_COORDINATE, START_Y_COORDINATE);
		car.setDirection(START_DIRECTION);
	}
}
