package lviv.lgs.ua.min;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Aplication {
	public static void main(String[] args) {
		
		System.out.println("Before sorting:");
		
		Set<MarriedCouple> setCouple = new HashSet<>();
		
		setCouple.add(new MarriedCouple("Petrenko", 19));
		setCouple.add(new MarriedCouple("Ivanenko", 35));
		setCouple.add(new MarriedCouple("Fedorenko", 30));
		setCouple.add(new MarriedCouple("Petrenko", 52));
		setCouple.add(new MarriedCouple("Kurlyak", 11));
		setCouple.add(new MarriedCouple("Antonyak", 5));
		setCouple.add(new MarriedCouple("Petrenko", 19));
		
		for (MarriedCouple marriedCouple : setCouple) {
			System.out.println(marriedCouple);
		}
		
		System.out.println();
		System.out.println("After sorting:");
		
		Set<MarriedCouple> setCouple2 = new TreeSet<>(new CoupleNameeComparator());
		
		setCouple2.add(new MarriedCouple("Petrenko", 19));
		setCouple2.add(new MarriedCouple("Ivanenko", 35));
		setCouple2.add(new MarriedCouple("Fedorenko", 30));
		setCouple2.add(new MarriedCouple("Petrenko", 52));
		setCouple2.add(new MarriedCouple("Kurlyak", 11));
		setCouple2.add(new MarriedCouple("Antonyak", 5));
		setCouple2.add(new MarriedCouple("Petrenko", 19));
		
		for (MarriedCouple marriedCouple : setCouple2) {
			System.out.println(marriedCouple);
		}
		
		
		
	}

}
