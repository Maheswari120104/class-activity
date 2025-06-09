import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
//import java.util.Stack;
class ticket{
	private static int counter=1;
	private int id;
	private String name;
	private String issue;
	
	public ticket(String name,String issue) {
		this.id=counter++;
		this.name=name;
		this.issue=issue;
	}
	public String toString() {
		return "Ticket"+ id + "| Name" + name + "| issue" + issue;
	}
}

public class helpdesk {
	
	public static void main(String[] args) {
		 //Stack<String> name=new Stack<>();
		
		Scanner sc=new Scanner(System.in);
		Queue<ticket> help=new LinkedList<>();
		
		while(true) {
		int input=sc.nextInt();
		
		
		sc.nextLine();
		
		switch(input) {
		case 1:
			System.out.println("enter the name");
			String name=sc.nextLine();
			System.out.print("enter issue");
			String issue =sc.nextLine();
			
			
			help.add(new ticket(name,issue));
			//j++;
			System.out.println("the ticket is added to queue");
				
			break;
			
		case 2:
			if(help.isEmpty()) {
			System.out.println("no tickets are due to be processed");
		}
			else {
				System.out.println("ticket is being processed");
			}
			break;
		
			
		default:
			System.out.println("invalid option");
	}
		}
	}
	}
	


