import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Trie {
  private TrieNode root;

  public Trie() {
      root = new TrieNode();
  }

  public void insert(String word) {
      TrieNode node = root;
      for (char ch : word.toCharArray()) {
          int index = ch - 'a';
          if (node.children[index] == null) {
              node.children[index] = new TrieNode();
              node.children[index].val = ch;
          }
          node = node.children[index];
      }
      node.isWord = true;
  }

  public List<String> findWords(String prefix) {
      TrieNode node = root;
      List<String> words = new ArrayList<>();
      for (char ch : prefix.toCharArray()) {
          int index = ch - 'a';
          if (node.children[index] == null) {
              return words;
          }
          node = node.children[index];
      }
      dfs(node, prefix, words);
      Collections.sort(words);
      return words;
  }

  private void dfs(TrieNode node, String prefix, List<String> words) {
      if (node.isWord) {
          words.add(prefix);
      }
      for (TrieNode child : node.children) {
          if (child != null) {
              dfs(child, prefix + child.val, words);
          }
      }
  }
}

