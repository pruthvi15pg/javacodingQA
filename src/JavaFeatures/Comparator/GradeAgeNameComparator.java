package JavaFeatures.Comparator;

import java.util.Comparator;

import JavaFeatures.Student;

public class GradeAgeNameComparator  implements Comparator<Student>{

	
	 //First by Grade (ascending)
	 //Then by Age (descending)
	 //Then by Name (ascending)
//	@Override
//	public int compare(Student o1, Student o2) {
//		Comparator.comparing(Student::getGrade)
//        .thenComparing(Comparator.comparingInt(Student::getAge).reversed())
//        .thenComparing(Student::getName);
//		return 0;
//
//	}
	
	 @Override
	    public int compare(Student s1, Student s2) {
	        int gradeComp = s1.getGrade().compareTo(s2.getGrade());
	        if (gradeComp != 0) return gradeComp;

	        int ageComp = Integer.compare(s2.getAge(), s1.getAge()); // Descending
	        if (ageComp != 0) return ageComp;

	        return s1.getName().compareTo(s2.getName()); // Ascending
	    }
	 
	 
	

}
