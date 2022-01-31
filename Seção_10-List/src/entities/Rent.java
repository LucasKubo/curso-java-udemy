package entities;

public class Rent {
	private String holderName , holderEmail;
	
	public Rent (String holderName, String holderEmail) {
		this.holderName = holderName;
		this.holderEmail = holderEmail;
	}
	
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public String getHolderEmail() {
		return holderEmail;
	}
	public void setHolderEmail(String holderEmail) {
		this.holderEmail = holderEmail;
	}
	
	public String toString() {
		return holderName + ", "+ holderEmail;
	}
}
