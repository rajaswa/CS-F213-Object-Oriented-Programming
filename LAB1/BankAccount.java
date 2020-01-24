
/**
 * BankAccount class is responsible creating default bank accounts Enable the
 * accounts owner to deposit, withdraw, check balance, etc.
 * 
 * @author Anmol Agarwal, Jahanvi Shah, Rajaswa Patil
 * @version 24 January, 2020
 */
public class BankAccount {
	// BankAccount attributes
	/**
	 * To contain the balance in the account.
	 */
	public double balance;
	/**
	 * To contain the interest rate related to the account.
	 */
	public static final int INTEREST_RATE = 5;
	/**
	 * To count the number of transactions the account has done.
	 */
	public int transactionCount;
	/**
	 * The numbber of free transactions.
	 */
	public static final int NUM_FREE = 3;
	/**
	 * The transaction fees for every transaction above the number of free transactions.
	 */
	public static final int TRANS_FEE = 10;
	/**
	 * The minimum amount the account has to have.
	 */
	public static final int MIN_BALANCE = 1000;

	// BankAccount methods
	/**
	 * This is the constructor responsible for account creation with initial
	 * balance 0.0
	 */
	public BankAccount() {
		balance = MIN_BALANCE;
		transactionCount = 0;
	}



	// methods to read the attributes
	/*
	 *****************************************************************************
	 * TODO
	 * Complete the method to return the Balance value of the bank account object.
	 * @return balance
	 ********************* START YOUR CODE ***************************************
	 */
	public double getBalance() {
		return balance;
	}
	/*
	 ******************** END YOUR CODE ******************************************
	 */

	/**
	 * TODO
	 * Complete the method to returns the number of transactions the account has had.
	 * @return int
	 ********************* START YOUR CODE ***************************************
	 */
	public int getTransactionCount() {
		return transactionCount;
	}

	/*
	 ******************** END YOUR CODE ******************************************
	 */

	/**
	 * This method take care of the deposit transaction. Return true on success
	 * and false on failure.
	 * Only positive amounts can deposited into the accouunt.
	 * Take care of the number of transaction and the transaction fees.
	 * @param amount
	 *            the amount to be deposited
	 * @return boolean
	 ********************* START YOUR CODE ***************************************
	 */
	public boolean deposit(double amount) {
		if (amount > 0)
		{
			transactionCount += 1;
			balance += amount;
			
			if (transactionCount > NUM_FREE)
			{
				balance -= TRANS_FEE;
			}
			
			return true;
		}
		else
		{
			return false;
		}
	}
	/*
	 ******************** END YOUR CODE ******************************************
	 */



	/**
	 * This method take care of the withdraw transaction. Return true on success
	 * and false on failure.
	 * Take care of the number of transaction and the transaction fees.
	 * Assume that the balance in the account is always greater than minimum balance after deducting the transaction fees.
	 * 
	 * @param amount
	 *            the amount to be withdrawn
	 * @return boolean
	 ********************* START YOUR CODE ***************************************
	 */
	public boolean withdraw(double amount) {
		if (amount + MIN_BALANCE <= balance)
		{
			transactionCount += 1;
			balance -= amount;
			
			if (transactionCount > NUM_FREE)
			{
				balance -= TRANS_FEE;
			}
			
			return true;
		}
		else
		{
			return false;
		}
	}
	/*
	 ******************** END YOUR CODE ******************************************
	 */

	/**
	 * Interest is calculated and added to the balance. This is not a new transaction. 
	 ********************* START YOUR CODE ***************************************
	 */
	public void addInterest() {
		balance += INTEREST_RATE / 100.0 * balance;
	}	
	/*
	 ******************** END YOUR CODE ******************************************
	 */

}