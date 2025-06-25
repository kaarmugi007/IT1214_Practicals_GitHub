/*Write a java program using the ArrayList to manage the list of product prieces in a store

1.Accept prices of 7 product from the user and store them in an ArrayList<Double>

2.Display all the prices

3.Count and display how many product cost more than 100

4.Increse each price by 10% and display the updated list

5.Remove any product priced above 500 after the increase and show the final list*/


import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.Iterator;

public class ProductPriceManager{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		ArrayList<Double> prices = new ArrayList<>();
		
		//Getting the prices of 7 products
		System.out.println("Enter the price of 7 products: ");
		
		for(int i=0; i<7; i++){
			System.out.println("Enter the price of product " + (i+1) +":");
			double price = sc.nextDouble();
			prices.add(price);
		}
		
		//Display all the product prices
		System.out.println("\nThe prices of the products: " + prices);
		
		//count and display how many products cost more than 100
		Iterator<Double> iterator = prices.iterator();
		
		int count = 0;
		
		//System.out.println("\nThe prices of products more than 100: ");
		
		for(double price:prices){
			if (price>100)
			{
					count ++;
					//System.out.println(price);
					
			}
		}
		
		System.out.println("\nThe no of products with the price more than 100: " +  count);
		
		//Increase each prices by 10%
		for (int i=0; i<prices.size(); i++){
			double updatePrice = prices.get(i)*1.10;
			prices.set(i,updatePrice);
		}
		System.out.println("\nThe updated price list: " +  prices);
		
		//Remove products priced above 500 after the increase
		for (int i=prices.size()-1; i>=0; i--){
			if (prices.get(i)>500)
			{
				prices.remove(i);
			}
		}
		
		System.out.println("\nThe updated price list after removing the products priced above 500: " +  prices);
		
		sc.close();
		
	}
}