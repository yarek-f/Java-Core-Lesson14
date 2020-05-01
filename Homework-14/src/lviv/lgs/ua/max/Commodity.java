package lviv.lgs.ua.max;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Scanner;

public class Commodity {
	private static ArrayList<Commodity> commodityInventory = new ArrayList<>();

	private String name;
	private int length;
	private int width;
	private int weight;

	public Commodity(String name, int length, int width, int weight) {
		this.name = name;
		this.length = length;
		this.width = width;
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	@Override
	public String toString() {
		return "Commodity [name=" + name + ", length=" + length + ", width=" + width + ", weight=" + weight + "]";
	}

	/*
	 * @Override public int hashCode() { final int prime = 31; int result = 1;
	 * result = prime * result + length; result = prime * result + ((name == null) ?
	 * 0 : name.hashCode()); long temp; temp = Double.doubleToLongBits(weight);
	 * result = prime * result + (int) (temp ^ (temp >>> 32)); result = prime *
	 * result + width; return result; }
	 * 
	 * @Override public boolean equals(Object obj) { if (this == obj) return true;
	 * if (obj == null) return false; if (getClass() != obj.getClass()) return
	 * false; Commodity other = (Commodity) obj; if (length != other.length) return
	 * false; if (name == null) { if (other.name != null) return false; } else if
	 * (!name.equals(other.name)) return false; if (Double.doubleToLongBits(weight)
	 * != Double.doubleToLongBits(other.weight)) return false; if (width !=
	 * other.width) return false; return true; }
	 */

	public static void showAllCommodity() {
		ListIterator<Commodity> deputyIterator = commodityInventory.listIterator();

		while (deputyIterator.hasNext()) {
			System.out.println(deputyIterator.next());
		}

	}

	public static void addCommodity() {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter name of Commodity: ");
		String inputName = s.next();
		System.out.println("Enter length of Commodity: ");
		int inputLength = s.nextInt();
		System.out.println("Enter width of Commodity: ");
		int inputWidth = s.nextInt();
		System.out.println("Enter weight of Commodity: ");
		int inputWeight = s.nextInt();

		Commodity commodity = new Commodity(inputName, inputLength, inputWidth, inputWeight);

		commodityInventory.add(commodity);

		Commodity.showAllCommodity();
	}

	public static void deleteCommodity() {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter name of commodity which you want to except from inventory! ");
		String inputName = s.next();

		Iterator<Commodity> deputyIterator = commodityInventory.iterator();

		while (deputyIterator.hasNext()) {
			if (inputName.equals(deputyIterator.next().getName())) {
				deputyIterator.remove();
			}
		}

		Commodity.showAllCommodity();
	}

	public static void replaceCommodity() {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter the name of the commodity which you want to replace from inventory! ");
		String inputName = s.next();

		Iterator<Commodity> deputyIterator = commodityInventory.iterator();

		while (deputyIterator.hasNext()) {
			if (inputName.equals(deputyIterator.next().getName())) {
				deputyIterator.remove();
			}
		}

		System.out.println("Enter name of Commodity: ");
		String inputName2 = s.next();
		System.out.println("Enter length of Commodity: ");
		int inputLength = s.nextInt();
		System.out.println("Enter width of Commodity: ");
		int inputWidth = s.nextInt();
		System.out.println("Enter weight of Commodity: ");
		int inputWeight = s.nextInt();

		Commodity commodity = new Commodity(inputName2, inputLength, inputWidth, inputWeight);

		commodityInventory.add(commodity);

		Commodity.showAllCommodity();
	}

	public static void sortByName() {
		Collections.sort(commodityInventory, new SortByNameComparator());
		Commodity.showAllCommodity();
	}

	public static void sortByLength() {
		Collections.sort(commodityInventory, new SortByLengthComparator());
		Commodity.showAllCommodity();
	}

	public static void sortByWidth() {
		Collections.sort(commodityInventory, new SortByWidthComparator());
		Commodity.showAllCommodity();
	}

	public static void sortByWeight() {
		Collections.sort(commodityInventory, new SortByWeightComparator());
		Commodity.showAllCommodity();
	}

	public static void getElement() {
		Scanner s = new Scanner(System.in);

		System.out.println("Enter number: ");
		int number = s.nextInt();

		System.out.println(commodityInventory.get(number));
	}

	public static void exit() {
		System.out.println("exit...");
		System.exit(0);
	}

}
