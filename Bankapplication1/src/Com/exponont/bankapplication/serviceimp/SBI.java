package Com.exponont.bankapplication.serviceimp;

import java.util.Scanner;

import Com.exponont.bankapplication.model.Account;
import Com.exponont.bankapplication.service.RBI;

public class SBI implements RBI {

	Scanner sc = new Scanner(System.in);
	Account ac = new Account();

	@Override
	public void Createaccount() {
		System.out.println("Inside Create Account");
		System.out.println("Enter your Account Number");
		ac.setAccountno(sc.nextInt());
		System.out.println("Enter your Name ");
		ac.setName(sc.next());
		System.out.println("Enter your address ");
		ac.setAddress(sc.next());
		System.out.println("Enter your Adharcard  ");
		ac.setAdharno(sc.next());
		System.out.println("Enter your Pancard");
		ac.setPanno(sc.next());
		System.out.println("Enter your Contact ");
		ac.setContactno(sc.next());
		System.out.println("Enter your Email");
		ac.setEmailid(sc.next());
		System.out.println("Enter Account Opening Ammount");
		ac.setAccountbalnce(sc.nextDouble());
		System.out.println("Thanx for Opening Account");
	}

	@Override
	public void ShowAccountDetails() {
		System.out.println("*********Inside Show Account Details************");
		System.out.println("Enter Acount Number");
		int acountno = sc.nextInt();
		if (ac.getAccountno() == acountno) {
			System.out.println("Account Details" + ac);
		} else {
			System.out.println("*******Invalid Account Number**********");
		}

	}

	@Override
	public void ShowAccountBlance() {
		System.out.println("enter your Account Number ");
		int acountno = sc.nextInt();
		if (ac.getAccountno() == acountno) {
			System.out.println("Your Account Ballance : " + ac.getAccountbalnce());
		} else {
			System.out.println("Invalid Account Number");
		}

	}

	@Override
	public void depositeMony() {
		System.out.println(" **************Enter Deposite**************** ");

		System.out.println("Enter your Account Number");
		int acountno = sc.nextInt();
		if (ac.getAccountno() == acountno) {
			System.out.println("Enter your Amount Deposite");
			double ammount = sc.nextDouble();
			double sum = ammount + ac.getAccountbalnce();
			ac.setAccountbalnce(sum);
			System.out.println(" **************Transaction Completed**************** ");

		} else {
			System.out.println("Invalid Account Number");
		}

	}

	@Override
	public void WithdrawMony() {
		System.out.println(" **************Enter Withdral**************** ");


		System.out.println("Enter your Account Number");
		int account = sc.nextInt();
		if (ac.getAccountno() == account) {
			System.out.println("Enter your Amount Withdrow ");
			double with = sc.nextDouble();
			double sub = ac.getAccountbalnce() - with;
			ac.setAccountbalnce(sub);
			System.out.println(" **************Transaction Completed**************** ");

		} else {
			System.out.println("Invalid Account Number");
		}
	}

	@Override
	public void UpdateAccountdetils() {
		System.out.println("*********************Updates your details**************");
		boolean flag = true;
		while (flag) {
			System.out.println("------------------------------------------------------");
			System.out.println("------------------------------------------------------");
			System.out.println("1 : Update your Email id                             |");
			System.out.println("2 : Update your Address                              |");
			System.out.println("3 : Update your Contact                              |");
			System.out.println("4 : Exit                                             |");
			System.out.println("------------------------------------------------------");
			System.out.println("------------------------------------------------------");

			System.out.println("Enter your choice");
			int ch = sc.nextInt();
			
			switch (ch) {
			case 1:
				System.out.println("Enter your Email id");
				String email = sc.next();
				ac.setEmailid(email);
				
				
				break;
			case 2:
				System.out.println("Enter your address");
				String add = sc.next();
				ac.setAddress(add);
				break;
			case 3:
				
				System.out.println("enter your Contact");
				String mono = sc.next();
				ac.setContactno(mono);
				break;
			case 4:
				flag = false;
				break;
			default:
				System.out.println("Invalid choice ");

			}

		}
		System.out.println("**********Completed Update****************");

	}

	

}
