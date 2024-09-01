package br.edu.ifpb.eda.questoes.questao03;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.json.JsonMapper;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class MonthlyBilling {
    public static void main(String[] args) {
        String path = "C:\\Users\\Hugo Diniz\\Documents\\desafio-estagio\\desafios\\src\\main\\java\\br\\edu\\ifpb\\eda\\questoes\\questao03\\example.json";
        JsonMapper jsonMapper = new JsonMapper();

        try {
            List<DailyBilling> invoicing = jsonMapper.readValue(new File(path), new TypeReference<List<DailyBilling>>() {
            });

            double maxValue = invoicing.get(0).getValue();
            double minValue = invoicing.get(0).getValue();
            double sum = 0;
            int daysWithInvoicing = 0;

            for (DailyBilling day : invoicing) {
                double value = day.getValue();
                if (value > 0) {
                    if (value < minValue) {
                        minValue = value;
                    }
                    if (value > maxValue) {
                        maxValue = value;
                    }
                    sum += value;
                    daysWithInvoicing++;
                }
            }

            double average = (daysWithInvoicing > 0) ? sum / daysWithInvoicing : 0.0;
            int aboveAverageDays = 0;

            for (DailyBilling day : invoicing) {
                if (day.getValue() > average) {
                    aboveAverageDays++;
                }
            }

            System.out.println("Menor valor de faturamento: " + minValue);
            System.out.println("Maior valor de faturamento: " + maxValue);
            System.out.println("Número de dias com faturamento acima da média: " + aboveAverageDays);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}