package br.edu.ifpb.eda.questoes.questao04;

import java.util.HashMap;
import java.util.Map;

public class MonthlyBillingByState {
    public static void main(String[] args) {
        Map<String, Double> states = new HashMap<>();

        states.put("SP", 67836.43);
        states.put("RJ", 36678.66);
        states.put("MG", 29229.88);
        states.put("ES", 27165.48);
        states.put("Outros", 19849.53);

        double total = 0;
        for (Double value: states.values()) {
            total = total + value;
        }

        for (String state: states.keySet()) {
            double stateBilling = states.get(state);
            double percent = (stateBilling / total) * 100;
            System.out.printf("%s: %.2f%%%n", state, percent);
        }

    }
}
