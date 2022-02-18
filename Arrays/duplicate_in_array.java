import java.util.Arrays;

public class duplicate_in_array {
    public void duplicateaArray(int[] array,int n){
        Arrays.sort(array);
        for(int i=0;i<n-1;i++){
            if(array[i]==array[i+1]){
                System.out.println(array[i]);
            }
        }
    }
    public static void main (String[] args){
        duplicate_in_array obj = new duplicate_in_array();

        int [] a1 = {1,2,3,4,2};
        obj.duplicateaArray(a1,5);


    }
}
