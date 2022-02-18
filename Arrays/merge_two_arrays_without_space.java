public class merge_two_arrays_without_space {
    public void merge_two_arrays_without_space(int[] arr1,int [] arr2,int n,int m){
        int total=n+m;
        System.out.println(total);
        int[] temp = new int[total];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i<n && j<m){
            if(arr1[i]<arr2[j]){
                temp[k]= arr1[i];
                i++;
            }

            else{
                temp[k]= arr2[j];
                j++;

            }
            k++;

        }
        while(j<m){
            temp[k]=arr2[j];

            j++;
            k++;
        }
        while(i<n){
            temp[k]=arr1[i];

            i++;
            k++;
        }

        for(int h = 0;h<total;h++){
            System.out.print(temp[h]+"\t");
        }System.out.println( );
        for(int a1=0;a1<n;a1++){
            arr1[a1]=temp[a1];
        }
        for(int h = 0;h<n;h++){
            System.out.print(arr1[h]+"\t");
        }System.out.println( );
        for(int a2=total-1;a2>=n;a2--){

            arr2[a2-n]=temp[a2];
        }
        for(int h = 0;h<m;h++){
            System.out.print(arr2[h]+"\t");
        }System.out.println( );
    }
    public void arrayprint(int array[]){
        int n= array.length;
        for(int i = 0;i<n;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println( );

    }
    public static void main (String[] args){
        merge_two_arrays_without_space obj = new merge_two_arrays_without_space();

        int [] a1 = {1,3};
        int [] a2 = {2,4,6};
        obj.merge_two_arrays_without_space(a1,a2,2,3);


    }
}
