package br.edu.ifpb.eda.questoes.questao05;

public class ReverseString {
    public static void main(String[] args) {
        String input = "oi";

        String output = reverse(input);

        System.out.println(output);
    }

    public static String reverse(String input) {
        StringBuilder output = new StringBuilder();

        for (int i = input.length() - 1; i >= 0; i--) {
            output.append(input.charAt(i));
        }
        return output.toString();
    }
}
