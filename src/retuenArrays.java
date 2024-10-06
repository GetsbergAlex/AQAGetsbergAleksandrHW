public class retuenArrays {
    public static void main(String args[]) {
        returnArrey(5,34);
    }

    public static void returnArrey(int len,int initialValue){
        int[] arr2 =new int[len];
        for (int i=0;i<len;i++){
            arr2[i] =initialValue;
            System.out.println(arr2[i]);

        }
        System.out.println();
    }
}
