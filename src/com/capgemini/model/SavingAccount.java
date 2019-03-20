package com.capgemini.model;

import java.util.Objects;

public class SavingAccount implements Comparable<SavingAccount> {

	private String accountHolderName;
	private long accountId;
	private long accountBalance;
	private boolean isSalaryAccount;

	public SavingAccount() {
		super();
	}

	public SavingAccount(String accountHolderName, long accountId, long accountBalance, boolean isSalaryAccount) {
		super();
		this.accountHolderName = accountHolderName;
		this.accountId = accountId;
		this.accountBalance = accountBalance;
		this.isSalaryAccount = isSalaryAccount;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public long getAccountId() {
		return accountId;
	}

	public void setAccountId(long accountId) {
		this.accountId = accountId;
	}

	public long getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(long accountBalance) {
		this.accountBalance = accountBalance;
	}

	public boolean isSalaryAccount() {
		return isSalaryAccount;
	}

	public void setSalaryAccount(boolean isSalaryAccount) {
		this.isSalaryAccount = isSalaryAccount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(accountHolderName,accountId,accountBalance);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		
		if (this == obj)
			return true;
		
		if(!(obj instanceof SavingAccount))
			return false;
		
		SavingAccount savingaccount=(SavingAccount) obj;
		
		if(savingaccount.accountHolderName.equals(accountHolderName) && this.accountId==savingaccount.accountId && this.accountBalance==savingaccount.getAccountBalance())
			return true;
		return false;
	}

	@Override
	public int compareTo(SavingAccount obj) {
		return (int) (this.accountId - obj.accountId);
	}

}
