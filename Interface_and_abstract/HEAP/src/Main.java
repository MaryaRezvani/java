import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // خواندن ورودی
        String inputLine = scanner.nextLine();
        scanner.close();

        String[] inputStrings = inputLine.split(",");
        int[] numbers = Arrays.stream(inputStrings).mapToInt(Integer::parseInt).toArray();

        // ایجاد Min Heap با ظرفیت مناسب
        MinHeap minHeap = new MinHeap(numbers.length);

        // وارد کردن اعداد به Min Heap
        for (int number : numbers) {
            minHeap.insert(number);
        }

        // نمایش آرایه Min Heap
        minHeap.printHeap();
    }
}
