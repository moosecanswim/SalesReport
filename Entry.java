package salesReport;

//i dont really need the "get[X]" methods but i just generated them with the setters so i just left them there

public class Entry {
	private String phoneNumber;
	private String name;
	private double salesAmount;
	private int taxCode;
	private double taxDue;
	private double amountDue;
	
	//made this default new object so i could track down any setters/ getters that are not working
	public Entry(){
		this.phoneNumber = "xxx-xxx-xxxx";
		this.name = "default name";
		this.salesAmount = 0.0;
		this.taxCode = 0;
		this.taxDue = 0.0;
		this.amountDue = 0;
	}
	
	//added a print method so i can just print each object in the array list easily
	public void printEntry(){
		String output = String.format("Phone Number: %-12s | Name: %-15s | Sales Amount: $%10.2f | Sales Tax: $%10.2f | Total Due: $%10.2f",phoneNumber, name, salesAmount, taxDue,amountDue );
		System.out.println(output);
	}
	
	
	public double getTaxDue() {
		return taxDue;
	}

	public void setTaxDue(double taxDue) {
		this.taxDue = taxDue;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalesAmount() {
		return salesAmount;
	}
	public void setSalesAmount(double salesAmount) {
		this.salesAmount = salesAmount;
	}
	public int getTaxCode() {
		return taxCode;
	}
	public void setTaxCode(int taxCode) {
		this.taxCode = taxCode;
	}
	public double getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}
}
