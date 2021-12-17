package utils;

import domain.AppendixA;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Utils {

    public static void requestParam() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o nome do arquivo: ");
        String pathName = scanner.next();
        List<String> inputList = new ArrayList<>();

        char[] charList = readFile(pathName);

        for (char c : charList) {
            if ((isReservedSymbols(Character.toString(c)) || Character.isDigit(c) || Character.isLetter(c)) && !isSpace(c)) {
                inputList.add(Character.toString(c));
            }
        }

        buildFile(inputList);
    }

    private static char[] readFile(String pathName) {
        try {
            Path path = Paths.get(pathName);
            String txt = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);

            return txt.toCharArray();
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    private static void buildFile(List<String> lines) {
        String fileName = "MeuTest.LEX";
        try {
            Path file = Paths.get(fileName);
            Files.write(file, lines, StandardCharsets.UTF_8);

            System.out.println("O arquivo foi gerado");
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }

    private static Boolean isReservedSymbols(String character) {
        return AppendixA.reservedSymbols.containsValue(character);
    }

    private static Boolean isSpace(char character) {
        return character == '\n' || character == '\t' || character == '\r';
    }
}
