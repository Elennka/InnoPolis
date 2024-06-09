package Homework4;

public class FizzBuzz {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {
            if ((i % 3) == 0 && ((i % 5) == 0)) //если делится на 3 и на 5
            {
                System.out.println("FizzBuzz");
            }
            else if ((i % 3) == 0) {  //иначе если делится на 3
                System.out.println("Fizz");
            }
            else if ((i % 5) == 0) {  //иначе если делится на 5
                System.out.println("Buzz");
            }
            else System.out.println(i); // иначе просто распечатываем число
        }

    }
}

