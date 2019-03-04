public class CodingStandard {
	private int i = 22;
	private int j = 14000;
	private boolean k ;
	private boolean l;
	
	public static void main(String[] args) {
		
		
	    CodingStandard codingStandard = new CodingStandard();
	    codingStandard.i = 22;
	    codingStandard.j = 14000;
	    codingStandard.k = codingStandard.Method1(codingStandard.i) ;
	    codingStandard.l = codingStandard.Method2(codingStandard.j);
	    
	    if(codingStandard.k == true && codingStandard.l == true) {
	    	System.out.println("Is a new Employee");
	    }
	    else
	    {
	    	System.out.println("Is not a new Employee");
	    }
		

	}

	private boolean Method1(int i) {
		
		if(i>20 && i<30)
			return true;
		else
			return false;
	}
	
	private boolean Method2(int j) {
		if(j>=14000 && j<20000)
			return true;
		else
			return false;
	}

}
