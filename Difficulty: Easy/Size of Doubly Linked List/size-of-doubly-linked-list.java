// User function Template for Java
class Solution {
    public int findSize(Node head) {
        // Code Here
        int count = 0;
        Node current = head;
        
        while (current != null) {
            count++;
            current = current.next; // move to next node
        }
        
        return count;
    }
}
