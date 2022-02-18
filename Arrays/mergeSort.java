public class mergeSort {
    public int[] sort(int[] arr,int temp[],int low,int high ){
        if(low<high){
            int mid = (low+high)/2;
            sort(arr,temp,low,mid);
            sort(arr,temp,mid+1,high);
            merge(arr,temp,low,mid,high);
        }
        return arr;
    }

    private void merge(int[] arr,int temp[], int low, int mid, int high) {
        int n = arr.length;
        for(int i=low;i<high;i++){
            temp[i] = arr[i];
        }
        int i=low;
        int j=mid+1;
        int k = low;

        while(i<=mid && j<=high){
                if(temp[i]>=temp[j]){
                    arr[k] = temp[j];
                    j++;
                }
                if(temp[i]<=temp[j]){
                    arr[k] = temp[i];
                    i++;
                }
                k++;
            }

        while(i<=mid){
            arr[k]= temp[i];
            i++;
            k++;
        }
        while(j<=high){
            arr[k]= temp[j];
            j++;
            k++;
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
        mergeSort obj = new mergeSort();

        int [] arr = {2,1,4,3,6,5};
        int n = args.length;
        int [] temp = new int[n];
        obj.sort(arr,temp,0,n-1);
        obj.arrayprint(arr);





    }
}
