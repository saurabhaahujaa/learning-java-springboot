package training.oracle.business;

public class CurrencyConvertorImpl implements CurrencyConvertor {

	private Customer customerRef;
	
	public CurrencyConvertorImpl(){
		
	}
	
	public CurrencyConvertorImpl(Customer customerRef) {
		super();
		this.customerRef = customerRef;
	}

	public Customer getCustomerRef() {
		return customerRef;
	}

	public void setCustomerRef(Customer customerRef) {
		this.customerRef = customerRef;
	}

	@Override
	public String dollarToRS(double dollars) {
		// TODO Auto-generated method stub
		return customerRef.getName() + ", Your Currency Converted Value is : " + 68.23 * dollars;
	}

	@Override
	public String poundsToRS(double pounds) {
		// TODO Auto-generated method stub
		return customerRef.getName() + ", Your Currency Converted Value is : " + 81.45 * pounds;
	}

	@Override
	public String riyalsToRS(double riyals) {
		// TODO Auto-generated method stub
		return customerRef.getName() + ", Your Currency Converted Value is : " + 17.89 * riyals;
	}

	@Override
	public String eurosToRS(double euros) {
		// TODO Auto-generated method stub
		return customerRef.getName() + ", Your Currency Converted Value is : " + 79.34 * euros;
	}

	@Override
	public String yensToRS(double yens) {
		// TODO Auto-generated method stub
		return customerRef.getName() + ", Your Currency Converted Value is : " + 0.5 * yens;
	}

}
