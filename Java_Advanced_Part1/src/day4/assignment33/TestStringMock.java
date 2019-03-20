package day4.assignment33;

public class TestStringMock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String message = "Whats in the name";
		
		StringMock sMock = new StringMock();
		
		int index = sMock.search(message, 'i');
		System.out.println(index);

	}

}
