public class cyclindericalArray {
    public void rotate(int[] array) {
        int n = array.length;
        int x = array[n-1];
        for(int i=n-1;i>0;i--){
            array[i] = array[i-1];

        }array[0] = x;

    }
    public void arrayprint(int array[]){
        int n= array.length;
        for(int i = 0;i<n;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println( );

    }
    public static void main (String[] args){
        cyclindericalArray obj = new cyclindericalArray();

        int [] a1 = {1,2,3,4,5};
        obj.rotate(a1);
        obj.arrayprint(a1);

    }
}
