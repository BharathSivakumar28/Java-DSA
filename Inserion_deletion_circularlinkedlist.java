public class Inserion_deletion_circularlinkedlist {
    private listnode last;
    public int length;

    private static class listnode{
        int data;
        listnode next;
        public listnode(int data){
            this.data = data;

        }
    }
    public Inserion_deletion_circularlinkedlist(){
        last = null;
        length = 0;
    }
    public int length(){
        return length;
    }
    public boolean isempty(){
        return length==0;
    }
    public void insert(int data){
        listnode newnode = new listnode(data);
        if(isempty()){
            last = newnode;
        }else{
            newnode.next = last.next;
        }
        last.next = newnode;
        length++;
    }
   public void delete(){
        if(isempty()){
            System.out.println("no node to be deleted");
        }else{
            System.out.println("Deleted data is:"+last.data);
            last.next=last.next.next;
        }
   }
    public static void main(String[] args){
        Inserion_deletion_circularlinkedlist cll = new Inserion_deletion_circularlinkedlist();

        System.out.println(cll.isempty());
        cll.insert(10);
        cll.insert(20);
        cll.insert(30);
        cll.insert(40);
        cll.insert(50);
        cll.insert(60);

    }
}
