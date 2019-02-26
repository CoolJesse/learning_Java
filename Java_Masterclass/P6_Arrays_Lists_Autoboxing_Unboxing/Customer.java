public class Customer{
	
	private String name;
	private double balance;
	
/** Constructor ********************************************************************/
	public Customer(String name, double balance){
		this.name = name;
		this.balance = balance;
	}	
/** Getters ************************************************************************/	
	public String getName(){
		return name;
	}
	public double getBalance(){
		return balance;
	}
/** Setters *************************************************************************/
	public void setName(String name){
		this.name = name;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
}