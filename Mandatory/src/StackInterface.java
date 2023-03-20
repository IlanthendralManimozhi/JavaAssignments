import java.util.Arrays;
import java.util.Scanner;

public class StackInterface {

	public static void main(String[] args) {
		Stack objFixed = new FixedStack();
		Stack objDynamic = new DynamicStack();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 7; i++) {
			objFixed.push(sc.nextInt());

		}
		for (int i = 0; i < 7; i++) {
			objFixed.pop();

		}

		for (int i = 0; i < 7; i++) {
			objDynamic.push(sc.nextInt());

		}
		for (int i = 0; i < 7; i++) {
			objDynamic.pop();
		}

		sc.close();

	}

}

interface Stack {
	public void push(int n);

	public void pop();
}

class FixedStack implements Stack {
	int[] arr = new int[5];
	int count = 0;
	int index = 0;

	public void push(int n) {// push the number
		if (count > arr.length - 1) {
			System.out.println("stack full");
		} else {
			arr[index] = n;
			++count;
			System.out.println("Pushed");
			++index;
		}

	}

	public void pop() {// pop the number from last index
		if (index <= 0) {
			System.out.println("stack is empty");
		} else {
			System.out.println(arr[index - 1]);
			arr[--index] = 0;
		}

	}
}

class DynamicStack implements Stack {
	int size = 5;
	int[] arr = new int[size];
	int count = 0;
	int index = 0;

	public void push(int n) {// push the number
		if (count > arr.length - 1) {
			arr = Arrays.copyOf(arr, arr.length + 1);
			push(n);

		} else {
			arr[index] = n;
			++count;
			System.out.println("Pushed");
			++index;
		}

	}

	public void pop() {// pop the number from last index
		if (index <= 0) {
			System.out.println("stack is empty");
		} else {
			System.out.println(arr[index - 1] );
			--index;
			arr = Arrays.copyOf(arr, arr.length - 1);
		}

	}

	public void resize() {// modify the array size
		int[] transfer = new int[arr.length + 1];

		for (int i = 0; i < transfer.length; i++) {
			System.out.println(arr[i]);
			transfer[i] = arr[i];
			arr = transfer;
		}
		size = transfer.length;

	}

	public void reduce() {// modify the array size
		int[] transfer = new int[index];
		for (int i = 0; i < transfer.length; i++) {
			transfer[i] = arr[i];
			arr = transfer;
		}
		size = transfer.length;

	}
}