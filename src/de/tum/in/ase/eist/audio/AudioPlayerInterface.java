package de.tum.in.ase.eist.audio;

/**
 * This interface specifies the handling of the music and sounds played during
 * the game.
 */
public interface AudioPlayerInterface {

	/**
	 * Starts playing the background music if it's not started already.
	 */
	void playBackgroundMusic();

	/**
	 * Stops the background music if it is currently playing.
	 */
	void stopBackgroundMusic();

	/**
	 * Checks if the background music is playing.
	 *
	 * @return true if background music is playing, false if not
	 */
	boolean isPlayingBackgroundMusic();

	/**
	 * Plays the crash sound effect.
	 */
	void playCrashSound();

}
