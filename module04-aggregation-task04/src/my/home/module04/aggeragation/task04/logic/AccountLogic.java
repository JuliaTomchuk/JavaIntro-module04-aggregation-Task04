package my.home.module04.aggeragation.task04.logic;

import my.home.module04.aggeragation.task04.entity.Account;

public class AccountLogic {

	public void block(Account account) {
		account.setBlocked(true);

	}

	public void unblock(Account account) {
		account.setBlocked(false);
	}
}