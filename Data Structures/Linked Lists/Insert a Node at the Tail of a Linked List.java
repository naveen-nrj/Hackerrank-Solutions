/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
    Node n = new Node();
    n.data = data;
    n.next = null;
    Node temp = head;
    while(temp.next != null) {
        temp = temp.next;
    }
    temp.next = n;
    return head;
}

