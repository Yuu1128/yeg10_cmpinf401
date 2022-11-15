
public class Staff extends Person {
	private String school;
	private double pay;
	
	public Staff(String name, String address, double pay) {
		name = getName();
		address = getAddress();
		this.pay = pay;
	}

	public String getSchool() {
		return school;
	}

	public void setSchool(String school) {
		this.school = school;
	}

	public double getPay() {
		return pay;
	}

	public void setPay(double pay) {
		this.pay = pay;
	}
	
	@Override
	public String toString() {
		String str = super.toString();
		return str;
	}
}
