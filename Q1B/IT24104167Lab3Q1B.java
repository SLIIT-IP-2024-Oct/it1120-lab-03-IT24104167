import java.util.Scanner;
public class IT24104167Lab3Q1B {
	public static void main(String[]args){
		//Declare Variables
		double priceperkg, quantity, amount, discount, totalamount;
		
		//Create Scanner class
		Scanner input = new Scanner(System.in);
		
		//Take priceperkg and quantity as user input
		System.out.print("Enter the price of 1kg of rice :");
		priceperkg = input.nextDouble();
		System.out.print("Enter the number of Kg :");
		quantity = input.nextDouble();
		
		//Calculation
		amount = priceperkg * quantity;
		discount = amount*0.1;
		totalamount = amount-discount;
		
		//Display output
		System.out.println("The total amount with 10% discount is:"+ totalamount);
	
	}
}