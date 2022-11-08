package com.BinarySearchTree;

import com.BinarySearchTree.FindingSumPairBST.Node;

public class Main {
	public static void main(String[] args) {

		FindingSumPairBST findSumPair = new FindingSumPairBST();
		Node root = null;
		root = findSumPair.insert(root, 20);
		root = findSumPair.insert(root, 40);
		root = findSumPair.insert(root, 50);
		root = findSumPair.insert(root, 70);
		root = findSumPair.insert(root, 60);
		root = findSumPair.insert(root, 30);
		root = findSumPair.insert(root, 10);
		int sum = 130;
		findSumPair.findPairWithGivenSum(root, sum);
	}

}
