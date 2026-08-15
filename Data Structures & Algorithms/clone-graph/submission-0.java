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
    public Node cloneGraph(Node node) {
        if(node==null){
            return node;
        }
        return recursion(node ,new HashMap<>());
        
    }
    public Node recursion(Node node, Map<Node,Node> map){
        Node copy=new Node(node.val);
        map.put(node,copy);
        for(Node neigbour:node.neighbors){
            if(map.get(neigbour)==null){
                copy.neighbors.add(recursion(neigbour,map));
            }else{
                copy.neighbors.add(map.get(neigbour));
            }
        }
        return copy;
    }
}