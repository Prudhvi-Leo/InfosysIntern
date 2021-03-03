package com.infy.assignment_Day2_5;
class EPayWallet{
	public static void processPaymentByUser(User user,double billAmount) {
		boolean b = user.makePayment(billAmount);
		//System.out.println(user instanceof KYCUser);
		if(user instanceof KYCUser) {
			KYCUser kyc = (KYCUser)user;
			if(b==true) {
				System.out.println("Congratulations "+user.getUsername()+", payment of "+billAmount+" was successful");
				System.out.println("Your  wallet balance is "+user.getWalletBalance());
				System.out.println("You have "+kyc.getRewardPoints()+" reward point");
			}
			else {
				System.out.println("Sorry "+user.getUsername()+" not enough balance to make payment");
				System.out.println("Your wallet balance is "+user.getWalletBalance());
				System.out.println("You have "+kyc.getRewardPoints()+" reward point");
			}
	}
		else {
			if(b==true) {
				System.out.println("Congratulations "+user.getUsername()+", payment of "+billAmount+" was successful");
				System.out.println("Your  wallet balance is "+user.getWalletBalance());
			}
			else {
				System.out.println("Sorry "+user.getUsername()+" not enough balance to make payment");
				System.out.println("Your wallet balance is "+user.getWalletBalance());
				
			}
	
		}
		System.out.println("_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _");
	}
}
public class Tester {
	
	public static void main(String[] args) {
		User user =  new User(101,"Jack","jack@infy.com",1000);
		User kycuser = new KYCUser(101,"Jill","jill@infy.com",3000);
		EPayWallet.processPaymentByUser(user,700);
		EPayWallet.processPaymentByUser(kycuser,1500);
		EPayWallet.processPaymentByUser(kycuser,800);
		EPayWallet.processPaymentByUser(kycuser,1200);

	}

}

