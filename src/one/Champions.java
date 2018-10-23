package one;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Champions {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {

        List<Scores> scores = getData();
        sort(scores);
        save("Scores", scores);
    }

    private static List<Scores> getData() {
        List<Scores> scores = new ArrayList<>();

        System.out.println("Enter the first name/last name/time; to quit type STOP");

        String line = null;
        while (!(line = scanner.next()).equals("STOP")) {
            String[] row = line.split("/");
            try {
                scores.add(new Scores(row[0], row[1], Double.parseDouble(row[2])));
                System.out.println("Player added. Please enter the next player; to quit, type STOP");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Please enter the valid data");
            }
        }

        return scores;
    }


    private static void sort(List<Scores> scores) {

        String params = null;
        do {
            System.out.println("Please choose the sort method: name - N, last name - L, time - T");
        } while (!((params = scanner.nextLine()).equals("N") || params.equals("L") || params.equals("W")));


        if (params.equals("N")) {
            Collections.sort(scores, new NameComparator());
        } else if (params.equals("N")) {
            Collections.sort(scores, new LastNameComparator());
        } else if (params.equals("T")) {
            Collections.sort(scores, new TimeComparator());
        } else {
            System.out.println("Niepoprawny parametr sortowania");
        }

    }

    private static void save(String name, List<Scores> scores) throws IOException {

        File file = new File(name + ".csv");
        if (!file.exists()) {
            file.createNewFile();
        }

        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

        for (int i = 0; i < scores.size(); i++) {
            String row = scores.get(i).getFirstName() + ";" + scores.get(i).getLastName() + ";" + scores.get(i).getTime() + "\n";
            bufferedWriter.write(row);
            bufferedWriter.close();
        }
        bufferedWriter.close();
        System.out.println("File was saved");
    }
}
