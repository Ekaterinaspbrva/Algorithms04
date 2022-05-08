public class Utils {
    public static int minNumber(int[] arr){
        int minNumber = 0;

        if(arr.length != 0){
            minNumber = arr[0];
            for(int i = 0; i < arr.length - 1; i++){
                if(arr[i] < minNumber){
                    minNumber = arr[i];
                }
            }
            return minNumber;
        }else {
            return minNumber;
        }
    }
    public static int maxNumber(int[] arr){
        int maxNumber = 0;

        if(arr.length != 0){
            maxNumber = arr[0];
            for(int i = 0; i < arr.length; i++){
                if(arr[i] > maxNumber){
                    maxNumber = arr[i];
                }
            }
            return maxNumber;
        }else {
            return maxNumber;
        }
    }

    public static int aveNumber(int[] arr){
        int aveNumber = 0;

        if(arr.length != 0){
            for(int i = 0; i < arr.length; i++){
                aveNumber += arr[i];

            }
            return aveNumber / arr.length;
        }else {
            return aveNumber;
        }
    }
}
