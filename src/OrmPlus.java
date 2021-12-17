import domain.AppendixA;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrmPlus {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Informe o path desejado");
//        String pathName = scanner.next();
        readFile("src/files/input.202");
    }

    private static void readFile(String pathName) {
        try {
            String txt;
            char[] charList;
            Path path = Paths.get(pathName);
            List<Character> inputList = new ArrayList<>();

            txt = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);
            charList = txt.toCharArray();

            for (char c : charList) {
                if ((AppendixA.isReservedSymbols(Character.toString(c)) || Character.isDigit(c) || Character.isLetter(c)) && !AppendixA.isSpace(c)) {
                    inputList.add(c);
                }
            }

            inputList.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
