package com.infy.assignment_Day2_5;

public class User {
		private int id;
		private String username;
		private String email;
		private double walletBalance;
		public User(int id, String username, String email, double walletBalance) {
			super();
			this.id = id;
			this.username = username;
			this.email = email;
			this.walletBalance = walletBalance;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getUsername() {
			return username;
		}
		public void setUsername(String username) {
			this.username = username;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public double getWalletBalance() {
			return walletBalance;
		}
		public void setWalletBalance(double walletBalance) {
			this.walletBalance = walletBalance;
		}
		public boolean makePayment(double billAmount) {
			double balance = this.getWalletBalance() - billAmount;
			if(balance >=0) {
				this.setWalletBalance(balance);
				return true;
			}
			else {
				return false;
			}
				
		}
}
class KYCUser extends User{
	private int rewardPoints;
	KYCUser(int id,String username,String email,double walletBalance){
		super(id,username,email,walletBalance);
	}
	public int getRewardPoints() {
		return rewardPoints;
	}
	public void setRewardPoints(int rewardPoints) {
		this.rewardPoints = rewardPoints;
	}
	public boolean makePayment(double billAmount) {
		double balance = this.getWalletBalance() - billAmount;
		if(balance >=0) {
			this.setWalletBalance(balance);
			this.rewardPoints = this.rewardPoints+(int) (billAmount*10/100);
			return true;
		}
		else {
			return false;
		}
	}
}