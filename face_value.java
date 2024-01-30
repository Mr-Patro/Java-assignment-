class face_value
{
    public static void main(String args[])
    {
        int num=1234;
        int a,b,c,d,rem;
        rem=num%10;
        d=rem*1;
        num=num/10;
        System.out.println("The face value of 4 is="+rem);
        System.out.println("The position value of 4 is ="+d);
        System.out.println("\n");
        rem=num%10;
        c=rem*10;
        num=num/10;
        System.out.println("The face value of 3 is="+rem);
        System.out.println("The position value of 3 is ="+c);
        System.out.println("\n");
        rem=num%10;
        b=rem*100;
        num=num/10;
        System.out.println("The face value of 2 is="+rem);
        System.out.println("The position value of 2 is ="+b);
        System.out.println("\n");
        rem=num%10;
        a=rem*1000;
        System.out.println("The face value of 1 is="+rem);
        System.out.println("The position value of 1 is ="+a);
    }
}