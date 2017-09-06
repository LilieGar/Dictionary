package com.company;

import java.util.HashMap;
import java.util.Map;
import java.io.*;

public class Aries {

    public static void main(String[] args) {
        // Значение транзитов Луны по знакам зодиака для Овна
        Map<String, String> moonTransit = new HashMap<String, String>();

        //добавление элементов в словарь: тразит - значение
        moonTransit.put("Луна в Овне", "Личные инициативы, спорт, соревнование");
        moonTransit.put("Луна в Тельце", "Творчество, самовыражение, заработки");
        moonTransit.put("Луна в Близнецах", "Поездки, завязывание знакомств, получение информации");
        {
            InputStreamReader isr = new InputStreamReader(System.in);
            System.out.println("Введите транзиты на начало недели");
            BufferedReader buffer = new BufferedReader(isr); // считывание данных пользователя
            String input = "";

            try {
                input = buffer.readLine();
            } catch (IOException e) {
                System.out.println("Ошибка ввода");
            }
            System.out.println(input);
            //получение элементов
            System.out.println(moonTransit.get(input));
        }
        {
            System.out.println("Введите транзиты на середину недели");
            InputStreamReader isr1 = new InputStreamReader(System.in);
            BufferedReader buffer1 = new BufferedReader(isr1);
            String input1 = "";

            try {
                input1 = buffer1.readLine();

            } catch (IOException e) {
                System.out.println("Ошибка ввода");
            }
            System.out.println(input1);
            System.out.println(moonTransit.get(input1));
        }
        {
            System.out.println("Введите транзиты на конец недели");
            InputStreamReader isr2 = new InputStreamReader(System.in);
            BufferedReader buffer2 = new BufferedReader(isr2);
            String input2 = "";

            try {
                input2 = buffer2.readLine();
                buffer2.close();
            } catch (IOException e) {
                System.out.println("Ошибка ввода");
            }
            System.out.println(input2);
            System.out.println(moonTransit.get(input2));
        }
    }
}
