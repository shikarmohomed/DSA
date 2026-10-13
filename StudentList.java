class Student
{
	String name;
	int age;
	
	public Student(String name , int age)
	{
		this.name = name;
		this.age = age;
	}
	
	public String getName()
	{
		return name;
	}
	
	public int getAge()
	{
		return age;
	}
	
	void display(){
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	}
}

public class StudentList {
    public static void displayStudent(Student[] students) {
        System.out.println("Student Details:");

        for (Student S1 : students) {
            System.out.println("Name: " + S1);
            System.out.println("Age: " + S1);
            System.out.println("------------------------");
        }
    }

	 public static void main(String[] args) {
        Student[] students = new Student[3];

        students[0] = new Student("John", 20);
        students[1] = new Student("Jane", 22);
        students[2] = new Student("Alice", 19);
		
		displayStudent(students);
	 }
}	 