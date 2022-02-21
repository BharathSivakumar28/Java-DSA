public class Middlenode_singleLinkedlist {
    private listnode head;

    private static class listnode {
        private int data;
        private listnode next;

        public listnode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public void display(){
        listnode current = head;
        while(current!=null){
            System.out.print(current.data +"-->");
            current = current.next;
        }System.out.print("null");
        System.out.println();
    }
    public listnode middle(){
        listnode fastptr = head;
        listnode slowptr = head;
        listnode current = head;
        int count=0;
        while(fastptr != null && fastptr.next!=null ){
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
        }

        return slowptr;
    }
    public static void main(String[] args) {
        Middlenode_singleLinkedlist sll = new Middlenode_singleLinkedlist();
        sll.head = new listnode(10);
        listnode second = new listnode(20);
        listnode third = new listnode(30);
        listnode fourth = new listnode(40);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        sll.display();
        listnode middle= sll.middle();
        System.out.println(middle.data);



    }
}
