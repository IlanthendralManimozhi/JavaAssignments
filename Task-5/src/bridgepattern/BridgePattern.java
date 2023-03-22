package bridgepattern;

public class BridgePattern {
/**
 * creating maruti object with Car(abstract class) reference.
 * @param args not used
 */
	public static void main(String[] args) {
		Car breeza = new Maruti(new Breeza());
		Car vitara = new Maruti(new Vitara());

		breeza.build();
		vitara.build();
	}

}
