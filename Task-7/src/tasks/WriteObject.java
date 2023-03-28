package tasks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class WriteObject {
	public static void main(String[] args) throws Exception {
		Samosa samosa = new Samosa();
		System.out.println("the size of samosa..:" + samosa.size);
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("samosa.dat"));
		oos.writeObject(samosa);
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("samosa.dat"));
		samosa = (Samosa) ois.readObject();
		System.out.println("back in time...samosa size..:" + samosa.size);
		ois = new ObjectInputStream(new FileInputStream("samosa.dat"));
		Samosa samosa2 = (Samosa) ois.readObject();
		System.out.println(samosa2.size);
	}
}

class Samosa implements Serializable{

	// private static final long serialVersionUID = 1L;
	int size = 10;
}