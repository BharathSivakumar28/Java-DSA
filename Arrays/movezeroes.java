public class movezeroes {
    public void movezeroes(int array[]){
        int n = array.length;
        int j= 0;
        for(int i =0;i<n;i++){
            if(array[i]!=0 && array[j]==0){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
            if(array[j]!=0){
                j++;
            }
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
        movezeroes obj = new movezeroes();

        int [] a1 = {0,1,1,2,3,0,0,2};
        obj.movezeroes(a1);
        obj.arrayprint(a1);

    }
}

