import java.util.List;

public class App {
    public static void main(String[] args){
        Book novelBook = new NovelBook("Pride and Prejudice", "Jane Austen", "978-0141439518", "A young woman's journey of self-discovery and love in 19th century England.");
        Book poemBook = new poemBook("The Raven", "Edgar Allan Poe", "978-0140320775", 10, 14);
        Book playBook = new PlayBook("Hamlet", "William Shakespeare", "978-0140394501", List.of("Hamlet", "Claudius", "Polonius", "Ophelia"), List.of("Act I", "Act II", "Act III", "Act IV", "Act V"));

        // نمایش اطلاعات کتاب‌ها
        System.out.println("**Novel Book:**");
        System.out.println(novelBook);
        System.out.println("Plot Summary: " + ((NovelBook) novelBook).getPlotSummary());

        System.out.println("\n**Poem Book:**");
        System.out.println(poemBook);
        System.out.println("Number of Stanzas: " + ((poemBook) poemBook).getNumberOfStanzas());
        System.out.println("Number of Verses: " + ((poemBook) poemBook).getNumberOfVerses());

        System.out.println("\n**Play Book:**");
        System.out.println(playBook);
        System.out.println("Characters: " + ((PlayBook) playBook).getCharacters());
        System.out.println("Scenes: " + ((PlayBook) playBook).getScenes());
    }
}
