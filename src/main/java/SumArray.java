public class SumArray {

    public int sumArray(int[] arr){
        int sumArray = 0;
        if(arr.length != 0){
            for(int i = 0; i < arr.length; i++){
                sumArray += arr[i];
            }
        }
        return sumArray;
    }
}
