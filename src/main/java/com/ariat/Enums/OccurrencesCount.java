package com.ariat.Enums;
import java.util.*;

public class OccurrencesCount {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        //Accepting input.
        System.out.print("Enter 10 integers between 1 and 100: ");
        for (int i = 0; i < 10; i++) {
            list.add(scan.nextInt());
        }

        Collections.sort(list);
        Integer prevNumber = null;
        for (int number : list) {
            if (prevNumber == null || prevNumber != number) {
                int count = Collections.frequency(list, number);
                System.out.println(number + " occurs " + count + (count > 1 ? " times." : " time."));
            }
            prevNumber = number;
        }
    }
}