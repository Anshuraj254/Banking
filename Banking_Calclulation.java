import java.util.Scanner;
class Banking_Calclulation
{
    public static void bank()
    {
        double p,r,maturityAmount;
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println(" **menu** ");
        System.out.println("1. Term Deposit");
        System.out.println("2. Recurring Deposit");
        System.out.println("Enter your choice:");
        int choice=scanner.nextInt();
        
        switch(choice)
        {
            case 1:
                System.out.println("Enter principal amount:");
                p=scanner.nextDouble();
                System.out.println("Enter rate of interest");
                r=scanner.nextDouble();
                System.out.println("Enter period in years:");
                n=scanner.nextInt();
                
                maturityAmount=p*Math.pow(1+r/100.0,n);
                
                System.out.println("Maturity amount receivable is:"+maturityAmount);
                break;
                
                
                case 2:
                System.out.println("Enter monthly installment:");
                p=scanner.nextDouble();
                System.out.println("Enter rate of interest");
                r=scanner.nextDouble();
                System.out.println("Enter period in months:");
                n=scanner.nextInt();
                
                maturityAmount=p*n+p*(n*(n+1)/2.0)*(r/100.0)*(1.0/12);
                
                System.out.println("Maturity amount receivable is:"+maturityAmount);
                break;
               default:
                   System.out.println("Invalid choice entered.");
        }
        scanner.close();
        }
           }
    
