package Com.exponont.bankapplication.model;
/*
 * @Author = Pradip Sakunde;
 * @Purpose= model class
 * @categary = bank
 * 
 */

public class Account {
	
	private int accountno;
	private String name;
	private String address;
	private String adharno;
	private String panno;
	private String contactno;
	private String emailid;
	private double accountbalnce;
	public int getAccountno() {
		return accountno;
	}
	public void setAccountno(int accountno) {
		this.accountno = accountno;
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
	public String getAdharno() {
		return adharno;
	}
	public void setAdharno(String adharno) {
		this.adharno = adharno;
	}
	public String getPanno() {
		return panno;
	}
	public void setPanno(String panno) {
		this.panno = panno;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public double getAccountbalnce() {
		return accountbalnce;
	}
	public void setAccountbalnce(double accountbalnce) {
		this.accountbalnce = accountbalnce;
	}
	@Override
	public String toString() {
		return "Account [accountno=" + accountno + ", name=" + name + ", address=" + address + ", adharno=" + adharno
				+ ", panno=" + panno + ", contactno=" + contactno + ", emailid=" + emailid + ", accountbalnce="
				+ accountbalnce + "]";
	}
		

}
