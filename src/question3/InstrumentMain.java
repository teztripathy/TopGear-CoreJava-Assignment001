/*
 * 3. Create an abstract class Instrument which is having the abstract function play. 
 * Create three more sub classes from Instrument which is Piano, Flute, Guitar. 
 * Override the play method inside all three classes printing a message
 * “Piano is playing tan tan tan tan ” for Piano class
 * “Flute is playing toot toot toot toot” for Flute class
 * “Guitar is playing tin tin tin ” for Guitar class
 * Create an array of 10 Instruments.
 * Assign different type of instrument to Instrument reference.
 * Check for the polymorphic behavior of play method.
 */

package question3;
public class InstrumentMain {
	public static void main(String[] args) {
		Instrument ref1,ref2,ref3;
		ref1 = new Piano();
		ref1.play();
		
		ref2 = new Flute();
		ref2.play();
		
		ref3 = new Guitar();
		ref3.play();
	}
}
