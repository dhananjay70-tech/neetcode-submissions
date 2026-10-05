/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/
class Solution {

    HashMap<Node, Node> mp = new HashMap<>();

    Node DFS(Node node) {

        if (mp.containsKey(node)) {
            return mp.get(node);
        }

        Node cloneNode = new Node(node.val);

        mp.put(node, cloneNode);

        for (int i = 0; i < node.neighbors.size(); i++) {

            Node neighbor = node.neighbors.get(i);

            Node cloneNeighbor = DFS(neighbor);

            cloneNode.neighbors.add(cloneNeighbor);
        }

        return cloneNode;
    }

    public Node cloneGraph(Node node) {

        if (node == null) {
            return null;
        }

        mp.clear();

        return DFS(node);
    }
}