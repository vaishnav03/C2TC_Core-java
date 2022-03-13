package com.tns.Framework;

public abstract class CurrentAcc extends BankAcc {
	private final float creditLimit;
	
	public float getCreditLimit() {
		return creditLimit;
	}
	
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	public void withdraw(float creditLimit) {
		
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", accBal=" + accBal + ", getCreditLimit()="
				+ getCreditLimit() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
}