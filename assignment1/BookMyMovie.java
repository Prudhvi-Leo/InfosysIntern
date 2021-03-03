package com.infy.assignment1;

public class BookMyMovie {
		private int movieId;
		private int noOfTickets;
		private double discount;
		private double totalAmount;
		
	public BookMyMovie(int movieId, int noOfTickets) {
			this.movieId = movieId;
			this.noOfTickets = noOfTickets;
		}
		
	public int getMovieId() {
		return movieId;
	}

	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}

	public int getNoOfTickets() {
		return noOfTickets;
	}

	public void setNoOfTickets(int noOfTickets) {
		this.noOfTickets = noOfTickets;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}
	public void calculateDiscount() {
	if((this.getMovieId()==101||this.getMovieId()==102||this.getMovieId()==103)&&this.getNoOfTickets()<5) 
		this.discount = 0;
		else if((this.getMovieId()==101||this.getMovieId()==103)&&(this.getNoOfTickets()>=5&&this.getNoOfTickets()<10)) 
	this.discount = 15;
		else if((this.getMovieId()==101||this.getMovieId()==103)&&(this.getNoOfTickets()>=10&&this.getNoOfTickets()<=15)) 
			this.discount = 20;
		else if((this.getMovieId()==102)&&(this.getNoOfTickets()>=5&&this.getNoOfTickets()<10)) 
			this.discount = 10;
		else
			this.discount =15;
	}
public double calculateTicketAmount() {
		 calculateDiscount();
				if(this.movieId == 101)
			this.totalAmount  =  120 * this.noOfTickets - (120*this.noOfTickets*(this.discount/100));
				else if(this.movieId ==102)
					this.totalAmount  =  170 * this.noOfTickets - (170*this.noOfTickets*(this.discount/100));
				
				else 
					this.totalAmount  =  150 * this.noOfTickets - (150*this.noOfTickets*(this.discount/100));
			return this.totalAmount;
}

}
