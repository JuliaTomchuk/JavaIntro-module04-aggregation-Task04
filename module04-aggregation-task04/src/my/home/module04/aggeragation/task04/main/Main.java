package my.home.module04.aggeragation.task04.main;

import java.util.ArrayList;
import java.util.List;

import my.home.module04.aggeragation.task04.entity.Account;
import my.home.module04.aggeragation.task04.entity.Customer;
import my.home.module04.aggeragation.task04.logic.CustomerLogic;
import my.home.module04.aggeragation.task04.view.View;

/*Счета.Клиент может иметь несколько счетов  в банке.Учитывать возможность блокировки/разблокировки счёта.
 * Реализовать поиск и сортировку счетов.Вычесление общей сумму по счетам.
 * Вычисление суммы по всем счетам, имеющие положительные и отрицатльные балансы отдельно */

public class Main {

	public static void main(String[] args) {

		List<Account> accounts = new ArrayList<>();

		accounts.add(new Account(40, false));
		accounts.add(new Account(50, false));
		accounts.add(new Account(-60, false));
		accounts.add(new Account(120, false));
		accounts.add(new Account(-900, false));
		accounts.add(new Account(2000, false));
		accounts.add(new Account(1000, false));

		Customer customer = new Customer("Julia", accounts);

		CustomerLogic logic = new CustomerLogic();

		logic.sortByBalance(customer.getAccounts());

		View view = new View();

		view.print(accounts);

		Account secondAccount = logic.findByNumber(2, customer.getAccounts());

		view.print(secondAccount, "Счёт № 2:  ");

		double totalBalance = logic.findTotalBalance(customer.getAccounts());

		view.print("Общий баланс:", totalBalance);

		double negativeBalance = logic.findTotalNegativeBalance(customer.getAccounts());

		view.print("Отрицательный баланс: ", negativeBalance);

		double positiveBalance = logic.findTotalPositiveBalance(customer.getAccounts());

		view.print("Положительный баланс:", positiveBalance);

	}

}