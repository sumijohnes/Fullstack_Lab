package day2.assignmnet21;

public class GarbageCollection21b {
	
	String garbageLocation;
	GarbageCollection21b garbage;

	public static void main(String[] args) {
		
		GarbageCollection21b garbage1 = new GarbageCollection21b();
		garbage1.garbage = new GarbageCollection21b();
		
		garbage1.garbageLocation = "Mysore";
		garbage1.garbage.garbageLocation = "Bangalore";
		garbage1.garbage.garbage = garbage1;
		garbage1.garbage.garbage = null;	
		garbage1.garbage = null;
		garbage1 = null;

	}

}

//Number of Objects Created: 
//after line 1: 0 objects are garbage collected
//after line 2: 2 objects are garbage collected
//after line 3: remaining 2 objects are garbage collected