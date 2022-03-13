package com.tns.Framework;

public abstract class BankFactory {
	public abstract SavingAcc getNewSavingAccount(int AccNo, String accNm,float accBal, boolean isSalaried);
	public abstract CurrentAcc getNewCurrentAccount(int AccNo, String accNm,float accBal,float creditLimit);
}
