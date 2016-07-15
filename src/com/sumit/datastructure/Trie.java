package com.sumit.datastructure;

import java.util.*;

import org.omg.CORBA.Current;

/*
 * Trie Data structure is a data Structure used for storing large number 
 * of Strings for example Dictionary and other big chunks of library.
 * Trie data structure is more useful than HashTable because it needs lesser 
 * space and has better performance under worst case.
 * insertion is O(n) where n is the length of String
 * searching is O(n) where n is the length of String
 * deletion is    
 * Space Complexity is high - 
 

	Node Class. creates a HashMap That will store the current character and the 
	next node pointer. In addition there will be a endOfWord that will be 
	for depicting if the character is the end of the word or not.
	*/
class TrieNode {
	Map<Character, TrieNode> child;
	boolean endOfWord;

	// Contructor for initializing the HashMap and the endofWord to False;
	public TrieNode() {
		child = new HashMap<>();
		endOfWord = false;
	}
}

// Mai class
public class Trie {

	// The root Node
	final TrieNode root;

	// Initializing the root Node.
	public Trie() {
		root = new TrieNode();
	}

	// Insert the word given by character by character
	public void insert(String word) {
		// creating a current not and set it to point to the root of the Trie.
		TrieNode current = root;
		// looping through the whole word character by charater.
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			/*
			 * temp is having current's value of the character and Node to next
			 * pointer ie the temp is having temp = current's (character at i,
			 * pointer to next Node)
			 */
			TrieNode temp = current.child.get(ch);
			if (temp == null) {
				// if the temp is null initialize the temp node.
				temp = new TrieNode();
				// and add the current charater and a new empty temp in the
				// current;
				current.child.put(ch, temp);
			}
			// dont put else here as this will make assign temp's value in
			// current
			// ie temp = temp.next
			current = temp;

		}
		// mark the current nodes endOfWord as true
		current.endOfWord = true;
	}

	public boolean search(String word) {
		TrieNode current = root;
		for (int i = 0; i < word.length(); i++) {
			char ch = word.charAt(i);
			TrieNode temp = current.child.get(ch);
			// if node does not exist for given char then return false
			if (temp == null) {
				return false;
			}
			current = temp;
		}
		// return true of current's endOfWord is true else return false.
		return current.endOfWord;
	}

	public String longSubString(String word) {
		String subs = "";
		int count = 0;
		TrieNode current = root;
		if (word == null) {
			return null;
		} else {

			for (int i = 0; i < word.length(); i++) {
				char ch = word.charAt(i);
				TrieNode temp = current.child.get(ch);
				if (temp == null) {
					return null;
				}
				subs += ch;
				count++;
				current = temp;
				if (current.endOfWord) {
					break;
				} else {
					continue;
				}
			}
		}
		if (current.endOfWord)
			return subs.substring(0, count);

		else
			return subs;
	}

	public boolean delete(TrieNode node, String word, int index) {
		TrieNode temp = null;
		char c = 0;
		if (node == null) {
			return false;
		} else {
			for (int i = 0; i < word.length(); i++) {
				c = word.charAt(i);
				if (i == index - 1) {
					temp = node.child.get(c);
				}
				node.child.get(c);
			}
		}
		if (node.child.containsKey(c) && node.endOfWord==true) {
			node = null;
			return true;
		} else if (node.child.containsKey(c) && !node.endOfWord==false) {
			node = null;
			temp.endOfWord = true;
			node = temp;
			return true;
		}else{
			return false;
		}
	}

}
