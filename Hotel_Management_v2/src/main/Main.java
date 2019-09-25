package main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import book.Book;
import check_status.Status;
import register.Register;
public class Main {
	
	String switching;
	static boolean i;
	static int date = 0;
	static String name;
	public static void main(String[] args) throws IOException {
	

	Book mnobbk = new Book();	
	Register regobj = new Register();
	Main mnobjma = new Main();
	Status mnobst = new Status();
	MainBusness mbus = new MainBusness();
	int datearray[] =new int[100];
	
	int index = 0;
	String switching;
	String address,contact_number,email,proofType,proofID,ac,cot,cable,wifi,laundry,newemail;
	int customerID,roomID,startDate,endDate;
		
	System.out.println("\n  MENU\n_____________\n1.Register\n2.Book\n3.Check Status\n4.Email\n5.all Booking\n6.All customers\n7.exit\n");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int choice;
	choice = Integer.parseInt(br.readLine());
	
	
	switch(choice)
	{
	case 1:
	do{
	System.out.println("\nREGISTRATION");
	System.out.println("Enter date");
	
	index = Integer.parseInt(br.readLine());
	
	datearray[date++] = index;
	
	System.out.println("Enter your Name");
	name =br.readLine();
			
	System.out.println("Enter your Address");
	address = br.readLine();
			
	System.out.println("Enter your Contact Number");
	contact_number = br.readLine();
			
	System.out.println("Enter your Email");
	email = br.readLine();
			
	System.out.println("Enter your proofType");
	proofType = br.readLine();
			
	System.out.println("Enter your ProofID");
	proofID = br.readLine();
	
	System.out.println("do you wat to continue ?(y/n)");
	
	switching = br.readLine();
	if(switching.equalsIgnoreCase("n"))
	{
	i=true;
	}
	else 
	i = false;
	}while(i);
		
    regobj.registerr(name, address, contact_number, email, proofType, proofID);

	case 2:
	ac = "ac";
	cot = "double";
	cable = "cable";
	wifi = "wifi";
	laundry = "laundry";
		
	System.out.println("\nBOOKING");
	
	mnobbk.Book(ac, cot, cable,wifi, laundry);
	mnobjma.main(null);
	
	break;
	case 3:
	System.out.println("Enter Room No: ");
	int RoomNo = Integer.parseInt(br.readLine());
	mnobst.CheckStatus(RoomNo);
	mnobjma.main(null);
	break;
	
	case 4:
	int idcheck;
	System.out.println("Enter your RoomID");
	idcheck = Integer.parseInt(br.readLine());
	
	if(regobj.id == idcheck)
	{
		System.out.println("Enter New Email");
		newemail = br.readLine();
		System.out.println("Email updated");
	}
	mnobjma.main(null);
	break;
	case 5:
	int StartDate;
	int EndDate;
	System.out.println("Enter the starting date");
	StartDate = Integer.parseInt(br.readLine());
	System.out.println("Enter Ending Date");
	EndDate = Integer.parseInt(br.readLine());
	System.out.println("Booking from "+StartDate+" "+"and"+" "+EndDate+" are");
   
	if(StartDate<=EndDate)
	{
	System.out.println("Customer ID ");
	for (int x=0;x<Register.id;x++)
    {
    System.out.println( Register.arr[x]);
   
    }
	System.out.println("Room Number.");
	for (int x=0;x<Register.id;x++)
    {
    System.out.println(Book.roomno[x]);
    }
  
	}
	mnobjma.main(null);
	break;
	case 6:
	System.out.println("Customer Id");
	for (int x=0;x<Register.id;x++)
	{
	System.out.println( Register.arr[x]+" ");
	
    }
	System.out.println("Customer name \n"+name);
	mnobjma.main(null);
	break;
	
	case 7:
	System.out.println("Bye\n\n");
	mnobjma.main(null);
	break;
	default:
	System.out.println("Enter valid number");
	break;
	
   }
}	
}

