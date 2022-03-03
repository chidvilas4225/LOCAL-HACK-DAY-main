
// Bank account System model,Made By Shubham Patel 6-8-2020
import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
class Bank  // Start of the program
{
 
  public static void main(String args[])
  {
  
  Bank_Account BA = new Bank_Account();
  BA.Transactions();
  }
}

class Bank_Account    //Second Class where all calculations Happens
{
 
      int Account_no,temp_balance,balance;
      String Account_type,name;
      int ch=1;
      Scanner sc = new Scanner(System.in);
          
          Bank_Account()  
            {
           
          System.out.println("Enter name");
          name = sc.nextLine();
          
          
          System.out.println("Enter Account Type");
          Account_type = sc.nextLine();
          
          System.out.println("Account Number");
          Account_no = sc.nextInt();
              
          System.out.println("Balance");
          balance = sc.nextInt();

            }

          void Transactions()  // Main Function to be Excuted
          {
            while(ch==1)
            {
            System.out.println("Press 1 for Depositing Money and checking Balamce");
            System.out.println("Press 2 for Withdraw Money");
            System.out.println("Press 3 for Account Information");        
            int choice = sc.nextInt(); // For Choices
                switch(choice)        
                {
                  case 1:
                          System.out.println("Enter Ammount to deposit:");
                          temp_balance = sc.nextInt();
                          balance = balance+temp_balance;
                          System.out.println("Total Balance after deposit = "+ balance);
                  
                          break;
                  case 2:
                          if(balance >=1000)
                          {
                            System.out.println("Enter amount to be widthraw = ");
                            temp_balance = sc.nextInt();
                            if(temp_balance >balance)
                            {
                              System.out.println("You are entering widthrawl ammount greater than your current balance");
                              break;
                            }
                            balance = balance - temp_balance;
                            System.out.println("The Current Balance is = " +balance);
                          
                            
                          }
                          
                          else
                          {
                            System.out.println("Minimum balance is 1000 Rs to widthraw the cash,Your Balance = "+balance);
                          }
                          break;
                  case 3:
                        System.out.println("Name = "+name+"\t Current Balance = "+balance);
                        break;
                  
                  default :
                          System.out.println("Invalid Input");
                          break;
                  
                }
                System.out.println("Press 1 to continue the Transaction"); // Asking if you want to continue
              
              ch = sc.nextInt();
              if(ch !=1)
              {
                
                System.out.println("Transaction Interupted,END");
                System.out.println("Don't forget to collect the receipt");
                break;
                
              }
            }
            }
         
}//End of the program
