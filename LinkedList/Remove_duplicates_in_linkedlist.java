public class Remove_duplicates_in_linkedlist {
    private listnode head;

    private static class listnode{
        int data;
        listnode next;

        public listnode(int data){
            this.data = data;
            this.next=null;
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
    public void remove_duplicates(){
        listnode current = head;
        while(current != null && current.next!=null){
            if(current.data==current.next.data){
                current.next=current.next.next;
            }else{
                current = current.next;
            }
        }
    }
    public static void main(String[] args) {
        Remove_duplicates_in_linkedlist sll = new Remove_duplicates_in_linkedlist();
        sll.head = new listnode(10);
        listnode second = new listnode(20);
        listnode third = new listnode(30);
        listnode fourth = new listnode(30);
        listnode fifth = new listnode(40);
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next= fifth;

        sll.display();
        sll.remove_duplicates();
        sll.display();
    }
}
