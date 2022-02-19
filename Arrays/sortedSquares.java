public class sortedSquares {
    public int[] sortedSquares(int[] array){
        int n = array.length;
        int i =0;
        int j = n-1;
        int[] result = new int[n];
        for(int k = n-1;k>=0;k--){
            if(Math.abs(array[i])<Math.abs(array[j])){
                result[k] = array[j]*array[j];
                j--;

            }else{
                result[k] = array[i]*array[i];
                i++;
            }
        }return result;
    }
    public void arrayprint(int array[]){
        int n= array.length;
        for(int i = 0;i<n;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println( );

    }
    public static void main(String[] args){
        sortedSquares obj = new sortedSquares();
        int arr[] = {-9,-8,-6,7};

        obj.arrayprint(obj.sortedSquares(arr));
    }
}
