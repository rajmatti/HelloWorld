 class Arithmetic
{
 public static void main(String [] args)
  {
     int a=9,b=5,sum,sub,mul,mod; // variable declaration
     float div;

     sum=a+b;
     sub=a-b;
     mul=a*b;
     div=(float)a/b; //type casting- conversion of data type 
     mod=a%b;  // modulus operator- Remainder of Division

  System.out.println("The Addition of "+ a +" and "+ b +" is :"+ sum);
    System.out.println("The Subtraction of 2 Nos is :"+ sub);
    System.out.println("The Multipication of 2 Nos is :"+ mul);
    System.out.println("The Division of 2 Nos is :"+ div);
    System.out.println("The Modulus of 2 Nos is :"+ mod);
    System.out.println(mod);
  }
}