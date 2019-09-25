package register;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import main.Main;
import main.MainBusness;
import java.io.IOException;
public class Register
{  
  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  MainBusness mb=new MainBusness();
  
  public static int id = 0;
  static int i=0;
  public static int arr[] = new int[100];
  public void registerr(String name, String address, String contact_number,String email,String proofType, String proofID) throws IOException{
  {	
   mb.setName(name);
   mb.setAddress(address);
   mb.setContact_number(contact_number);
   mb.setEmail(email);
   mb.setProofType(proofType);
   mb.setProofID(proofID); 
	
   this.display();
   }
}
    private void display() 
	{	 
    System.out.println("Your details\n______________________");	
	System.out.println(mb.getName());
	System.out.println(mb.getAddress());
	System.out.println(mb.getContact_number());
	System.out.println(mb.getEmail());
	System.out.println(mb.getProofType());
	System.out.println(mb.getProofID());
	System.out.println("Thank you for Registering your ID is "+ ++id+"\n");
	arr[i++] = id;
	}
}