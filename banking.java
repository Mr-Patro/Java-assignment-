import java.util.*;
class banking
{
    public static void main(String args[])
    {
        ;
        Scanner sc=new Scanner(System.in);
        String Name=System.out.println("Enter your Name:")sc.nextLine();
        System.out.println(Name);
        System.out.println("Enter your Account No:");
        int AccNo=sc.nextInt();
        System.out.println(AccNo);

        System.out.println("What do you wand to do ?Deposite or Withdrawl");
        System.out.println("Enter 'D' for deposite Enter 'W' for withdrawl.");
        char Choice='w';
        int Total_blance=0;
        if (Choice=='D' || Choice=='d')
          {
            System.out.println("Enter the amount you wants to deposite:3000");
            System.out.println("Minimum amound of deposite is 3000 if you deposite less than 3000 then you will be penalised 15% of your deposite money.");
            //if the deposite money id grater than 3000
           
            int deposite=3000;
            Total_blance+=deposite;
            System.out.println("Your current Blance is="+Total_blance);
            //else do the program

          }
        else if (Choice=='W' || Choice=='w')
        {
            System.out.println("Enter the amount you wants to withdrawl:2000");
            int w_amount=2000;
            if(w_amount>=Total_blance)
            {
                System.out.println("Insufficient Balance");
            }
            else
            {
                Total_blance=Total_blance-w_amount;
                System.out.println("The current blance is ="+Total_blance);
            }

        }

    }
}