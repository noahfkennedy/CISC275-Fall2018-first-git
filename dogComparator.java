import java.util.*;

class dogComparator implements Comparator<Animal>{ 
	public int compare(Animal d1, Animal d2) {
		if (d1.legs == d2.legs) {
			return 0;
		}
		else if (d1.legs > d2.legs) {
			return 1;
		}
		else {
			return -1;
		}
	}
}
