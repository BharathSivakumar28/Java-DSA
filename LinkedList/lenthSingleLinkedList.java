public class lenthSingleLinkedList {

    private listnode head;

    private static class listnode{
        private int data;
        private listnode next;

        public listnode(int data){
            this.data  = data;
            this.next = null;
        }
    }
    public void display(){
        listnode current = head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current =current.next;
        }System.out.print("null");
        System.out.println();
    }
    public int count(){
        if(head==null){
            return 0;
        }
        listnode current = head;
        int count = 0;
        while(current!=null){
            count++;
            current =current.next;

        }return count;
    }

    public static void main(String[] args){
        lenthSingleLinkedList sll = new lenthSingleLinkedList();
        sll.head = new listnode(10);
        listnode second = new listnode(20);
        listnode third = new listnode(30);
        listnode fourth = new listnode(40);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        sll.display();

        System.out.println("Length of the singly linked list is " + sll.count());
    }
}
