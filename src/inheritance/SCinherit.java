package inheritance;

class Account{
	
	public int accno;
	public String name;
	public String address;
	public int phno;
	public String dob;
	
	public int getAccno() {
		return accno;
	}
	public void setAccno(int accno) {
		this.accno = accno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getPhno() {
		return phno;
	}
	public void setPhno(int phno) {
		this.phno = phno;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	
	public Account(int accno, String name, String address, int phno, String dob) {
		
		accno = accno;
		this.name = name;
		this.address = address;
		this.phno = phno;
		this.dob = dob;
	}
		
}
	class LoanAccount extends Account{

		
}

public class SCinherit {

	public static void main(String args[]) {
		
	}
	
}
