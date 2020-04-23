package de.tum.in.ase.eist;

/**
 * This class defines the behavior when two cars collide.
 */
public class Collision {

	protected final Car car1;
	protected final Car car2;
	private final boolean crash;

	public Collision(Car car1, Car car2) {
		this.car1 = car1;
		this.car2 = car2;
		this.crash = detectCollision();
	}

	public boolean isCrash() {
		return crash;
	}

	public boolean detectCollision() {
		Point2D p1 = car1.getPosition();
		Dimension2D d1 = car1.getSize();

		Point2D p2 = car2.getPosition();
		Dimension2D d2 = car2.getSize();

		boolean above = p1.getY() + d1.getHeight() < p2.getY();
		boolean below = p1.getY() > p2.getY() + d2.getHeight();
		boolean right = p1.getX() + d1.getWidth() < p2.getX();
		boolean left = p1.getX() > p2.getX() + d2.getWidth();

		return !above && !below && !right && !left;
	}

	/**
	 * Evaluates winner of the collision.
	 *
	 * @return winner Car
	 */
	public Car evaluate() {
		Point2D p1 = this.car1.getPosition();
		Point2D p2 = this.car2.getPosition();

		Car winnerCar = null;
		if (p1.getX() > p2.getX()) {
			winnerCar = this.car2;
		} else {
			winnerCar = this.car1;
		}
		return winnerCar;
	}

	/**
	 * Evaluates loser of the collision.
	 *
	 * @return loser Car
	 */
	public Car evaluateLoser() {
		Car winner = evaluate();
		if (this.car1 == winner) {
			return this.car2;
		}
		return this.car1;
	}
}
