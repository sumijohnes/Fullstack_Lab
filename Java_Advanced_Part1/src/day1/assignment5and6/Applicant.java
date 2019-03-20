package day1.assignment5and6;

public class Applicant {
	
	String firstName;
	String middleName;
	String lastName;
	String emailId;
	String accountType;
	String dOB;
	char gender;
	String maritalStatus;
	
	
	public Applicant() {};
	
	public Applicant(String firstName, String middleName, String lastName,String emailId, String accountType, String dOB, char gender,
			String maritalStatus) {
		super();
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.accountType = accountType;
		this.dOB = dOB;
		this.gender = gender;
		this.maritalStatus = maritalStatus;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getDOB() {
		return dOB;
	}
	public void setDOB(String dOB) {
		this.dOB = dOB;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public String getMaritalStatus() {
		return maritalStatus;
	}
	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}
	
	
	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public void displayDetails() {
		System.out.println("Name: "+this.getFirstName() + " "+ this.getMiddleName()+" "+this.getLastName());
		System.out.println("Emaid Id: "+this.getEmailId());
		System.out.println("DOB: "+this.getDOB());
		System.out.println("Account Type: "+this.getAccountType());
		System.out.println("Gender: "+this.getGender());
		System.out.println("Marital Status: "+this.getMaritalStatus());
	}
	
	

}
