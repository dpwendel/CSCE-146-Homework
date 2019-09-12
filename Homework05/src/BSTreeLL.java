import java.util.*;
public class BSTreeLL <T extends shapeInterface> {

		private class Node {
			private T data;
			private Node leftChild;//always is less than
			private Node rightChild;//right is always greater than or =

			public Node(T aData) {
				data = aData;
				leftChild = rightChild = null;
			}
		}

		private Node root;

		public BSTreeLL() {
			root = null;
		}

		public void insert(T aData) {
			if (root == null)
				root = new Node(aData);
			else
				insert(root, aData);
		}

		private Node insert(Node aNode, T aData)// recursive method
		{
			if (aNode == null)// found a leaf
				aNode = new Node(aData);
			else if (aNode.data.getArea() > aData.getArea())// go left
				aNode.leftChild = insert(aNode.leftChild, aData);
			else if (aNode.data.getArea() < aData.getArea())// go right
				aNode.rightChild = insert(aNode.rightChild, aData);
			return aNode;
		}

		public void printPreOrder() {
			printPreOrder(root);
		}

		private void printPreOrder(Node aNode) {
			if (aNode == null)
				return;
			System.out.println(aNode.data);// Process
			if (aNode.leftChild != null)// LEFT
				printPreOrder(aNode.leftChild);
			if (aNode.rightChild != null)// RIGHT
				printPreOrder(aNode.rightChild);
		}
		public void printInOrder()
		{
			printInOrder(root);
		}
		public void printInOrder(Node aNode)
		{
			if(aNode == null)
				return;
			if(aNode.leftChild != null)//left
				printInOrder(aNode.leftChild);
			System.out.println(aNode.data);//process
			if(aNode.rightChild != null)//right
				printInOrder(aNode.rightChild);
		}
	
		/*public boolean search(T aData)
		{
			return search(root,aData);
		}
		private boolean search(Node aNode, T aData)
		{
			if(aNode == null)//leaf was found uyaaa
				return false;
			if(aData.compareTo(aNode.data)== 0)//found it 
				return true;
			else if(aData.compareTo(aNode.data)< 0)//leftttttt
				return search(aNode.leftChild,aData);
			else
				return search(aNode.rightChild,aData);//right
			
		}*/
		
		public int getHeight()
		{
		return getHeight(root,0);
		}
		private int getHeight(Node aNode, int count)
		{
			if(aNode == null)
			{
				return count;
			}
			count++;
			return Math.max(getHeight(aNode.leftChild,count),getHeight(aNode.rightChild,count));
		}
		public void printPostOrder()
		{
			int nodeCount = 1;
			int maxNodeAtDepth = 1;
			int maxNodes = (int)Math.pow(2.0, getHeight());
			int totalNodeCount = 0;
			Queue<Node> nQ = new LinkedList<Node>();
			nQ.add(root);
			while(!nQ.isEmpty() && totalNodeCount < maxNodes)
			{
				//dequeue
				Node aNode = nQ.remove();
				if(aNode != null)
				{
					System.out.print(aNode.data+" ");
					nQ.add(aNode.leftChild);
					nQ.add(aNode.rightChild);
				}
				else //this is a leaf so its null
				{
					System.out.print("X ");
					nQ.add(null);
					nQ.add(null);
				}
				if(nodeCount >= maxNodeAtDepth)
				{
					System.out.println("|\n-------"+ (int) (Math.log(maxNodeAtDepth) / Math.log(2)));
					totalNodeCount += nodeCount;
					nodeCount = 1;
					maxNodeAtDepth *= 2;
				}
				else
				{
					if(nodeCount != 1 && nodeCount % 2 == 0)
					{
						System.out.print("|");
						nodeCount++;
					}
				}
				System.out.println();

			}
		}
		public void delete(T aData)
		{
			root = delete(root,aData);
		}
		private Node delete(Node aNode, T aData)
		{
			//find the node
			if(aNode.data.getArea() > aData.getArea()) //GOO LEFT
				aNode.leftChild = delete(aNode.leftChild,aData);
			else if(aNode.data.getArea() < aData.getArea())
				aNode.rightChild = delete(aNode.rightChild,aData);
			{
				if(aNode.rightChild == null) //none or only left child
					return aNode.leftChild;
				if(aNode.leftChild == null)
					return aNode.rightChild;
				//TwoChildren
				//TODO find min in tree
				Node min = findMinInTree(aNode.rightChild);
				aNode.data = min.data;
			}
			return aNode;
			
		}
		private Node findMinInTree(Node aNode)
		{
			if(aNode == null)
				return null;
			if(aNode.leftChild == null)
				return aNode;
			else
				return findMinInTree(aNode.leftChild);
				
		}
		
		public double findMaxInTree()
		{
			return findMaxInTree(root);
		}
		//NOT SURE IF THIS IS CORRECT BUT I NEED A FIND MAX IN TREE CLASS!!!!!!!!!!
		private double findMaxInTree(Node aNode)
		{
			if(aNode.rightChild == null)
				return aNode.data.getArea();

			else
				return findMaxInTree(aNode.rightChild);
		}

	}


