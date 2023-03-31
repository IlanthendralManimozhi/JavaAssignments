package taskpackage;

import java.util.Scanner;

/**
 * 
 * @author ilanthendralmanimozhi
 *
 */
public class StrategyPattern {

	/**
	 * Method creates object for MathOperation and create Specified strategy object
	 * through SetStrategy Method
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) {
		int number1;
		int number2;
		Scanner sc = new Scanner(System.in);
		MathOperation mathOperation = new MathOperation();
		mathOperation.setMathStrategy(new AdditionStrategy());
		System.out.println("Enter the operands for Addition");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		System.out.println(mathOperation.performOperation(number1, number2));

		mathOperation.setMathStrategy(new SubtractionStrategy());
		System.out.println("Enter the operands for Subraction");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		System.out.println(mathOperation.performOperation(number1, number2));

		mathOperation.setMathStrategy(new MultiplicationStrategy());
		System.out.println("Enter the operands for Multiplication");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		System.out.println(mathOperation.performOperation(number1, number2));

		mathOperation.setMathStrategy(new DivisionStrategy());
		System.out.println("Enter the operands for Division");
		number1 = sc.nextInt();
		number2 = sc.nextInt();
		System.out.println(mathOperation.performOperation(number1, number2));
		sc.close();

	}

}

class MathOperation {
	private MathStrategy mathStrategy;

	/**
	 * method assign passed strategy to the current MathStrategy object.
	 * 
	 * @param mathStrategy it can be
	 *                     AdditionStrategy,SubractionStrategy,MultiplicationStrategy,DivisionStrategy.
	 */
	public void setMathStrategy(MathStrategy mathStrategy) {
		this.mathStrategy = mathStrategy;
	}

	/**
	 * 
	 * @param num1
	 * @param num2
	 * @return on return it call the Strategy object's execute method and passes the
	 *         arguments as well.
	 */
	public int performOperation(int num1, int num2) {
		return mathStrategy.execute(num1, num2);
	}
}

interface MathStrategy {
	public int execute(int num1, int num2);
}

class AdditionStrategy implements MathStrategy {
	@Override
	public int execute(int num1, int num2) {
		return num1 + num2;// addition
	}
}

class SubtractionStrategy implements MathStrategy {
	@Override
	public int execute(int num1, int num2) {
		return num1 - num2;// subtraction
	}
}

class MultiplicationStrategy implements MathStrategy {
	@Override
	public int execute(int num1, int num2) {
		return num1 * num2; // multiplication
	}
}

class DivisionStrategy implements MathStrategy {
	@Override
	public int execute(int num1, int num2) {
		return num1 / num2;// Division
	}
}
