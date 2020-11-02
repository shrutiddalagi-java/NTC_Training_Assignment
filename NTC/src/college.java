
class college {
	
	String collegeName = "University of Texas";
	String collegeAddress = "Austin, TX 78712";
	
	public void bachelorPrgmEnrollment() {
		System.out.println("Successfully enrolled in Bachelor's Degree Enrollment");
	}
	public void masterPrgmEnrollment() {
		System.out.println("Successfully enrolled in Bachelor's Degree Enrollment");
	}
}

class student extends college{
	static String studName = "Shruti";
		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		college c= new college();
		System.out.println("Student name:"+ studName);
		System.out.println("College name:"+ c.collegeName);
		System.out.println("College Address:"+ c.collegeAddress);
		c.masterPrgmEnrollment();
		
		
	}
}