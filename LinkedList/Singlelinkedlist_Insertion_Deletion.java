public class Singlelinkedlist_Insertion_Deletion {
    private listnode head;
    private class listnode{
        int data;
        listnode next;

        public listnode(int data){
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
    public void insertfirst(int data){
        listnode temp = new listnode(data);
        if(head == null){
            head = temp;

        }else{
            temp.next = head;
            head = temp;
        }
    }
    public void deletefirst(){

        if(head == null){
            System.out.print("no elements to delete");
        }else{
            System.out.println(head.data);
            head = head.next;

        }
    }
    public void insertlast(int data){
        listnode temp = new listnode(data);
        if(head == null){
            head = temp;

        }else{
            listnode current = head;
            while(current.next!=null){
                current = current.next;
            }current.next=temp;

        }
    }
    public void deletelast(){

        if(head == null){
            System.out.print("no elements to delete");
        }else{
            listnode current = head;
            while(current.next.next!=null){
                current = current.next;
            }
            System.out.println(current.next.data);
            current.next=null;

        }
    }
    public void insertposition(int data,int position){
        listnode temp = new listnode(data);
        if(head==null){
            insertfirst(data);
            return;
        }else{
            listnode current = head;
            int count =1;
            while(current!=null && count<position-1) {
                current = current.next;
                count++;
            }temp.next= current.next;
            current.next= temp;
        }
    }
    public void deleteposition(int position){
        if(head==null){
            deletefirst();
            return;
        }else{
            listnode current = head;
            int count =1;
            while(current!=null && count<position-1) {
                current = current.next;
                count++;
            }
            System.out.println(current.next.data);
            current.next= current.next.next;
        }
    }
    public static void main(String[] args){
        Singlelinkedlist_Insertion_Deletion obj = new Singlelinkedlist_Insertion_Deletion();
        obj.insertfirst(1);
        obj.insertlast(2);
        obj.insertlast(3);
        obj.insertlast(4);
        obj.insertlast(5);
        obj.insertposition(7,3);
        obj.deleteposition(6);
        obj.display();
    }
}
