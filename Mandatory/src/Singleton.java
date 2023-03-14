class Test{
	private static Test privateobject;
	private Test() {
		int count=0;
		System.out.println(count);
	}
		public static Test getobj(){

		      if(privateobject == null) {
		    	  privateobject = new Test();
		      }

		       return privateobject;
		   }
		
	}

public class Singleton {

	public static void main(String[] args) {
    Test obj=Test.getobj();
    Test obj2=Test.getobj();

	}

}
