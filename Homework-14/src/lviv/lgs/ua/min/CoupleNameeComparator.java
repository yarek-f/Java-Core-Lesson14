package lviv.lgs.ua.min;

import java.util.Comparator;

public class CoupleNameeComparator implements Comparator<MarriedCouple> {

	@Override
	public int compare(MarriedCouple o1, MarriedCouple o2) {
		if (o1.getCouple().compareTo(o2.getCouple()) > 0) {
			return 1;
		} else if (o1.getCouple().compareTo(o2.getCouple()) < 0) {
			return -1;
		} else {
			if (o1.getYearsOfMarriedLife() > o2.getYearsOfMarriedLife()) {
				return 1;
			} else if (o1.getYearsOfMarriedLife() < o2.getYearsOfMarriedLife()) {
				return -1;
			}
		}

		return 0;
	}
}
