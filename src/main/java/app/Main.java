package app;
import app.model.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("------------------------------");
        System.out.println("CONVERTER -- SOMAR -- SUBTRAIR");
        System.out.println("------------------------------");

        System.out.println("1. Converter");
        System.out.println("2. Somar");
        System.out.println("3. Subtrair");
        System.out.print("Resp: ");
        int opcao = sc.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("1. Decimal para binário");
                System.out.println("2. Decimal para hexadecimal");
                System.out.println("3. Binário para decimal");
                System.out.println("4. Binário para hexadecimal");
                System.out.println("5. Hexadecimal para decimal");
                System.out.println("6. Hexadecimal para binário");
                System.out.print("Resp: ");
                int case1 = sc.nextInt();
                System.out.print("Digite o valor: ");
                String valor = sc.next();
            if (case1 == 1) {
                String bin = ConversorDecimal.decimalParaBinario(Integer.parseInt(valor));
                System.out.printf("%s em binário é: %s", valor, bin);
            } else if (case1 == 2) {
                String hex = ConversorDecimal.decimalParaHexadecimal(Integer.parseInt(valor));
                System.out.printf("%s em hexadecimal é: %s", valor, hex.toUpperCase());
            } else if (case1 == 3) {
                String dec = ConversorBinario.binarioParaDecimal(Integer.parseInt(valor));
                System.out.printf("%s em decimal é: %s", valor, dec);
            } else if (case1 == 4) {
                String hex = ConversorBinario.binarioParaHexadecimal(Integer.parseInt(valor));
                System.out.printf("%s em hexadecimal é: %s", valor, hex);
            } else if (case1 == 5) {

            } else if (case1 == 6) {

            }

            break;
            case 2:
                System.out.println("1. Somar decimais");
                System.out.println("2. Somar binários");
                System.out.println("3. Somar hexadecimais");
                System.out.println("4. Somar tipos diferentes");
                int case2 = sc.nextInt();
                if (case2 == 1) {
                    System.out.println("Digite os dois valores:");
                    int decimal1 = sc.nextInt();
                    int decimal2 = sc.nextInt();
                }
            break;
            case 3:
                System.out.println("1. Subtrair decimais");
                System.out.println("2. Subtrair binários");
                System.out.println("3. Subtrair hexadecimais");
                System.out.println("4. Subtrair tipos diferentes");
                int case3 = sc.nextInt();
                if (case3 == 1) {
                    System.out.println("Digite os dois valores:");
                    int decimal1 = sc.nextInt();
                    int decimal2 = sc.nextInt();
                }
            break;
                default:
                    System.out.println("Digite um valor válido");
        }

        sc.close();
    }
}