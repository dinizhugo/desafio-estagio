package br.edu.ifpb.eda.questoes.questao02;

public class Fibonacci {
    public static void main(String[] args) {
        int x = 12;

        System.out.println(isTheValuePresentInTheSequence(x));
    }

    private static int fibonacciSequence(int number) {
        if (number == 0) {
            return 0;
        }

        if (number == 1) {
            return 1;
        }
        return fibonacciSequence(number - 1) + fibonacciSequence(number - 2);
    }

    public static boolean isTheValuePresentInTheSequence(int number) {
        int i = 0;

        while (true) {
            int fibonacciValue = fibonacciSequence(i);

            if (fibonacciValue == number) {
                return true;
            } else if (fibonacciValue > number) {
                break;
            }
            i++;
        }
        return false;
    }
}
