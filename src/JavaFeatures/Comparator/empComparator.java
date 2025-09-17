package JavaFeatures;

import java.util.Comparator;

public class empComparator implements Comparator<Employee> {

	@Override
	public int compare(Employee s1, Employee s2) {
		if (s1 == null && s2 == null) return 0;  // both null → equal
        if (s1 == null) return -1;               // null comes first
        if (s2 == null) return 1;                // non-null after null

		return s1.getName().compareTo(s2.getName());
	}

}
