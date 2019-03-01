package question;

public class Q8 {
	public static void main(String[] args) {
		Q8TreeNode node0 = new Q8TreeNode(0);
		Q8TreeNode node1 = new Q8TreeNode(1);
		Q8TreeNode node2 = new Q8TreeNode(2);
		Q8TreeNode node3 = new Q8TreeNode(3);
		Q8TreeNode node4 = new Q8TreeNode(4);
		Q8TreeNode node5 = new Q8TreeNode(5);
		Q8TreeNode node6 = new Q8TreeNode(6);
		Q8TreeNode node7 = new Q8TreeNode(7);
		Q8TreeNode node8 = new Q8TreeNode(8);
		
		node0.left = node1;
		node0.right = node2;
		node1.father = node0;
		node1.left = node3;
		node1.right = node4;
		node2.father = node0;
		node2.left = node5;
		node2.right = node6;
		node3.father = node1;
		node4.father = node1;
		node4.left = node7;
		node4.right = node8;
		node5.father = node2;
		node6.father = node2;
		node7.father = node4;
		node8.father = node4;
		
		Q8TreeNode res = inorderNextNode(node0,node0);
		System.out.println(res.val);
		
	}

	public static Q8TreeNode inorderNextNode(Q8TreeNode root, Q8TreeNode node) {

		if (root == null) {
			return null;
		}
		Q8TreeNode temp = null;
		if (node.right != null) {
			temp = node.right;
			while (temp.left != null) {
				temp = temp.left;
			}
			return temp;
		}

		if (node.father == null) {
			return null;
		}

		if (node.father.left == node) {
			return node.father;
		}

		temp = node.father;
		while (temp.father != null && temp.father.right == temp) {
			temp = temp.father;
		}
		return temp.father;
	}
}

class Q8TreeNode {
	int val;
	Q8TreeNode left;
	Q8TreeNode right;
	Q8TreeNode father;

	Q8TreeNode(int x) {
		val = x;
	}
}