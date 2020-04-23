package de.tum.in.ase.eist.audio;

import java.net.URL;

import javafx.scene.media.AudioClip;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

/**
 * This class handles the background music played during the game using a JavaFX
 * {@link MediaPlayer}.
 */
public class AudioPlayer implements AudioPlayerInterface {

	private static final String BACKGROUND_MUSIC_FILE = "Music.wav";
	// TODO Change Request: Configure your own crash sound here
	private static final String CRASH_SOUND_FILE = "Bang.wav";

	private static final double CRASH_SOUND_VOLUME = 0.5;

	private final MediaPlayer musicPlayer;
	private final AudioClip crashPlayer;

	/**
	 * Constructs a new AudioPlayer by directly loading the background music and
	 * crash sound files into a new MediaPlayer / AudioClip.
	 */
	public AudioPlayer() {
		this.musicPlayer = new MediaPlayer(loadAudioFile(BACKGROUND_MUSIC_FILE));
		this.crashPlayer = new AudioClip(convertNameToUrl(CRASH_SOUND_FILE));
	}

	@Override
	public void playBackgroundMusic() {
		if (isPlayingBackgroundMusic()) {
			return;
		}
		// Loop for the main music sound:
		this.musicPlayer.setCycleCount(MediaPlayer.INDEFINITE);
		this.musicPlayer.play();
	}

	@Override
	public void stopBackgroundMusic() {
		if (isPlayingBackgroundMusic()) {
			this.musicPlayer.stop();
		}
	}

	@Override
	public boolean isPlayingBackgroundMusic() {
		return MediaPlayer.Status.PLAYING.equals(this.musicPlayer.getStatus());
	}

	@Override
	public void playCrashSound() {
		crashPlayer.play(CRASH_SOUND_VOLUME);
	}

	private Media loadAudioFile(String fileName) {
		return new Media(convertNameToUrl(fileName));
	}

	private String convertNameToUrl(String fileName) {
		URL musicSourceUrl = getClass().getClassLoader().getResource(fileName);
		if (musicSourceUrl == null) {
			throw new IllegalArgumentException(
					"Please ensure that your resources folder contains the appropriate files for this exercise.");
		}
		return musicSourceUrl.toExternalForm();
	}

	public static String getBackgroundMusicFile() {
		return BACKGROUND_MUSIC_FILE;
	}

	public static String getCrashSoundFile() {
		return CRASH_SOUND_FILE;
	}
}
