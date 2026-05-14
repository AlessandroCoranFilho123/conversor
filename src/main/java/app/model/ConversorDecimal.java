package app.model;

public class ConversorDecimal {
    public static String decimalParaBinario(int valor) {
        return Integer.toBinaryString(valor);
    }

    public static String decimalParaHexadecimal(int valor) {
        return Integer.toHexString(valor);
    }
}

