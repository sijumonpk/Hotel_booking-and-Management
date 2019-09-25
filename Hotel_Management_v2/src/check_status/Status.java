package check_status;
import book.Book;
public class Status extends Book
{
	Book bkobst = new Book();
	int f=0;
	public void CheckStatus(int roomID)
	{
	for(int k=0;k<=count;k++)
	{
	if(Book.roomno[k]==roomID)
	{
	System.out.println("Booked");
	f=1;
	break;
	}
	}
	if(f==0) System.out.println("Available");
}
}
