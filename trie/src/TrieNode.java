class TrieNode {
    public char val;
    public boolean isWord;
    public TrieNode[] children;

    public TrieNode() {
        val = '\0';
        isWord = false;
        children = new TrieNode[30];
    }
}

