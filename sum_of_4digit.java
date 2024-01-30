class sum_of_4digit
{
    public static void main(String args[])
    {
        int num=1234,rem;
        int sum=0;
        rem=num%10;
        sum=rem+sum;
        num=num/10;
        rem=num%10;
        sum=rem+sum;
        num=num/10;
        rem=num%10;
        sum=rem+sum;
        num=num/10;
        rem=num%10;
        sum=rem+sum;
        num=num/10;
        System.out.println("summation of 4 digit number is ="+sum);
        

    }
}