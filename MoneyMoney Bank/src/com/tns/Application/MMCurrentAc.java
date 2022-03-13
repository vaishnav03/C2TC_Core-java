package com.tns.Application;

import com.tns.Framework.CurrentAcc;

public class MMCurrentAc extends CurrentAcc{
	
	
	public MMCurrentAc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}

	public void withdraw(float creditLimit) {
		System.out.println("Dear user your account balance is: "+accBal+" with credit limit of: "+creditLimit);
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

	
	
}