import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String numbersLine = input.nextLine();
        String valueLine = input.nextLine();
        input.close();
        String[] numberStrings =  numbersLine.split(",");
        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }
        int value = Integer.parseInt(valueLine.trim());

        BST tree = new BST();
        for (int number : numbers) {
            tree.insert(number);
        }
        List<Integer>result  = tree.getLE(tree.root, value);
        String output = String.join(", ", result.stream().map(String::valueOf).toArray(String[]::new));
        System.out.println(output);

    }
}
