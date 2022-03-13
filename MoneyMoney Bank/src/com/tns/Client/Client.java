package com.tns.Client;

import com.tns.Application.MMBankFactory;
import com.tns.Application.MMCurrentAc;
import com.tns.Application.MMSavingAcc;
import com.tns.Framework.BankFactory;
import com.tns.Framework.CurrentAcc;
import com.tns.Framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		BankFactory bf =new MMBankFactory();
		SavingAcc sa =new MMSavingAcc(14,"DEEPAK",10000,true);
		sa.withdraw(sa.getAccBal());
		sa.toString();
		CurrentAcc ca =new MMCurrentAc(04,"DEEPAK",10000,20000);
		ca.withdraw(ca.getCreditLimit());
		ca.toString();
		
	}

}