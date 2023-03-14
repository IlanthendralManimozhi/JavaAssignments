import java.util.Scanner;

public class PrimeAmstrong {

	public static boolean isPrime(int n) {
		if (n == 0 || n == 1) {
			return false;
		}
		if (n == 2) {
			return true;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;

	}

	public static boolean armstrong(int n) {
		int temp, digits = 0, last = 0, sum = 0;
		temp = n;
		while (temp > 0) {
			temp = temp / 10;
			digits++;
		}
		temp = n;
		while (temp > 0) {
			last = temp % 10;
			sum += (Math.pow(last, digits));
			temp = temp / 10;
		}
		if (n == sum)
			return true;
		else
			return false;
	}
 
	public static long perfect(int num)  
	{      
	long sum=0;  
	for(int i=1; i <= num/2; i++)  
	{  
	if(num % i == 0)  
	{  
	
	sum=sum + i;  
	} 
	} 
	return sum;   
	}
	public static int palindrome(int n){  
		  int r,sum=0,temp;    
		  
		  temp=n;    
		  while(n>0){    
		   r=n%10; 
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  return sum;
		}  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(" lower bound : ");
        int lower = sc.nextInt();
        System.out.print("\nupper bound : ");
        int upper = sc.nextInt();
       
        for (int i = lower; i <= upper; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
        System.out.print("Enter the number: ");  
 
      int num=sc.nextInt();  
      if(armstrong(num))  
      {  
      System.out.println("Armstrong ");  
      } 
      else if(num ==perfect(num) ) {
    	  System.out.println("Perfect number");
      }
      else if(num==palindrome(num))    
      { System.out.println("palindrome number ");  }  
      else   
      {  
      System.out.print("None of these");  
      }  
    }

}
