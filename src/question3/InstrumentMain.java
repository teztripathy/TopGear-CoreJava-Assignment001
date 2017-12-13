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
