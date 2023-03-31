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
		double result=81.2*dollars;
		return "Hey,"+customerRef.getName()+"Your converted value is "+result;
	}

	@Override
	public String poundsToRS(double pounds) {
		// TODO Auto-generated method stub
		double result=17.89*pounds;
		return "Hey,"+customerRef.getName()+"Your converted value is "+result;
	}

	@Override
	public String riyalsToRS(double riyals) {
		// TODO Auto-generated method stub
		double result=23*riyals;
		return "Hey,"+customerRef.getName()+"Your converted value is "+result;
	}

	@Override
	public String euroToRS(double euros) {
		// TODO Auto-generated method stub
		double result=98.3*euros;
		return "Hey,"+customerRef.getName()+"Your converted value is "+result;
	}

	@Override
	public String yensToRS(double yens) {
		// TODO Auto-generated method stub
		double result=11.2*yens;
		return "Hey,"+customerRef.getName()+"Your converted value is "+result;
	}

	@Override
	public String pesosToRS(double pesos) {
		// TODO Auto-generated method stub
		double result=1.2*pesos;
		return "Hey,"+customerRef.getName()+"Your converted value is "+result;
	}

}
