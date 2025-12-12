package BinaryTreeDS;

import java.util.List;

public class MainImplementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Tree tr = new Tree(3);

        // Step 2: Insert left and right of root
        tr.insertAtLeft(tr.root, 9);
        tr.insertAtRight(tr.root, 20);

        // Step 3: Insert children of 20
        tr.insertAtLeft(tr.root.right, 15);
        tr.insertAtRight(tr.root.right, 7);
		
		// Traversal (Inorder)
		tr.InOrder(tr.root);
		System.out.println("");
		System.out.println(tr.maxDepth(tr.root));
		System.out.println("BFS Traversal from Top to Bottom : ");
		tr.printList(tr.BFS(tr.root));
		System.out.println("\n BFS Traversal from Bottom to Top : ");
		tr.printList(tr.BFS2(tr.root));
	}

}
