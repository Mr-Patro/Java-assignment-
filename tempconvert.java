class tempconvert
{
    public static void main(String args[])
    {
        //c=f-32*5/9
        float c=40;
        float f=(9/5*c)+32;
        System.out.println(c+" Degrees celsious is ="+f +" Fahrenheit");
        c=(f-32)*5/9;
        System.out.println(f+"Degrees Fahrenheit is ="+c+ "celsious");


    }
}