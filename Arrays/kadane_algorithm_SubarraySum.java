public class kadane_algorithm_SubarraySum {
    public int kadane_algorithm_SubarraySum(int array[]){
        int maxsofar  = array[0];
        int current_max = array[0];
        int n= array.length;
        for(int i=0;i<n;i++){
            current_max=current_max+array[i];
            if(current_max<array[i]){
                current_max=array[i];
            }
            if(maxsofar<current_max){
                maxsofar=current_max;
            }
        }return maxsofar;
    }
    public static void main (String[] args){
        kadane_algorithm_SubarraySum obj = new kadane_algorithm_SubarraySum();

        int [] a1 = {1,2,3,4,5,-16,-8,-9,-1,0,1,2,3,100};

       System.out.println( obj.kadane_algorithm_SubarraySum(a1));



    }
}
