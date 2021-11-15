package my.home.module04.aggeragation.task04.entity;

public class Account implements Comparable<Account> {
	private static long counter;
	private final long number = counter++;
	private double balance;
	private boolean blocked;

	public Account() {
		balance = 0;
		blocked = false;

	}

	public Account(double balance, boolean blocked) {
		this.balance = balance;
		this.blocked = blocked;

	}

	public static long getCounter() {
		return counter;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public boolean isBlocked() {
		return blocked;
	}

	public void setBlocked(boolean blocked) {
		this.blocked = blocked;
	}

	public long getNumber() {
		return number;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(balance);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + (blocked ? 1231 : 1237);
		result = prime * result + (int) (number ^ (number >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (Double.doubleToLongBits(balance) != Double.doubleToLongBits(other.balance))
			return false;
		if (blocked != other.blocked)
			return false;
		if (number != other.number)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[number=" + number + ", balance=" + balance + ", blocked=" + blocked
				+ "]";
	}

	@Override
	public int compareTo(Account o) {

		return (int) (balance - o.balance);
	}

}
