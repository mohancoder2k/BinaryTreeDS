package BinaryTreeDS;

import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;
import java.util.*;
public class Tree {
	Node root;
	
	Tree(int data){
		root = new Node(data);
	}
	public void insertAtLeft(Node root,int data) {
		root.left = new Node(data);
	}
	public void insertAtRight(Node root, int data) {
			
		root.right = new Node(data);
	}
	public void InOrder(Node root) {
		 if(root == null) {
			 return;
		 }else {
			 InOrder(root.left);
			 System.out.print(root.data + " ");
			 InOrder(root.right);
		 }
	}
	public void Preorder(Node root) {
		 if(root == null) {
			 return;
		 }else {
			 System.out.print(root.data + " ");
			 InOrder(root.left);
			 InOrder(root.right);
		 }
	}
	public void Postorder(Node root) {
		 if(root == null) {
			 return;
		 }else {
			 InOrder(root.left);
			 InOrder(root.right);
			 System.out.print(root.data + " ");
		 }
	}
	 public List<List<Integer>> BFS(Node root) {
         LinkedList<List<Integer>> res = new LinkedList<>();
     if(root == null) return res;
     Queue<Node> q = new LinkedList<>();
     q.add(root);
     while(q.size() > 0){
        int size = q.size();
        List<Integer> curLvl = new ArrayList<>();
        while(size-- > 0){
            Node curNode = q.poll();
            curLvl.add(curNode.data);
            if(curNode.left != null) q.add(curNode.left);
            if(curNode.right != null) q.add(curNode.right);
        }
        res.addFirst(curLvl);
     }   
     return res;
    }
	 public List<List<Integer>> BFS2(Node root) {
         LinkedList<List<Integer>> res = new LinkedList<>();
     if(root == null) return res;
     Queue<Node> q = new LinkedList<>();
     q.add(root);
     while(q.size() > 0){
        int size = q.size();
        List<Integer> curLvl = new ArrayList<>();
        while(size-- > 0){
            Node curNode = q.poll();
            curLvl.add(curNode.data);
            if(curNode.left != null) q.add(curNode.left);
            if(curNode.right != null) q.add(curNode.right);
        }
        res.add(curLvl);
     }   
     return res;
    }
	 public void printList(List<List<Integer>> res) {
		    if (res == null) {
		        System.out.println("null");
		        return;
		    }

		    for (List<Integer> level : res) {
		        System.out.print(level);
		    }
		}

	public int maxDepth(Node root) {
        if(root == null) return 0;
        int d = 0;
       Queue<Node> q = new LinkedList<>();
       q.add(root);
       while(q.size() > 0){
        
        int size = q.size();
        
        while(size-- > 0){
            Node curNode = q.poll();
            if(curNode.left != null) q.add(curNode.left);
            if(curNode.right != null) q.add(curNode.right);
        }
        d++;
       }
       return d;
    }      
}
