package my.home.module04.aggeragation.task04.view;

import java.util.List;

import my.home.module04.aggeragation.task04.entity.Account;

public class View {

	public void print(Account account, String message) {
		System.out.println(message + account);
	}

	public void print(List<Account> accounts) {
		for (Account ac : accounts) {
			System.out.println(ac);
		}
	}

	public void print(String message, double balance) {

		System.out.println(message + balance);
	}

}
