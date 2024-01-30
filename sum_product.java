class sum_product
{

    public static void main(String args[])
    {
        int num=1234;
        int a,b,c,d;
        a=num%10;
        num=num/10;
        b=num%10;
        num=num/10;
        c=num%10;
        num=num/10;
        d=num%10;
        num=num/10;
        int pro;
        pro=a*b+b*c+c*d;
        System.out.println("The sum of product of consecutive digit is="+pro);
    }
}