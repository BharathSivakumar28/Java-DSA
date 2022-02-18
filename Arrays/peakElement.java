public class peakElement {

        // Function to find the peak element
        // arr[]: input array
        // n: size of array a[]
        public void peakElement(int[] arr)
        { int n = arr.length;
            if(n == 1){
                System.out.println(arr[0]);
            }if(n>=2){
            if(arr[0]>arr[1]){
                System.out.println(arr[0]);
            }
            if(arr[n-1]>arr[n-2]){
                System.out.println(arr[n-1]);
            }
            for(int i =1;i<n-1;i++){
                if(arr[i]>arr[i + 1] && arr[i]>arr[i - 1])
                    {
                        System.out.println(arr[i]);
                    }

            }}
        }
    public void arrayprint(int array[]){
        int n= array.length;
        for(int i = 0;i<n;i++){
            System.out.print(array[i]+"\t");
        }
        System.out.println( );

    }
        public static void main(String[] args){
            peakElement obj  = new peakElement();
            int[] array = {3,2,5,4,9,10,8,100};
            int[] array1 = {-1};

           obj.arrayprint(array);
            obj.peakElement(array);
            obj.peakElement(array1);
        }
}

