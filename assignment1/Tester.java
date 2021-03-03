package com.infy.assignment1;

public class Tester {

	public static void main(String[] args) {
		BookMyMovie book  = new BookMyMovie(101,5);
		BookMyMovie book1  = new BookMyMovie(102,4);
		BookMyMovie book2 = new BookMyMovie(103,8);
		if(book.getMovieId()!=101&&book.getMovieId()!=102&&book.getMovieId()!=103)
		{
			System.out.println("Sorry! Invalid Movie ID!\r\n"
					+ "Please check the Movie ID and enter once again.\r\n"
					+ "");
		}
		else
			System.out.println("Total amount for Booking: "+book.calculateTicketAmount());
		if(book1.getMovieId()!=101&&book1.getMovieId()!=102&&book1.getMovieId()!=103)
		{
			System.out.println("Sorry! Invalid Movie ID!\r\n"
					+ "Please check the Movie ID and enter once again.\r\n"
					+ "");
		}
		else
			System.out.println("Total amount for Booking: "+book1.calculateTicketAmount());

		if(book2.getMovieId()!=101&&book2.getMovieId()!=102&&book2.getMovieId()!=103)
		{
			System.out.println("Sorry! Invalid Movie ID!\r\n"
					+ "Please check the Movie ID and enter once again.\r\n"
					+ "");
		}
		else
			System.out.println("Total amount for Booking: "+book2.calculateTicketAmount());


			
	}

}
