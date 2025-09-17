package JavaFeatures;

public class Student implements Comparable<Student>{


	    private int id;
	    private String name;
	    private int age;
	    private String department;
	    private double marks;
	    private String grade;

	    public Student(int id, String name, int age, String department, double marks, String grade) {
	        this.id = id;
	        this.name = name;
	        this.age = age;
	        this.department = department;
	        this.marks = marks;
	        this.grade = grade;
	    }

	    // Getters
	    public int getId() { return id; }
	    public String getName() { return name; }
	    public int getAge() { return age; }
	    public String getDepartment() { return department; }
	    public double getMarks() { return marks; }
	    public String getGrade() { return grade; }

	    @Override
	    public String toString() {
	        return id + " - " + name + " - Age: " + age + " - Dept: " + department + " - Marks: " + marks + " - Grade: " + grade;
	    }

//	    //sorting id
//		@Override
//		public int compareTo(Student s) {
//			if(id==s.getId()) {
//				return 0;
//			}else if(id>s.getId()) {
//				return 1;
//			}else {
//				return -1;
//			}
//		}
		
		//sorting id another way
		@Override
		public int compareTo(Student s) {
		    return Integer.compare(this.id, s.getId());
		}

	


}

