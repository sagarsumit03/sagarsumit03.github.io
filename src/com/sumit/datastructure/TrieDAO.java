package com.sumit.datastructure;

public class TrieDAO {

	public static void main(String[] args) {
		Trie trie = new Trie();
		trie.insert("APP");
		trie.insert("MISS");
		trie.insert("GEOM");
		System.out.println(trie.search("APP"));
		System.out.println(trie.search("MISS"));
		System.out.println(trie.search("RANDOM"));
		
		System.out.println(trie.longSubString("APPLES"));

		//trie.delete("APPLE", trie, 2);
		//System.out.println(trie.search("APPLE"));
	}

}
