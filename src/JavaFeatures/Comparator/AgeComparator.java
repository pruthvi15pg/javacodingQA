package JavaFeatures;

import java.util.Comparator;

public class AgeComparator implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		 //in desc
		return	Integer.compare(s2.getAge(), s1.getAge());
		
		
		//in asc
			//	return	Integer.compare(s1.getAge(), s2.getAge());
				
	}

}
