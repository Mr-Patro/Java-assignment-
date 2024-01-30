/*Sum of product of consecutive even digits of any 4 digit number? Supoose
num=1624 then output= 4*2+2*6 */
public class EvenSum {
    public static void main(String args[])
    {
        int n= 3426;
        //int n = Integer.parseInt(args[0]);
        int a,b,c,d;
        int evenP = 1;
        int oddP = 1;
        a = n%10;
        int k = (a%2==0)?a:1;
        evenP = evenP*a;
        k = (a%2 != 0)?a:1;
        oddP = oddP*a;
        n = n/10;

        b = n%10;
        int l = (b%2==0)?b:1;
        evenP = evenP*l;
        l = (l%2 != 0)?l:1;
        oddP = oddP*l;
        n = n/10;

        c = n%10;
        int m = (c%2==0)?c:1;
        evenP = evenP*m;
        m = (c%2 != 0)?c:1;
        oddP = oddP*m;
        n = n/10;

        d = n%10;
        int p = (d%2==0)?d:1;
        evenP = evenP*p;
        p = (d%2 != 0)?d:1;
        oddP = oddP*p;

        int sumOfEvenProduct1 = (a%2==0 && b%2==0)?a*b:0;
        int sumOfEvenProduct2 = (b%2==0 && c%2==0)?b*c:0;
        int sumOfEvenProduct3 = (c%2==0 && d%2==0)?c*d:0;

        
        int totalSum = sumOfEvenProduct1+sumOfEvenProduct2+sumOfEvenProduct3;
        System.out.println();

        System.out.println("Sum of product of consecutive even digits of any 4 digit number :"+totalSum);

        
    }
}
