import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            try {


                int number = scanner.nextInt();
                int number1 = scanner.nextInt();
                int number2 = scanner.nextInt();
                Parallelepiped parallelepiped = new Parallelepiped(number, number1, number2);
                if (number > 0 && number1 > 0 && number2 > 0 && number < 20 && number1 < 20 && number2 < 20) {
                    System.out.println("Фигуранын аянты :");
                    parallelepiped.method1(number, number1, number2);
                    System.out.println("Фигуранын колому :");
                    parallelepiped.method2(number,number1,number2);
                } else {
                    throw new Error("Берилген маани терс сан же берилген маани 20 дан чон !");
                }

            }catch (InputMismatchException e){
                System.out.println("Берилген маалымат сан эмес тамга !");
            }
    }
}