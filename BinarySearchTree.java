import java.util.Scanner;
public class Main {

	Node root;

	public void addNode(int key) {

		Node newNode = new Node(key);

		if (root == null) {

			root = newNode;

		} else {

			Node focusNode = root;
			Node parent;

			while (true) {

				parent = focusNode;

				if (key < focusNode.key) {

					focusNode = focusNode.leftChild;

					if (focusNode == null) {
            
						parent.leftChild = newNode;
						return;

					}

				} else { 
          
					focusNode = focusNode.rightChild;

					if (focusNode == null) {

						parent.rightChild = newNode;
						return; 

					}

				}

			}
		}

	}

	public Node findNode(int key) {

		Node focusNode = root;

		while (focusNode.key != key) {

			if (key < focusNode.key) {

				focusNode = focusNode.leftChild;

			} else {

				focusNode = focusNode.rightChild;

			}

			if (focusNode == null)
				return null;

		}

		return focusNode;

	}

public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
		Main theTree = new Main();

		theTree.addNode(35);

		theTree.addNode(18);

		theTree.addNode(48);

		theTree.addNode(72);

		theTree.addNode(60);

		theTree.addNode(25);

    System.out.println("Enter Integer to search for");
    String g = userInput.nextLine();
    int i=Integer.parseInt(g);  
		if(theTree.findNode(i) != null){
      System.out.println("True");
    } else {
      System.out.println("False");
    }

}
}

class Node {

	int key;

	Node leftChild;
	Node rightChild;

	Node(int key) {

		this.key = key;

	}

}