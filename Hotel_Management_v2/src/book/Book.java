package book;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import main.MainBusness;

public class Book 
{
	static String switching2;
	static boolean i;
	public static int count = 0;
    int amount = 0;
	String s1;
	String s2;
	public static int roomno[] = new int[25];
	static int j=0;
	static int r=0;
	MainBusness busobbook = new MainBusness();
	public void Book(String ac, String cot, String cable, String wifi, String laundry) throws IOException
	{
	
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	String switching3;
	boolean i2;
	busobbook.setAc(ac);
	busobbook.setCot(cot);
	busobbook.setCable(cable);
	busobbook.setWifi(wifi);
	busobbook.setLaundry(laundry);
	do {	
	System.out.println("Please choose the services required.\n");
	System.out.println("AC/non-AC(AC/nAC)");
	s1 = br.readLine();
	
	if(s1.equalsIgnoreCase("ac"))
	{
     amount = amount+1000;
     ac = "ac";
	}
	if(s1.equalsIgnoreCase("nac"))
	{
	 amount = amount+750; 
	}
	System.out.println("Cot(Single/Double)");
	 
    s1 = br.readLine();
	if(s1.equalsIgnoreCase("double"))
	{
	cot = "double";
	amount = amount +350; 
	}
	if(s1.equalsIgnoreCase("single"))
	{
	amount = amount + 0;
	}
	System.out.println("With cable connection/without cable connection(C/nC)");
	 
	s1 = br.readLine();
	if(s1.equalsIgnoreCase("c"))
	{
	cable = "cable";
     amount = amount+50;
	}
	if(s1.equalsIgnoreCase("nc"))
	{
	amount = amount+0;
    }
	System.out.println("Wi-Fi needed or not(W/nW)");
	wifi = "w";
	s1 = br.readLine();
	if(s1.equalsIgnoreCase("w"))
	{
     wifi = "wifi";
	 amount = amount+200;
	 }
	 if(s1.equalsIgnoreCase("nw"))
	 {
	  amount = amount+0;
	 }
	 
	 System.out.println("Laundry service needed or not(L/nL)");
	 s1 = br.readLine();
	 if(s1.equalsIgnoreCase("l"))
	 {
	  laundry = "Laundry";
		 
	  amount = amount+100; 
	 }
	 if(s1.equalsIgnoreCase("nl"))
	 {
	  amount = amount+0;
	 }
	 
	 System.out.println("Do you want to contineue?(yes/no)");
	 
	 switching2 = br.readLine();
	 if(switching2.equalsIgnoreCase("no"))
	 {
	 i=true;
		 count++;
	 }
	 else 
	 
	 i = false;
	 count++;
	 }while(i);
	 
	
	 System.out.println("____________________________________");
	 System.out.println("The total charge is Rs."+amount+".\n");
	 System.out.println("The services chosen are\n");
	 System.out.println(cot +"cot" + ac + "Room");
	 System.out.println(cable+"connection Enabled");
	 System.out.println(wifi+"Enabled");
	 System.out.println("with"+laundry+"Servises");
	 
	 System.out.println("Do you want to proceed?(yes/no)");
	 
	 switching3 = br.readLine();
	 if(switching3.equalsIgnoreCase("yes"))
	 {
	 System.out.print("Thank you for booking. Your room number is \n");
     roomno[j]=count;
	 System.out.println(roomno[j++]+" ");
	 }
}
}

