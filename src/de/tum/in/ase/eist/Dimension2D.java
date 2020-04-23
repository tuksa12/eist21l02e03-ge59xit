package de.tum.in.ase.eist;

import java.util.Locale;
import java.util.Objects;

/**
 * Represents a dimension with a width and height.
 */
public class Dimension2D {

	private final double width;
	private final double height;

	/**
	 * Create a new {@link Dimension2D} with the given double dimensions.
	 *
	 * @param width  the width of the dimension
	 * @param height the height of the dimension
	 */
	public Dimension2D(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return this.width;
	}

	public double getHeight() {
		return this.height;
	}

	@Override
	public int hashCode() {
		return Objects.hash(height, width);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Dimension2D)) {
			return false;
		}
		Dimension2D other = (Dimension2D) obj;
		return height == other.height && width == other.width;
	}

	@Override
	public String toString() {
		return String.format(Locale.ROOT, "Dimension2D [width=%.2f, height=%.2f]", width, height);
	}
}
