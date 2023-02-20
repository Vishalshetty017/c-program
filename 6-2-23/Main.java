import java.util.Scanner;

interface Resume{
	void biodata();
}
class Teacher implements Resume{
	String name,phone,qual,achieve;
	int staffId;
	Scanner sc=new Scanner(System.in);
	public void getData(){
		System.out.println("*****ENTER TEACHER DETAILS*******");
		System.out.println("Enter Name:");
		name=sc.nextLine();
		System.out.println("Enter Staff ID:");
		staffId=sc.nextInt();
		System.out.println("Enter Phone number:");
		phone=sc.nextLine();
		phone=sc.nextLine();
		System.out.println("Enter Qualifications:");
		qual=sc.nextLine();
		System.out.println("Enter Achievements:");
		achieve=sc.nextLine();
	}
	public void biodata(){
		
		System.out.println();
		System.out.println("******************************************");
		System.out.println("Name="+name);
		System.out.println("Staff Id="+staffId);
		System.out.println("Phone no.="+phone);
		System.out.println("Qualifications="+qual);
		System.out.println("Achievements="+achieve);
		System.out.println("******************************************");
	}
}
class Student implements Resume{
	String name,phone,usn,branch;
	int result;
	Scanner sc=new Scanner(System.in);
	public void getData(){
		System.out.println("*****ENTER STUDENT DETAILS*******");
		System.out.println("Enter Name:");
		name=sc.nextLine();		
		System.out.println("Enter USN:");
		usn=sc.nextLine();
		System.out.println("Enter Phone number:");
		phone=sc.nextLine();
		System.out.println("Enter your Discipline:");
		branch=sc.nextLine();
		System.out.println("Enter your result percentage:");
		result=sc.nextInt();
	}
	public void biodata(){
		System.out.println("******************************************");
		System.out.println("Name="+name);
		System.out.println("USN="+usn);
		System.out.println("Phone no.="+phone);
		System.out.println("Discipline="+branch);
		System.out.println("Result="+result+"%");
		System.out.println("******************************************");
	}
}
		

public class Main{
	public static void main(String args[]){
		Teacher t1=new Teacher();
		t1.getData();
		t1.biodata();
		System.out.println();
		Student s1=new Student();
		s1.getData();
		s1.biodata();
	}
}
	}	
}


