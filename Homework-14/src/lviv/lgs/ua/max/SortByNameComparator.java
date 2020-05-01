package lviv.lgs.ua.max;

import java.util.Comparator;

public class SortByNameComparator implements Comparator<Commodity>{

	@Override
	public int compare(Commodity arg0, Commodity arg1) {
		if (arg0.getName().compareTo(arg1.getName()) > 0) {
			return 1;
		} else if (arg0.getName().compareTo(arg1.getName()) < 0) {
			return -1;		
		
	}
		return 0;
	}
	
}
