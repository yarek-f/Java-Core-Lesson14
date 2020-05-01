package lviv.lgs.ua.max;

import java.util.Scanner;

public class Application {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean key = true;
		
		while (key) {
			new Application().menu();

			int choise = scanner.nextInt();
			switch (choise) {
			case 1:
				Commodity.addCommodity();
				break;
				
			case 2:
				Commodity.deleteCommodity();
				break;
				
			case 3:
				Commodity.replaceCommodity();
				break;
				
			case 4:
				Commodity.sortByName();
				break;
				
			case 5:
				Commodity.sortByLength();
				break;
				
			case 6:
				Commodity.sortByWidth();
				break;
				
			case 7:
				Commodity.sortByWeight();
				break;
				
			case 8: 
				Commodity.getElement();
				break;
				
			case 9: 
				Commodity.exit();
				break;
			}
		}
		
		
	}
	
	public void menu() {
		System.out.println("	   ***		 ");
		System.out.println("Enter 1: TO ADD NEW Commodity !");
		System.out.println("Enter 2: TO DELETE SELECTED !");
		System.out.println("Enter 3: TO replace some !");
		System.out.println("Enter 4: TO SORT BY NAME !");
		System.out.println("Enter 5: TO SORT BY LENGTH !");
		System.out.println("Enter 6: TO SOTR BY WIDTH !");
		System.out.println("Enter 7: TO SORT BY WEIGHT !");
		System.out.println("Enter 8: TO SHOW ELEMENT !");
		System.out.println("Enter 9: TO EXIT !");
	}

}
