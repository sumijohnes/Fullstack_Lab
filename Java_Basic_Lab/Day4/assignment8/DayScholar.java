
public class DayScholar extends Student {

	String residentialAddress;


	public DayScholar() {

	}


	public DayScholar(int id, char type, String name, double fee, String residentialAddress) {
		super(id,type,name.substring(0, name.indexOf(' ')),name.substring((name.indexOf(' ')), name.length()));
		super.feesPerMonth = fee;
		this.residentialAddress = residentialAddress;

	}



	public String getResidentialAddress() {
		return residentialAddress;
	}


	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}

	public void calculateFees(double semFee) {
		feesPerMonth = semFee/6;
	}

	public void displayDetails() {
		super.displayDetails();
		System.out.println("Address: "+this.getResidentialAddress());

	}

}
