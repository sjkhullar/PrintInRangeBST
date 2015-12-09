
package org.learn.Question;
import org.learn.PrepareTree.Node;

public class PrintInRangeBST {
	public static void printRange(Node root, int k1, int k2) {		
		if(root == null)
			return;
		if(root.data >= k1 && root.data <= k2)
			System.out.printf("%d ",root.data);
		if(root.data > k1)
			printRange(root.left,k1,k2);
		if(root.data < k2)
			printRange(root.right,k1,k2);		
	}	
}
