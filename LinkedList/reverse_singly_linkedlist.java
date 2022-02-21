public class reverse_singly_linkedlist {
    private listnode head;

    private static class listnode {
        int data;
        listnode next;

        public listnode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void display(listnode head){
            listnode current = head;
            while(current!=null){
                System.out.print(current.data +"-->");
                current = current.next;
            }System.out.print("null");
            System.out.println();
        }
    public listnode revese_singly_linkedlist(){
        listnode current = head;
        listnode previous = null;
        listnode next = null;
        while(current!=null){
            next= current.next;
            current.next = previous;
            previous = current;
            current = next;

        }
        return previous;
    }
    public static void main(String[] args) {
        reverse_singly_linkedlist sll = new reverse_singly_linkedlist();
        sll.head = new listnode(10);
        listnode second = new listnode(20);
        listnode third = new listnode(30);
        listnode fourth = new listnode(40);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        sll.display(sll.head);
        listnode reverselisthead = sll.revese_singly_linkedlist();

        sll.display(reverselisthead);

    }
}
