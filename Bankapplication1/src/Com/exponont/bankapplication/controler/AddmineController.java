package Com.exponont.bankapplication.controler;

import java.util.Scanner;
import Com.exponont.bankapplication.service.RBI;
import Com.exponont.bankapplication.serviceimp.SBI;

public class AddmineController {

	public static void main(String[] args) {

		System.out.println("************Welcome to SBI Bank******************");
		Scanner sc = new Scanner(System.in);
		RBI rbi = new SBI();

		boolean flag = true;
		int ch;

		while (flag) {
			System.out.println("----------------------------------------");
			System.out.println("----------------------------------------");
			System.out.println("1 : Creat your account                 |");
			System.out.println("2 : Show Account details               |");
			System.out.println("3 : Show Account Blance                |");
			System.out.println("4 : Deposite Mony                      |");
			System.out.println("5 : Withdraw Mony                      |");
			System.out.println("6 : Update your details                |");
			System.out.println("7 : exit                               |");
			System.out.println("----------------------------------------");
			System.out.println("----------------------------------------");

			System.out.println("Enter your Choice");
			ch = sc.nextInt();

			switch (ch) {
			case 1:
				rbi.Createaccount();
				break;
			case 2:
				rbi.ShowAccountDetails();
				break;
			case 3:
				rbi.ShowAccountBlance();
				break;
			case 4:
				rbi.depositeMony();
				break;
			case 5:
				rbi.WithdrawMony();
				break;
			case 6:
				rbi.UpdateAccountdetils();
				break;
			case 7:
				flag = false;
				break;
			default:
				System.out.println("wrong choise");

			}

		}
		sc.close();
		System.out.println("***********Thanx for banking******************");

	}

}
