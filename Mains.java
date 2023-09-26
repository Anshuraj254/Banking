import java.util.*;
class Mains
{
    public static void main(String args[]) throws InterruptedException
    {
        Banking_Animation anim=new Banking_Animation();
        anim.Animation();
        Loading loads= new Loading();
        Scanner s=new Scanner(System.in);
        System.out.println("                             ");
        System.out.println("1.Banking");
        System.out.println("2.Banking_Calculator");
        System.out.println("3.Exit");
        int choice = s.nextInt();
        switch (choice) 
        {
            case 1:
                loads.loading();
                BankingSystem hello=new BankingSystem();
                hello.banking();
                break;
            case 2:
                loads.loading();
                Banking_Calclulation disk=new Banking_Calclulation();
                disk.bank();
                break;
                
            case 3:
                loads.loading();
               System.out .println("Exiting..........");
                
        }
    }
}