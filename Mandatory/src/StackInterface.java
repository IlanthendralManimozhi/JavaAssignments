import java.util.Arrays;

public class StackInterface {

	public static void main(String[] args) {
		stack objfixed = new FixedStack();
		stack objdynamic = new DynamicStack();
		objfixed.push(5);
		objfixed.push(8);
		objfixed.push(4);
		objfixed.push(2);
		objfixed.push(1);
		objfixed.push(8);
		objfixed.push(2);
		objfixed.pop();
		objfixed.pop();
		objfixed.pop();
		objfixed.pop();
		objfixed.pop();
		objfixed.pop();
		objdynamic.push(8);
		objdynamic.push(4);
		objdynamic.push(2);
		objdynamic.push(1);
		objdynamic.push(8);
		objdynamic.push(3);
		objdynamic.push(9);
		objdynamic.push(2);
		objdynamic.pop();
		objdynamic.pop();
		objdynamic.pop();
		objdynamic.pop();
		objdynamic.pop();
		objdynamic.pop();
		objdynamic.pop();
		objdynamic.pop();
		objdynamic.pop();
		

	}

}
interface stack{
	public void push(int n);
	public void pop();
}
class FixedStack implements stack{
	int[] arr=new int[5];
    int count=0;
    int index=0;
	
	public void push(int n) {
		if(count>arr.length-1) {
			System.out.println("stack full");
		}
		else {
			arr[index]=n;
			++count;
			System.out.println(arr[index]+" "+index);
			++index;
		}
		
	}
	public void pop() {
		if(index<=0) {
			System.out.println("stack is empty");
		}
		else {
			System.out.println(arr[index-1]);
			arr[--index]=0;
		}
		
	}
		}
class DynamicStack implements stack{
	int size=5;
	int[] arr=new int[size];
    int count=0;
    int index=0;
	public void push(int n) {
		if(count>arr.length-1) {
			arr = Arrays.copyOf(arr, arr.length + 1);
			push(n);
			
		}
		else {
			arr[index]=n;
			++count;
			System.out.println(arr[index]+" "+index);
			++index;
		}
		
	}
	public void pop() {
		if(index<=0) {
			System.out.println("stack is empty");
		}
		else {
			System.out.println(arr[index-1]+" "+(index-1));
			--index;
			arr = Arrays.copyOf(arr, arr.length-1);
		}
		
	}
	public void resize() {
		int[] transfer = new int[arr.length+2];

        for (int i = 0; i < transfer.length; i++) {
        	System.out.println(arr[i]);
            transfer[i] = arr[i];
            arr = transfer;
        }
        size=transfer.length;
 
   }
	public void reduce() {
		int[] transfer= new int[index];
		for (int i = 0; i < transfer.length; i++) {
            transfer[i] = arr[i];
            arr = transfer;
        }
        size=transfer.length;
		
	}
}