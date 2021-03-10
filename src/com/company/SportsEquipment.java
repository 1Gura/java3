package com.company;

import java.util.Scanner;

abstract public class SportsEquipment {
    private String typeSport;

    protected void init(Scanner scanner) {
        do {
            System.out.print("Введите вид спорта: ");
            this.typeSport = scanner.nextLine();
        } while (this.typeSport.isEmpty());
    }

    protected String getSportType() {
        return this.typeSport;
    }

    @Override
    public String toString() {
        return ("\n\t - Вид спорта: " + typeSport + "\n\t");
    }

    static String returnFirstNumber(String string) {
        StringBuilder result = new StringBuilder();
        string = string.replaceAll("\\D", " ");
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                while (string.charAt(i) != ' ') {
                    //result += string.charAt(i);
                    result.append(string.charAt(i));
                    i++;
                    if (i == string.length()) break;
                }
                return result.toString();
            }
        }
        return "";
    }

}
