public class BinaryTree {
    static class Node{
        int value;
        Node left, right;

        Node(int data){
            value = data;
            left=null;
            right=null;
        }
    }
    public void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                System.out.println(" Inserted " + value + " to left of " + node.value);
                node.left = new Node(value);
            }
        }
        else if (value > node.value)
        {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                System.out.println("  Inserted " + value + " to right of " + node.value);
                node.right = new Node(value);
            }
        }
    }
    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }
    public void traversePreOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    public void traversePostOrder(Node node) {
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.value);
        }
    }
    public void levelOrderTraversal(Node startNode) {
        Queue<Node> queue=new LinkedList<Node>();
        queue.add(startNode);
        while(!queue.isEmpty())
        {
            TreeNode tempNode=queue.poll();
            System.out.printf("%d ",tempNode.data);
            if(tempNode.left!=null)
                queue.add(tempNode.left);
            if(tempNode.right!=null)
                queue.add(tempNode.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();

        Node root = new Node(5);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.value);
        bt.insert(root, 2);
        bt.insert(root, 4);
        bt.insert(root, 8);
        bt.insert(root, 6);
        bt.insert(root, 7);
        bt.insert(root, 3);
        bt.insert(root, 9);
        System.out.println("Traversing tree in order");
        bt.traverseInOrder(root);
    }
}
