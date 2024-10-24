package ProgramPacks22;

public class Citizen {
	
	private String name;
    private  String aadharNo;
	private String address;
	private long Phno;
	
	
	public Citizen() {
		System.out.println("Citizen object created");
	}
	
	public Citizen(String name,String aadharNo,String address,long phno) {
		
		this.name = name;
		this.aadharNo = aadharNo;
		this.address = address;
		this.Phno=phno;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAadharNo() {
		return aadharNo;
	}
	
	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	public long getphno() {
		return Phno;
	}
	
	public void setPhno(long phno) {
		this.Phno = phno;
	}
	@Override
	
	//toString() - string representation of an object
	
	public String toString() {
		return "Citizen [name=" + name + ", aadharNo=" + aadharNo + ", address=" + address + ", Phno=" + Phno + "]";
	}
}
