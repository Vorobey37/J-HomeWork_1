
import java.util.Scanner;

/**
 * HomeWork_1
 */
public class HomeWork_1 {


/**

 */
public static void main(String[] args)
{
    Scanner input = new Scanner(System.in);
    System.out.println("Введите число: ");
    int n = input.nextInt();
    System.out.println(sumNumbers(n));
    System.out.println(factNumbers(n));
    simpleNumbers();
    System.out.println();
    Calculator();
    input.close();

}
/*
 Вычислить n-ое треугольного число (сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
 
 */
    public static int sumNumbers (int n)
    {
        int sum = 0;
        for (int i=1; i<=n; i++)
        {
            sum = sum + i;
        }
        return sum;
    }
    public static int factNumbers (int n)
    {
        int fact = 1;
        for (int i=1; i<=n; i++)
        {
            fact = fact*i;
        }
        return fact;
    }

    /*
     Вывести все простые числа от 1 до 1000
     */

     public static  void simpleNumbers()
     {
        
        int count = 0;
        for(int i=1; i<=1000; i++)
        {
            for(int j=1; j<=i; j++)
            {
                if (i%j == 0)
                {
                    count++;
                }
            }
            if (count<=2)
            {
                System.out.print(i + " ");
            }
            count = 0;
        }
     }
        /*
         Реализовать простой калькулятор (пользователь вводит 2 числа и
вводит операцию (+ - / *). int a ; int b; String op (op!=”Stop”); (char != ’b’)
         */
        
         
     public static void Calculator()
     {
        char operation = ' ';
        Scanner input = new Scanner(System.in);
        while(operation != 'b')
        {
            System.out.println("Введите два числа: ");
            double a = input.nextInt();
            double b = input.nextInt();
            System.out.println("Введите действие (+, -, *, /): ");
            operation = input.next().charAt(0);
        
            if (operation == 'b')
            {
                System.out.println("Конец программы!");
                break;
            }
            if (operation == '+')
            {
                System.out.println(a+b);
            }
            if (operation == '-')
            {
                System.out.println(a-b);
            }
            if (operation == '*')
            {
                System.out.println(a*b);
            }
            if (operation == '/')
            {
                if (b==0)
                {
                    System.out.println("На ноль делить нельзя!");
                }    
                else
                {
                    System.out.println(a/b);
                }
            }
           

        }

        input.close();
        
     }


}