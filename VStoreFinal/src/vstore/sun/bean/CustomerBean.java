package vstore.sun.bean;

public class CustomerBean {
	private int custid;
	private String CustFullname,custAddress,custType,custMobno;
	public String getCustFullname() {
		return CustFullname;
	}
	public void setCustFullname(String custFullname) {
		CustFullname = custFullname;
	}
	public int getCustid() {
		return custid;
	}
	public void setCustid(int custid) {
		this.custid = custid;
	}
	public String getCustAddress() {
		return custAddress;
	}
	
	
	public void setCustAddress(String custAddress) {
		this.custAddress = custAddress;
	}
	public String getCustType() {
		return custType;
	}
	public void setCustType(String custType) {
		this.custType = custType;
	}
	public String getCustMobno() {
		return custMobno;
	}
	public void setCustMobno(String custMobno) {
		this.custMobno = custMobno;
	}
	
	
	
	 
	
}
