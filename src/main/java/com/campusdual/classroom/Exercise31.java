package com.campusdual.classroom;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Exercise31 {

    public static void main(String[] args) {
        try (Stream<String> stream = Files.lines(Paths.get("src/main/resources/lorem.txt"))) {
            stream.forEach(System.out::println);
        } catch (IOException e) {
            System.out.println("Hubo un error.");
        }

    }
}