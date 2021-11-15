package my.home.module04.aggeragation.task04.logic;

import java.util.Collections;
import java.util.List;

import my.home.module04.aggeragation.task04.entity.Account;

public class CustomerLogic {

	public void sortByBalance(List<Account> accounts) {

		Collections.sort(accounts);
	}

	public Account findByNumber(long number, List<Account> accounts) {

		Account result = new Account();

		for (int i = 0; i < accounts.size(); i++) {

			if (accounts.get(i).getNumber() == number) {
				result = accounts.get(i);

			}
		}
		return result;
	}

	public double findTotalBalance(List<Account> accounts) {

		double result = 0;
		for (int i = 0; i < accounts.size(); i++) {

			double balance = accounts.get(i).getBalance();
			result += balance;
		}
		return result;
	}

	public double findTotalPositiveBalance(List<Account> accounts) {

		double result = 0;
		for (int i = 0; i < accounts.size(); i++) {

			double balance = accounts.get(i).getBalance();
			if (balance > 0) {
				result += balance;
			}
		}
		return result;
	}

	public double findTotalNegativeBalance(List<Account> accounts) {

		double result = 0;
		for (int i = 0; i < accounts.size(); i++) {

			double balance = accounts.get(i).getBalance();
			if (balance < 0) {
				result += balance;
			}
		}
		return result;
	}
}
