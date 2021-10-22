import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

import Exception_Handling.Custom_Excp;

class Seat_Reservation{
	String seats[] = {"Available","Available","Available","Available","Available","Available","Available","Available","Available","Available"};
	//boolean whilecond = true;
	int num = 1;
	Scanner sc = new Scanner(System.in);
	Custom_Excp cust_excp = new Custom_Excp(null);
	void setReservation() {
		while(num >=1 && num <=2) {
	   System.out.println("Where You want to Seat the Book");
	   System.out.println("1 for First Class");
	   System.out.println("2 for Economy Class");
	   System.out.println("3 for Exit from Booking");
	   int seat_booking = sc.nextInt();
	   switch(seat_booking) {
	   case 1:
		   System.out.println("Which Seat you want to Book");
		   System.out.print("Available seats are :");
		   for(int i=0;i<5;i++) {
			   if(seats[i]=="Available") 
				   System.out.print((i+1)+","+" ");
		   }
		   System.out.println();
		   System.out.println("Enter Seat Number you want to book :");
		   
		   int first_con_seat = sc.nextInt();
		   
		   try {
		   if(seats[first_con_seat-1]=="Available") {
		   seats[first_con_seat-1] = "Booked";
		   System.out.println("Your Seat is Conformed Your Seat No is --> "+ (first_con_seat));
		   }else {
			   throw new Custom_Excp("Seat Already Researved.....!");
		   }
		   }catch (Custom_Excp e) {
			System.out.println(e.getMessage());
		}
		   break;
		   
	   case 2:
		   System.out.println("Which Seat you want to Book");
		   System.out.print("Available Seats are :");
		   for(int i=4;i<10;i++) {
		             if(seats[i] == "Available")
			   System.out.print((i+1)+","+" ");
		   }
		   System.out.println();
		   System.out.println("Enter Seat Number you want to book :");
		   
		   int eco_con_seat = sc.nextInt();
		   
		try {   
		   if(seats[eco_con_seat-1]=="Available") {
		   seats[eco_con_seat-1] = "Booked";
		   System.out.println("Your Seat is Conformed Your Seat No is --> "+ eco_con_seat);		   
		   }else {
			   throw new Custom_Excp("Seat is Already Reserved.....!");
		   }
	   }catch (Custom_Excp e){
		   System.out.println(e.getMessage());
		   }
		   break;
		   
		   
	   case 3:
		   //whilecond = false;
		   num = 0;
		   break;
		   
		   
	   }
	  
		}
		 num =1;
	
	}
	void getReservation_Details() {
		String Available="Available";
		System.out.println("*********************************************");
		System.out.println("*          Welcome to Ariline               *");
		System.out.println("*********************************************");
		System.out.println("|---------------- First   Class -------------|");
		System.out.println("| "+seats[0]+"                        "      + seats[1]+" |");
		System.out.println("|                                            |");
		System.out.println("| "+seats[2]+"         "+seats[3]+"      " +seats[4]+" |");
		System.out.println("|                                            |");
		System.out.println("|---------------- Economy Class -------------|");
		System.out.println("| "+seats[5]+"                        "      +seats[6]+" |");
		System.out.println("|                                            |");
		System.out.println("| "+seats[7]+"         "+seats[8]+"      " +seats[9]+" |");
		System.out.println("|____________________________________________|");
		
	}
	
}

public class Airline_Reservation_System {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean whilecond1 = true;
		Seat_Reservation SR = new Seat_Reservation();
		
		while(whilecond1) {
			
			System.out.println("Online Airline Reservation System");
			System.out.println("1 for Seat Details");
			System.out.println("2 for Reservation");
			System.out.println("3 for Exit");
			int choice = sc.nextInt();
		switch(choice) {
		case 1:
			SR.getReservation_Details();
			break;
			
		case 2:
			SR.setReservation();
			break;
			
		case 3:
			whilecond1 = false;
			   System.out.println("---------------------------------------------------------------");
			   System.out.println("Successfully Loged out.....");
			   System.out.println("Close the Program");
			   System.out.println("_______________________________________________________________");
			   
			break;
		}
		}
		
		
		

	}

}
