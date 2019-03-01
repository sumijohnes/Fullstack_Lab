public class StudentCLA {

	private int studentId;
	private String studentName;
	private String residentialStatus;
	private long feesPerMonth;


	public StudentCLA() {

	}

	public int getStudentId() {
		return studentId;
	}


	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}


	public String getStudentName() {
		return studentName;
	}


	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getResidentialStatus() {
		return residentialStatus;
	}

	public void setResidentialStatus(String residentialStatus) {
		this.residentialStatus = residentialStatus;
	}


	public long getFeesPerMonth() {
		return feesPerMonth;
	}

	public void setFeesPerMonth(long feesPerMonth) {
		this.feesPerMonth = feesPerMonth;
	}


	public static void main(String[] args) {
		StudentCLA student = new StudentCLA();

		int id = Integer.parseInt(args[0]);
		String name = args[1];
		String status = args[2];
		long semFee = Integer.parseInt(args[3]);
		long hostFee = 0;
		if(status.equalsIgnoreCase("Hostelite") && args.length<5) {
					System.out.println("Please Provide Hostel fee as well");
		}
		else {
		if(args.length==5){
		hostFee = Integer.parseInt(args[4]);
	    }


		student.setStudentId(id);
		student.setStudentName(name);
		student.setResidentialStatus(status);

		student.setFeesPerMonth((semFee/6) + hostFee);

		System.out.println(student.getStudentId());
		System.out.println(student.getStudentName());
		System.out.println(student.getResidentialStatus());
		System.out.println(student.getFeesPerMonth());


    }

	}

}