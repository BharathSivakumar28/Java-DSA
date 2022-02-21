public class Search_in_LinkedList {
    private listnode head;

    private static class listnode {
        private int data;
        private listnode next;

        public listnode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public boolean search(int search_key) {
        listnode current = head;
        while (current != null) {

            if (current.data == search_key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    public static void main(String[] args) {
        Search_in_LinkedList sll = new Search_in_LinkedList();
        sll.head = new listnode(10);
        listnode second = new listnode(20);
        listnode third = new listnode(30);
        listnode fourth = new listnode(40);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        if (sll.search(50)) {
            System.out.println("found");

        } else {
            System.out.println("not found");
        }
    }
}