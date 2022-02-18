import java.util.Arrays;

public class twosumproblem {
    public int[] twosumproblem(int[] array,int target){
        int n= array.length;
        Arrays.sort(array);
        int result[] = new int[2];
        int i=0;
        int j=n-1;
        while(i<j){
            int sum=array[i]+array[j];
            if(sum>target){
                j--;
            }
            else if(sum<target){
                i++;
            }
            else if(sum==target){
                result[0]=array[i];
                result[1]=array[j];
                return result;
            }
        }
        return new int[0];
    }
    public static void main (String[] args){
        twosumproblem obj = new twosumproblem();

        int [] a1 = {1,2,3,4,5};

        int [] result =obj.twosumproblem(a1,5);
        int n= result.length;
        for(int i = 0;i<n;i++){
            System.out.print(result[i]+"\t");
        }
        System.out.println( );


    }
}
