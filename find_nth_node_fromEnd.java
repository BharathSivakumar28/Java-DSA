public class find_nth_node_fromEnd {
    private listnode head;

    private static class listnode {
        int data;
        listnode next;

        public listnode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public listnode nthnode(int n){
        listnode mainptr = head;
        listnode subptr = head;
        int count=0;
        while(count<n){
            subptr=subptr.next;
            count++;
        }
        while(subptr!=null){
            mainptr = mainptr.next;
            subptr= subptr.next;
        }return mainptr;
    }
    public static void main(String[] args) {
        find_nth_node_fromEnd sll = new find_nth_node_fromEnd();
        sll.head = new listnode(10);
        listnode second = new listnode(20);
        listnode third = new listnode(30);
        listnode fourth = new listnode(40);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;

        listnode nthnode= sll.nthnode(2);
        System.out.println(nthnode.data);



    }
}
