class Find_value
{
    public static void main(String args[])
    {
        int num=1234,rem;
        rem=num%10;
        num=num/10;
        rem=num%10;
        num=num/10;
        System.out.println("The 10 th position value is"+rem);
        rem=num%10;
        num=num/10;
        System.out.println("The 100 th position value is"+rem);
        rem=num%10;
        num=num/10;
        System.out.println("The 1000 th position value is"+rem);


    }
}