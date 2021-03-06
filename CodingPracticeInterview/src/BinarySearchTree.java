
public class BinarySearchTree {

	Node root;

	class Node {
		Integer data;
		Node left, right = null;

		Node(Integer data) {
			this.data = data;
		}
	}

	public void insertRec(Integer data) {
		root = insert(root, data);

	}

	private Node insert(Node node, Integer data) {

		if (node == null) {
			node = new Node(data);
			return node;
		}
		
		if (data < node.data) {
			node.left = insert(node.left, data);
		} else if (data > node.data) {
			node.right = insert(node.right, data);
		}
		return node;
	}
	
	public void inOrder(){
		displayOrder(root);
	}

	private void displayOrder(Node root) {
		if(root != null){
			displayOrder(root.left);
			System.out.println(root.data);
			displayOrder(root.right);
		}
	}
	
	public boolean validBST(){
		return isBST(root);
	}
	
	int prevValue = -1;
	private boolean isBST(Node root2) {
		
		
		if(root2 == null){
			return true;
		}
		
		if(!(isBST(root2.left))){
			return false;
		}
		
		if(! (prevValue < root2.data)){
			return false;
		}
		
		prevValue = root2.data;
		
		return isBST(root2.right);
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		tree.insertRec(2);
		tree.insertRec(5);
		tree.insertRec(6);
		
		tree.inOrder();
		
		boolean validBST = tree.validBST();
		if(validBST){
			System.out.println("BST is Valid");
		}else {
			System.out.println("BST is not valid");
		}
		
		
		
	}
}
