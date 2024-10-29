public interface Book {
    String getTitle();
    String getAuthor();
    String getIsbn();
}

public abstract class AbstractBook implements Book {
    protected String title;
    protected String author;
    protected String isbn;
    

    public AbstractBook(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public String getAuthor() {
        return author;
    }

    @Override
    public String getIsbn() {
        return isbn;
    }


    @Override
    public abstract String toString();

    @Override
    public abstract boolean equals(Object obj);
}

public interface Poem {
    int getNumberOfStanzas();
    int getNumberOfVerses();
}

public interface Novel {
    String getPlotSummary();
}

public interface Play {
    List<String> getCharacters();
    List<String> getScenes();
}
class NovelBook extends AbstractBook implements Novel {
    private String plotSummary;

    public NovelBook(String title, String author, String isbn, String plotSummary) {
        super(title, author, isbn);
        this.plotSummary = plotSummary;
    }

    @Override
    public String getPlotSummary() {
        return plotSummary;
    }

    @Override
    public String toString() {
        return "NovelBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", plotSummary='" + plotSummary + '\'' +
                '}';
    }
}
class PoemBook extends AbstractBook implements Poem {
    private int numberOfStanzas;
    private int numberOfVerses;
  
    public PoemBook(String title, String author, String isbn, int numberOfStanzas, int numberOfVerses) {
      super(title, author, isbn);
      this.numberOfStanzas = numberOfStanzas;
      this.numberOfVerses = numberOfVerses;
    }
  
    @Override
    public int getNumberOfStanzas() {
      return numberOfStanzas;
    }
  
    @Override
    public int getNumberOfVerses() {
      return numberOfVerses;
    }
  
    @Override
    public String toString() {
      return "PoemBook{" +
              "title='" + title + '\'' +
              ", author='" + author + '\'' +
              ", isbn='" + isbn + '\'' +
              ", numberOfStanzas=" + numberOfStanzas +
              ", numberOfVerses=" + numberOfVerses +
              '}';
    }
  }
  
class PlayBook extends AbstractBook implements Play {
    private List<String> characters;
    private List<String> scenes;

    public PlayBook(String title, String author, String isbn, List<String> characters, List<String> scenes) {
        super(title, author, isbn);
        this.characters = characters;
        this.scenes = scenes;
    }

    @Override
    public List<String> getCharacters() {
        return characters;
    }

    @Override
    public List<String> getScenes() {
        return scenes;
    }

    @Override
    public String toString() {
        return "PlayBook{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isbn='" + isbn + '\'' +
                ", characters=" + characters +
                ", scenes=" + scenes +
                '}';
    }
}



