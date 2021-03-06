 /**
 * Audio Class
 * @author Rodrigo Valle e Robson de Jesus
 * @since 12/08/2020
 * @version 1.0
 */
package br.udesc.ppr55.sr.model;
import java.io.File; 
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip; 

public class Audio {  
	private String path;
	private long clipTimePosition;
	private Clip clip;
	private AudioInputStream audioInput;
	
	public Audio(String path) {
		this.path = path;
	}
	
	public void playMusic() {
	 
		try { 
			
			File musicPath = new File(path);
			
			if(musicPath.exists()) {
				clip = AudioSystem.getClip();
				audioInput = AudioSystem.getAudioInputStream(musicPath);
			 	clip.open(audioInput);   
			} else {
				System.out.println("Can't find file.");
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	 }  
	
	// Play the sound clip 
	public void play(){
		    clip.setMicrosecondPosition(clipTimePosition);  // Must always rewind!
		    clip.start();
		    clip.loop(Clip.LOOP_CONTINUOUSLY);
	} 
		 
	// Stop the sound clip
	public void stop(){
		clipTimePosition = clip.getMicrosecondPosition();
		clip.stop();
	}
}
	
	
	
  
 
