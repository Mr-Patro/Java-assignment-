class sum_product2
{

    public static void main(String args[])
    {
        int num1=1234, num2=7896;
        int a,b,c,d;
        a=num1%10;
        num1=num1/10;
        b=num1%10;
        num1=num1/10;
        c=num1%10;
        num1=num1/10;
        d=num1%10;
        num1=num1/110;
        
        System.out.println("The consecutive digit of 1st number are=="+d+c+b+a);
        //for second number
        int x,y,z,w;
        x=num2%10;
        num2=num2/10;
        y=num2%10;
        num2=num2/10;
        z=num2%10;
        num2=num2/10;
        w=num2%10;
        num2=num2/10;
        System.out.println("The consecutive digit of 1st number are=="+w+z+y+x);
        int pro;
        pro=a*x+b*y+c*z+d*w;
        System.out.println("The sum of product of consecutive digit is="+pro);
    }
}