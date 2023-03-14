import java.util.Arrays;
public class PbvandPbr {

	public static void main(String[] args) {
		Pass val=new Pass();
		System.out.println(val.n);
		val.pbv(10);
		System.out.println(val.n);
		System.out.println(val.n+10);
		int[] arr= {1,2,4};
		val.pbr(arr);
		System.out.println(Arrays.toString(arr));
		

	}

}
class Pass{
	int n=3;
	public  void pbv(int n)
	{
		n=n+100;
		System.out.println(n);
	}
	public void pbr(int[] arr) {
		arr[2]=9;
		
	}
}