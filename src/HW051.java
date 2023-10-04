import java.util.ArrayList;
import java.util.List;

    public class HW051 {
        public static void main(String[] args) {
            // Task 1
            int[] array = {2, 3, 1, 0};
            int sum = calculateSum(array);
            System.out.println("Task 1: Sum of all numbers = " + sum);

            // Task 2
            int[] list = {2, 3, 1, 0};
            double average = calculateAverage(list);
            System.out.println("Task 2: Average of numbers = " + average);

            // Task 3
            int n = 15;
            printMultiplicationTable(n);

            // Task 4
            printFizzBuzz();

            // Task 5
            List<String> list1 = new ArrayList<>();
            list1.add("a");
            list1.add("b");
            list1.add("c");

            List<String> list2 = new ArrayList<>();
            list2.add("1");
            list2.add("2");
            list2.add("3");

            List<String> mergedList = mergeLists(list1, list2);
            System.out.println("Task 5: Merged list = " + mergedList);
        }

        // Task 1: The sum of the numbers in the array
        public static int calculateSum(int[] array) {
            int sum = 0;
            for (int num : array) {
                sum += num;
            }
            return sum;
        }

        // Task 2: Arithmetic mean in the array
        public static double calculateAverage(int[] list) {
            int sum = 0;
            for (int num : list) {
                sum += num;
            }
            return (double) sum / list.length;
        }

        // Task 3: Multiplication table
        public static void printMultiplicationTable(int n) {
            for (int i = 1; i <= 10; i++) {
                System.out.println(n + " X " + i + " = " + (n * i));
            }
        }

        // Task 4: FizzBuzz
        public static void printFizzBuzz() {
            for (int i = 1; i <= 100; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        }

        // Task 5: Combining arrays
        public static List<String> mergeLists(List<String> list1, List<String> list2) {
            int maxLength = Math.max(list1.size(), list2.size());
            List<String> mergedList = new ArrayList<>();

            for (int i = 0; i < maxLength; i++) {
                if (i < list1.size()) {
                    mergedList.add(list1.get(i));
                }
                if (i < list2.size()) {
                    mergedList.add(list2.get(i));
                }
            }
            return mergedList;
        }
    }


