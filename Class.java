class Calculator
{
   public int add(int a, int b){
   return (a+b);
}
}


public class Class {
    public static void main(String args[])
    {

        int a=1,b=2;
        int result;
        Calculator cal=new Calculator();

        result=cal.add(a,b);
        System.out.println(result);

    }


    
}
