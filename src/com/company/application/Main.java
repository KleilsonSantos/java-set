package com.company.application;

import com.company.entities.LogEntry;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter file full path: ");
        String caminho = scanner.next();

        try (BufferedReader reader = new BufferedReader(new FileReader(caminho))) {
            Set<LogEntry> logsSet = new HashSet<>();
            String line = reader.readLine();
            while (line != null) {
                String[] vect = line.split(",");
                String userName = vect[0];
                Date moment = Date.from(Instant.parse(vect[1]));
                logsSet.add(new LogEntry(userName, moment));
                line = reader.readLine();
            }
            System.out.println("Total users -> " + logsSet.size());
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
        scanner.close();
    }
}
