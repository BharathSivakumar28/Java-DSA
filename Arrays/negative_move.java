public class negative_move {
    public void negative_move(int array[]){
        int n = array.length;
        int j= 0;

        for(int i =0;i<n;i++){
            if(array[i]<0){
                if(i!=j){
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;

                }j++;


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
        negative_move obj = new negative_move();

        int [] a1 = {9,-1,1,2,-3,10,0,-2};
        obj.negative_move(a1);
        obj.arrayprint(a1);

    }
}
