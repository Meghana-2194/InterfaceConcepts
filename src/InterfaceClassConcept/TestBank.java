package InterfaceClassConcept;

public class TestBank {

	public static void main(String[] args) {
		
		HSBCBank h = new HSBCBank();
		
		System.out.println(USBank.min_bal); 
		
		h.credit();
		h.debit();
		h.loan();
		h.eduloan();
		h.carLoan();
		
		

	}

}
