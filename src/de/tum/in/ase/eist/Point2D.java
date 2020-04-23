package de.tum.in.ase.eist;

import java.util.Locale;
import java.util.Objects;

/**
 * Represents a point with x and y coordinate.
 */
public class Point2D {

	private final double x;
	private final double y;

	/**
	 * Create a new {@link Point2D} with the given double coordinates.
	 *
	 * @param x x-coordinate of the point
	 * @param y y-coordinate of the point
	 */
	public Point2D(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return this.x;
	}

	public double getY() {
		return this.y;
	}

	@Override
	public int hashCode() {
		return Objects.hash(x, y);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Point2D)) {
			return false;
		}
		Point2D other = (Point2D) obj;
		return x == other.x && y == other.y;
	}

	@Override
	public String toString() {
		return String.format(Locale.ROOT, "(%.2f, %.2f)", x, y);
	}
}
