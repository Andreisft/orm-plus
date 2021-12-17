package domain;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class AppendixA {
    public static Map<String, String> reservedWords = new HashMap<String, String>(){{
        put("P01", "programa");
        put("P02", "declaracoes");
        put("P03", "fim-declaracoes");
        put("P04", "funcoes");
        put("P05", "fim-funcoes");
        put("P06", "fim-programa");
        put("P07", "tipo-var");
        put("P08", "vazio");
        put("P09", "real");
        put("P10", "inteiro");
        put("P11", "cadeia");
        put("P12", "logico");
        put("P13", "caracter");
        put("P14", "tipo-func");
        put("P15", "fim-func");
        put("P16", "tipo-param");
        put("P17", "se");
        put("P18", "fim-se");
        put("P19", "senao");
        put("P20", "enquanto");
        put("P21", "fim-enquanto");
        put("P22", "retorna");
        put("P23", "pausa");
        put("P24", "imprime");
        put("P25", "true");
        put("P26", "falso");
    }};

    public static Map<String, String> reservedSymbols = new HashMap<String, String>(){{
        put("S01 ", ";");
        put("S02", "[");
        put("S03", "]");
        put("S04", ":");
        put("S05", ",");
        put("S06", "(");
        put("S07", ")");
        put("S08", "?");
        put("S08", "{");
        put("S09", "}");
        put("S10", "<=");
        put("S11", "<");
        put("S12", ">");
        put("S13", ">=");
        put("S14", "==");
        put("S15", "!=");
        put("S15", "#");
        put("S16", "+");
        put("S17", "-");
        put("S18", "*");
        put("S19", "/");
        put("S20", "%");
        put("S21", ":=");
    }};

    public static Boolean isReservedSymbols(String character) {
        return reservedSymbols.containsValue(character);
    }

    public static Boolean isSpace(char character) {
        return character == '\n' || character == '\t' || character == '\r';
    }
}
