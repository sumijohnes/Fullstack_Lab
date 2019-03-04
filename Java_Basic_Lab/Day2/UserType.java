public class UserType {

	String name;
		
	
	public UserType(String paramvalue) {
		
		name = paramvalue;
	}
	
public UserType() {
		
		this("student");
	}


	public static void main(String[] args) {
		
		UserType user1 = new UserType("Faculty");
		UserType user2 = new UserType();
		
		System.out.println(user1.name);
		System.out.println(user2.name);
		

	}

}