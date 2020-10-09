
public class scopeOfVariable_Assignmnt1 {

			//Static variable declaration
	
			public static String courseName = "Core Java";
			
			//Instance variable declaration
			
			int NumOfWeeks = 7;
			
			
			public static void main(String[] args) {
				// TODO Auto-generated method stub
		
				scopeOfVariable_Assignmnt1 s = new scopeOfVariable_Assignmnt1();
				scopeOfVariable_Assignmnt1 s1 = new scopeOfVariable_Assignmnt1();
				scopeOfVariable_Assignmnt1 s2 = new scopeOfVariable_Assignmnt1();
				
				System.out.println("Before changing the value of static variable\n");
				System.out.println(" value of course name for first object " + s.courseName);
				System.out.println(" value of course name for second object " + s1.courseName);
				System.out.println(" value of course name for third object " + s2.courseName+"\n");
				
				s1.courseName = "Advance Java";
				
				System.out.println("After changing the value of static variable\n");
				System.out.println(" value of course name for first object " + s.courseName);
				System.out.println(" value of course name for second object " + s1.courseName);
				System.out.println(" value of course name for third object " + s2.courseName+"\n");
		
				System.out.println("-------------------------------------------------");
				
				
				System.out.println("Before changing the value of Instance variable\n");
				System.out.println(" value of course name for first object " + s.NumOfWeeks);
				System.out.println(" value of course name for second object " + s1.NumOfWeeks);
				System.out.println(" value of course name for third object " + s2.NumOfWeeks+"\n");
				
				s1.NumOfWeeks = 10;
				
				System.out.println("After changing the value of Instance variable \n");
				System.out.println(" value of course name for first object " + s.NumOfWeeks);
				System.out.println(" value of course name for second object " + s1.NumOfWeeks);
				System.out.println(" value of course name for third object " + s2.NumOfWeeks);
		

	}

}
