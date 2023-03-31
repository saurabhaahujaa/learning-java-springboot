package oracle.spring.business.impl;

import oracle.spring.business.CurrencyConvertor;

public class CurrencyConvertorImpl implements CurrencyConvertor {
	
	private Customer customerRef;
	
	public CurrencyConvertorImpl() {
		super();
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
		double result = 69.34 * dollars;
		return "Hey, " + customerRef.getName() + " Your Converted Value is " + result;
	}

	@Override
	public String poundsToRS(double pounds) {
		// TODO Auto-generated method stub
		double result = 82.67 * pounds;
		return "Hey, " + customerRef.getName() + " Your Converted Value is " + result;
	}

	@Override
	public String riyalsToRS(double riyals) {
		// TODO Auto-generated method stub
		double result = 17.89 * riyals;
		return "Hey, " + customerRef.getName() + " Your Converted Value is " + result;
	}

	@Override
	public String eurosToRS(double euros) {
		// TODO Auto-generated method stub
		double result = 71.56 * euros;
		return "Hey, " + customerRef.getName() + " Your Converted Value is " + result;
	}

	@Override
	public String yensToRS(double yens) {
		// TODO Auto-generated method stub
		double result = 0.5 * yens;
		return "Hey, " + customerRef.getName() + " Your Converted Value is " + result;
	}

	@Override
	public String pesosToRS(double pesos) {
		// TODO Auto-generated method stub
		double result = 0.45 * pesos;
		return "Hey, " + customerRef.getName() + " Your Converted Value is " + result;
	}

}
