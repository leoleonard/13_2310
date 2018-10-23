package one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Champions {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        List<Scores> scores = getData();
        sort(scores);
        save("Scores", scores);
    }

    private static List<Scores> getData() {
        List<Scores> scores = new ArrayList<>();

        System.out.println("Enter the name, first name and time; to quit type STOP");

        String line = null;
        while(!(line = scanner.next()).equals("STOP")) {
            String[] row = line.split("/");
            try {
                scores.add(new Scores(row[0], row[1], Double.parseDouble(row[2])));
                System.out.println("Player added. Please enter the player score; to quit, type STOP");
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
        } while (!((params = scanner.nextLine()).equals("N") || params.equals("L") || params.equals("W") ));


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

    private static void save(String scores, List<Scores> scores1) {
    }
}
