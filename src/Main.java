import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> words = new ArrayList<>(List.of("один", "один", "два", "три"));
        printUnevenNumbers(nums);
        printEvenNumbers(nums);
        printingUniqueWords(words);
        printingDuplicates(words);
    }


    private static void printUnevenNumbers(List<Integer> list) {
        System.out.println("Задача 1");
        for (Integer number : list) {
            if (number % 2 != 0) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static void printEvenNumbers(List<Integer> list) {
        System.out.println("Задача 2");
        for (Integer number : list) {
            if (number % 2 == 0)
                System.out.print(number + " ");
        }
        System.out.println();
    }

    private static void printingUniqueWords(List<String> list) {
        System.out.println("Задача 3");
        Set<String> set = new TreeSet<>(list);
        for (String word : set) {
            System.out.print(word + " ");
        }
        System.out.println();
    }

    private static void printingDuplicates(List<String> list) {
        System.out.println("Задача 4");
        Set<String> set = new HashSet<>(list);
        for (String word : set) {
            System.out.println(word + " = " + Collections.frequency(list, word));
        }
    }
}
