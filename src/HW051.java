import java.util.Arrays;


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
            String[] list1 = {"a", "b", "c"};
            String[] list2 = {"1", "2", "3"};
            String[] mergedList = mergeLists(list1, list2);
            System.out.println("Task 5: Merged list = " + Arrays.toString(mergedList));
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
        public static String[] mergeLists(String[] list1, String[] list2) {
            int maxLength = Math.max(list1.length, list2.length);
            String[] mergedList = new String[maxLength * 2];
            int index = 0;

            for (int i = 0; i < maxLength; i++) {
                if (i < list1.length) {
                    mergedList[index++] = list1[i];
                }
                if (i < list2.length) {
                    mergedList[index++] = list2[i];
                }
            }

            return mergedList;
        }
    }


