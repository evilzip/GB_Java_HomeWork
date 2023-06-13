import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //task1();
        task2();
        //task3();



    }

    private static void task1()
    //1. Вычислить сумма чисел от 1 до n
    {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter last number: ");
        Integer lastNum = iScanner.nextInt();
        Integer sum = 0;
        for(int i=1;i<lastNum+1;i++)
        {
            sum+=i;
        }
        System.out.printf("Sum of all numbers from 1 to %d = %d",lastNum, sum);
    }
    private static void task2()
    //2. Вывести все простые числа от 1 до 1000

    {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter last number: ");
        Integer lastNum = iScanner.nextInt();
        Boolean flag;
        for (int i = 1; i < lastNum+1; i++){
            flag = true;
            for (int j = 2; j < i; j++) {
                if (i%j==0){
                    flag = false;
                    break;
                }

            }
            if (flag){
                System.out.println(i);
            }

        }
    }

    private static void task3(){
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        Float firstNum = iScanner.nextFloat();
        System.out.println("Enter mathematical action (+, -, * or /) : ");
        String mathAction = iScanner.next();
        System.out.println("Enter second number: ");
        Float secondNum = iScanner.nextFloat();

        switch (mathAction) {
            case "+":
                System.out.printf("%.2f + %.2f = %f",firstNum,secondNum, firstNum+secondNum);
                break;
            case "-":
                System.out.printf("%.2f - %.2f = %.2f", firstNum, secondNum, firstNum-secondNum);
                break;
            case "*":
                System.out.printf("%.2f * %.2f = %.2f", firstNum, secondNum, firstNum*secondNum);
                break;
            case "/":
                if (secondNum==0){
                    System.out.println("Error! Division by zero!");
                }
                else {
                    System.out.printf("%.2f / %.2f = %.2f", firstNum, secondNum, firstNum/secondNum);
                    break;
                }

            default:
                System.out.println("You enter incorrect mathematical action!");
                break;

        }


    }


}