public class minArray {
    public int minarray(int array[]){
        int j =0;
        int n = array.length;
        int min = array[j];
        if(array == null || n == 0){
            throw new IllegalArgumentException("Invalid input");
        }
        for(int i =1;i<n;i++){
            if(array[i]<min){
                min=array[i];
            }
        }
        System.out.println(min);
        return min;

    }
    public static void main(String[] args){
        minArray obj = new minArray();
        int a1[] = {1,23,45,10,34,100};
        int a2[] = new int[10];
        int a3[] = new int[0];
        a2[0]= 2;
        a2[1]= 21;
        a2[2]= 32;
        a2[3]= 1;
        a2[4]= 100;

        obj.minarray(a1);
        obj.minarray(a3);
    }

}
