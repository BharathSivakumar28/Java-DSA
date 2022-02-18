public class reverse_array {
    public void reversearray(int[] array,int start,int end){
        int n = array.length;
        while(start<end){
            int temp= array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
    }
    public void arrayprint(int array[]){
        int n= array.length;
        for(int i = 0;i<n;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println( );

    }
    public static void main (String[] args){
        reverse_array obj = new reverse_array();

        int [] a1 = {0,1,1,2,3,0,0,2};
        obj.reversearray(a1,0,7);
        obj.arrayprint(a1);

    }
}
