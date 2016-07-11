package com.sumit.datastructure;

import java.util.HashMap;
import java.util.Map;

import javax.naming.ldap.HasControls;
import javax.security.auth.callback.CallbackHandler;

import org.w3c.dom.Node;

//main class 
public class Trie {
	/*
	 * A trie data structure is a data structure used for storing majorly trie
	 * structure is used to store Strings like a dictionary in which you have
	 * flexibility to search prefix letters or the whole words. The hashtable
	 * can do the trick but it is more space n time consuming the trie takes
	 * nlogn time complexity.
	 */

	/*
	 * Private class to create Node which contains a Map and a boolean value
	 * endofword which states if the word entered in trie is complete or not.
	 */
	private class TrieNode {
		Map<Character, TrieNode> child;
		boolean endOfWord;

		// Constructor to initialize the child node.
		public TrieNode() {
			super();
			child = new HashMap<>();
			this.endOfWord = false;
		}
	}

	// creating a root;
	TrieNode root;

	// initializing a root using a constructor;
	public Trie() {
		root = new TrieNode();
	}

	// inserting into the trie datastructure.
	public void insertInto(String word) {
	}
}
