import java.util.Arrays;

public class missingNumberInArray {
    public void missingNumberInArray(int[] array){
        int n1 = array.length;
        int n = array.length+1;

        int sum = (n*(n+1))/2;
        System.out.println(sum);
        for(int i =0;i<n1;i++){
            sum = sum - array[i];
        }
       System.out.println(sum);
    }
    public static void main(String[] args){
        missingNumberInArray obj = new missingNumberInArray();
        int array[] = {1,2,3,4,6};
        obj.missingNumberInArray(array);

    }
}

