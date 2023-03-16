class Test {
	private static Test privateObject;

	private Test() {
		int count = 0;
		System.out.println(count);
	}

	public static Test getobj() {

		if (privateobject == null) {
			privateObject = new Test();//object created only if it is null
		}

		return privateObject;//return same object
	}

}

public class Singleton {

	public static void main(String[] args) {
		Test obj = Test.getobj();
		Test obj2 = Test.getobj();

	}

}
