import java.util.Scanner;
public class IT24104167Lab3Q4{
	public static void main(String[]args){
		//declare variables
		int num, digit1, digit2, digit3, digit4, digit5;
		
		//Create Scanner class
		Scanner input = new Scanner(System.in);

		//Take number as user input
		System.out.print("Enter five digit number : ");
		num = input.nextInt();

		//Calculation
		digit1 = num/10000;
		num = num%10000;

		digit2= num/1000;
		num = num%1000;

		digit3= num/100;
		num = num%100;

		digit4= num/10;
		num = num%10;

		digit5= num;
		
		System.out.print(digit1 + " ");
		System.out.print(digit2+ " ");
		System.out.print(digit3+ " ");
		System.out.print(digit4+ " ");
		System.out.print(num);
	}
}