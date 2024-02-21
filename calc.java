import java.util.*;
class calc
{
    public static void main(String[] args)
     {
        int option;
        double num1,num2,result;
        Scanner sc = new Scanner(System.in);
        {
            System.out.println( "enter two number");
            num1= sc.nextDouble();
            num2= sc.nextDouble();
            System.out.println("option are given below");
            System.out.println("           ");
            System.out.println("1. addition");
            System.out.println("2. substraction");
            System.out.println ("3.multiplication");
            System.out.println("4. division");
            System.out.println("5.choose option");
            option=sc.nextInt();
        }
        switch(option){
                case 1:
                    result=num1+num2;
                    System.out.println("addation="+result);
                    break;
                case 2:
                    result=num1-num2;
                    System.out.println("subtraction="+result);
                    break;
                case 3:
                    result=num1*num2;
                    System.out.println("multiplication="+result);
                    break;
                case 4:
                    result=num1/num2;
                    System.out.println("division="+result);
                    break;
                    default:
                            System.out.println("error");

            }
    }

}