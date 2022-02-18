public class palidrome_using_array {
    public boolean palidrome(String word){
        char[] array = word.toCharArray();
        int start = 0;
        int end = array.length-1;
        while(start<end){
            if(array[start] != array[end] ){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main (String[] args){
        palidrome_using_array obj = new palidrome_using_array();

        int [] a1 = {0,1,1,2,3,0,0,2};
        boolean result= obj.palidrome("bharath");
        System.out.println(result);
        System.out.println(obj.palidrome("madam"));
        System.out.println(obj.palidrome("malayalam"));
        System.out.println(obj.palidrome("palindrome"));


    }
}
