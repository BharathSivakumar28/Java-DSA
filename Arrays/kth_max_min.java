import java.util.Arrays;

public class kth_max_min {

    public int kth_max_min(int[] array,int position,int n){
        Arrays.sort(array);
        return array[position-1];

    }
    public void arrayprint(int array[]){
        int n= array.length;
        for(int i = 0;i<n;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println( );

    }


    public static void main(String[] args){
        kth_max_min obj  = new kth_max_min();
        int[] array = {3,2,5,4,9,10,8,100};
        int[] array1 = {-1};
        obj.kth_max_min(array,5,8);
        obj.arrayprint(array);
        System.out.println(obj.kth_max_min(array,5,8));

    }
}
