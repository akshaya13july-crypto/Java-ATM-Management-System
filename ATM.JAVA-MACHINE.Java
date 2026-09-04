import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class ATM{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    
    var acNo=123456789;
    var Pass=123456;
    var amount=10000;

    System.out.println("1.English");
    System.out.println("2.Tamil");
    System.out.println("3.Hindi");
    System.out.println("Enter the choice");
    var choice=sc.nextInt();
    
    switch(choice){
      case 1:{
        System.out.println("1.Saving");
        System.out.println("2.Current");
        System.out.println("Enter the Choice:");
        choice=sc.nextInt();

        switch(choice){
          case 1:{
            System.out.println("Saving");
            System.out.println("Enter thr Account no:");
            var an=sc.nextInt();
            System.out.println("Enter the Password:");
            var P=sc.nextInt();

            if(an == acNo && P == Pass){
              while(true){
                System.out.println("1.Check Balance");
                System.out.println("2.Deposit");
                System.out.println("3.Withdraw");
                System.out.println("4.Receipt");
                System.out.println("Enter the choice");
                choice=sc.nextInt();
                
                switch(choice){
                  case 1:{
                    System.out.println("Your current balance is"+amount);
                    break;
                  }
                  case 2:{
                    System.out.println("Enter the Amount");
                    var am=sc.nextInt();
                    if(am>0){
                      amount=amount+am;
                      System.out.println("Added Successfully");
                    }else{
                      System.out.println("Enter valid amount");
                    }
                    break;
                  }
                  case 3:{
                    System.out.println("Enter the amount");
                    var am=sc.nextInt();
                    if(am>amount){
                      System.out.println("Insufficient Amount");
                    }
                    else if(am>0){
                      System.out.println("Enter valid amount");
                    }
                    else{
                      amount-=am;
                      System.out.println("Withdraw Successfully");
                    }
                    break;
                  }
                  case 4:{
                    System.out.println("\u001b[91m \u2764 ************\uFE0F \u001b[0m");
                    System.out.println("\u001b[92m" + LocalDate.now() + "\u001b[0m");
                    System.out.println(LocalTime.now());
                    System.out.println("Account No:-" + acNo);
                    System.out.println("current balance:-" + amount);
                    System.out.println("\u001b[91m  \u2764************\uFE0F \u001b[0m");
                    break;
                  }
                  default:{
                    System.out.println("Invalid choice");
                  }
                }
              }

            }else{
              System.out.println("Wrong password");
            }
            break;
          }
          case 2:{
            System.out.println("Current");
            break;
          }
          default:{
            System.out.println("Invalid choice");
          }
        }
        break;
      }
      case 2:{
        System.out.println("Tamil");
        break;
      }
      case 3:{
        System.out.println("Hindi");
        break;
      }
      default:{
        System.out.println("Invalid choice....");
      }
    }
    sc.close();
    }
  }


  