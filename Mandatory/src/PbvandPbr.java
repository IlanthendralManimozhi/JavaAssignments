import java.util.Arrays;

public class PbvandPbr {

	public static void main(String[] args) {
		Pass val = new Pass();
		System.out.println(val.num);
		val.pbv(10);
		System.out.println(val.num);
		System.out.println(val.num + 10);
		int[] arr = { 1, 2, 4 };
		val.pbr(arr);
		System.out.println(Arrays.toString(arr));

	}

}

class Pass {
	int num = 3;
//passed as value
	public void pbv(int number) {
		number = number + 100;
		System.out.println(number);
	}
	//passed by reference

	public void pbr(int[] arr) {
		arr[2] = 9;

	}
}