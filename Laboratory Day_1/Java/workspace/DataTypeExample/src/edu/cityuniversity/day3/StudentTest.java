package edu.cityuniversity.day3;




 public class StudentTest{
	
	public static void main(String[] args) {
		
		Student s = new Student();
		
		System.out.println(s);
		
		s.setId(40);
		s.setName("Fatema");
		
		System.out.println(s);
		
		Student s1 = new Student(20,"Fasal");
		System.out.println(s1);
		System.out.println("............");
		s1.setName("Faisal");
		
		System.out.println(s1);
		
		System.out.println(s1.getName());


		
		
	}
}