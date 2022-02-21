import org.w3c.dom.ls.LSInput;

public class detect_the_loop_Single {
    private listnode head;

    private static class listnode {
        private int data;
        private listnode next;

        public listnode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void display() {
        listnode current = head;
        while (current != null) {
            System.out.print(current.data + "-->");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public boolean detectloop() {
        listnode fastptr = head;
        listnode slowptr = head;
        while (fastptr.next != null && fastptr.next.next != null) {
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if (slowptr == fastptr) {
                return true;

            }
        }

        return false;
    }

    public void start_of_the_loop() {
        listnode fastptr = head;
        listnode slowptr = head;
        listnode current = head;
        while (fastptr != null && fastptr.next != null ) {
            fastptr = fastptr.next.next;
            slowptr = slowptr.next;
            if(fastptr == slowptr){

                getstartingnode(slowptr);
                return;
             }
            return;
        }
    }

    private listnode getstartingnode(listnode slowptr) {
        listnode temp = head;
        while (slowptr != temp) {
            slowptr = slowptr.next;
            temp = temp.next;
        }
        return temp;
    }





    public static void main(String[] args) {
        detect_the_loop_Single sll = new detect_the_loop_Single();
        sll.head = new listnode(10);
        listnode second = new listnode(20);
        listnode third = new listnode(30);
        listnode fourth = new listnode(40);
        listnode fifth = new listnode(50);
        listnode sixth = new listnode(60);

        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = sixth;
        sixth.next = fourth;

         sll.start_of_the_loop();

       System.out.println(sll.detectloop());





    }
}
