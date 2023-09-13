import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to BNSB");
		System.out.println("Please insert your card");
		
		int choice;
		System.out.println("Enter your choice:");
		choice=sc.nextInt();
		switch(choice){
		    case  1:
		        System.out.println("Balance enqiry");
		        break;
		        
        	case  2:
		        System.out.println("Cash withdrawl");
		        break;
		        
		    case  3:
		        System.out.println("Pin change");
		        break;    
		  
		    default:
		        System.out.println("Wrong choice");
		        break;    
		}
		
		
		int pin,amount,receipt;
		
		    if(choice==1){
		    {
		        System.out.println("Please enter your pin:");
		     pin=sc.nextInt();
		     
		     System.out.println("Your balance is XXXX");
		    } 
		     System.out.println("Do you want a receipt?(1/2)");
		     receipt=sc.nextInt();
		    
		     switch(receipt)
		     {
		         
		         case 1:
		             System.out.println("Please collect your receipt");
		             System.out.println("THANK YOU!");
		             break;
		             
		         case 2:
		             System.out.println("THANK YOU!");
		             break;
		             
		         default:
		             System.out.println("Sorry for inconvenience");
		         
		     }
		    }
		   

		    else if(choice==2)
		    {
		        System.out.println("Please enter your pin:");
		        pin=sc.nextInt();
		    
		        System.out.println("Please enter the amount you want to withdraw: "+"\nEnter amount in multiples of 1000 "+"\nMaximum limit is 10000" );
		        amount=sc.nextInt();
		        
		        System.out.println("Please collect your cash");
		        
		        System.out.println("Do you want a receipt?(1/2)");
		        receipt=sc.nextInt();
		    
		     switch(receipt)
		     {
		         
		         case 1:
		             System.out.println("Please collect your receipt");
		             System.out.println("THANK YOU!");
		             break;
		             
		         case 2:
		             System.out.println("THANK YOU!");
		             break;
		             
		         default:
		             System.out.println("Sorry for inconvenience");
		         
		     }
		    }       
		        
		       
		    
		    
		    else if(choice==3)
		    {
		        System.out.println("Please enter your old pin");
		        pin=sc.nextInt();
		        
		        System.out.println("\nPlease enter your new pin");
		        pin=sc.nextInt();
		        
		        System.out.println("Your pin is changed successfully");
		        
		        System.out.println("Do you want a receipt?(1/2)");
		     receipt=sc.nextInt();
		    
		     switch(receipt)
		     {
		         
		         case 1:
		             System.out.println("Please collect your receipt");
		             System.out.println("THANK YOU!");
		             break;
		             
		         case 2:
		             System.out.println("THANK YOU!");
		             break;
		             
		         default:
		             System.out.println("Sorry for inconvenience");
		         
		     }
		    }    
		        
		    
		    else
		  {
		       System.out.println("please try again");
		  }
	}
}

