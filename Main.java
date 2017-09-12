import java.util.*;
public class Main {

	public static void main(String[] args) {
                //Scanner sc=new Scanner(System.in);
                //int n=sc.nextInt();
               
                StudentGroup st=new StudentGroup(3);
                Student s=new Student(123,"dfg",new Date(),23.4);
Student s1=new Student(126,"dfgfgbh",new Date(),23.4);
Student s2=new Student(1238,"dfrhg",new Date(),23.4);
                 st.setStudent(s,0);
     st.setStudent(s1,1);
     st.setStudent(s2,2);
                 System.out.println(st.getStudent(0).getId());
		 


		//You may test that your code works find here
		//Please check that your code works and has no 
		//compilation problems before to submit
	}

}
