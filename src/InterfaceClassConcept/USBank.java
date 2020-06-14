package InterfaceClassConcept;

public interface USBank extends IndiaBank{
	
	int min_bal = 100; // to access this , define this in main method
	public void credit(); // no method body (100% abstraction)
	public void debit();
	public  void loan();

}
