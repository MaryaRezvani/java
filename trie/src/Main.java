import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // خواندن ورودی
        String namesLine = input.nextLine();
        String searchCharLine = input.nextLine();
        input.close();

        String[] names = namesLine.split(",");
        String searchChar = searchCharLine.trim();

        //  Trie  وارد کردن اسامی ساخت درخت 
        Trie trie = new Trie();
        for (String name : names) {
            trie.insert(name.toLowerCase()); // تبدیل به حروف کوچک برای یکسان‌سازی
        }

        // یافتن کلمات بر اساس کاراکتر ورودی و نمایش نتیجه
        // List<String> results = trie.findWords(searchChar.toLowerCase());
        // for (String word : results) {
        //     System.out.print(word+',');
            // word.split(",");
        List<String> results = trie.findWords(searchChar.toLowerCase());
        String output = String.join(", ", results);
        System.out.println(output);
    }
}



