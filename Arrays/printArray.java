public class printArray {
    public void arrayprint(int array[]){
            int n= array.length;
            for(int i = 0;i<n;i++){
                System.out.print(array[i]+"\t");
            }
            System.out.println( );

    }
    public static void main(String[] args){
            printArray obj = new printArray();
            int a[] = {1,2,3,4,5,6,7};
            int b[] = {1,2,3,4,5,6};
            obj.arrayprint(a);
            obj.arrayprint(b);
    }

}
