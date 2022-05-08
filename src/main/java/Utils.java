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

        if (arr.length != 0) {
            for (int i = 0; i < arr.length; i++) {
                aveNumber += arr[i];

            }
            return aveNumber / arr.length;
        } else {
            return aveNumber;
        }
    }

    public static int[] removeSameNumber(int[] arr) {
        int[] arrTemp;
        int coutSameNumbers = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length - i; j++) {
                if (arr[i] == arr[j] && arr[i] != Integer.MIN_VALUE) {
                    arr[j] = Integer.MIN_VALUE;
                    coutSameNumbers++;
                }
            }
        }
        arrTemp = new int[arr.length - coutSameNumbers];
        int countNewArray = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != Integer.MIN_VALUE) {
                arrTemp[countNewArray] = arr[i];
                countNewArray++;
            }
        }
        return arrTemp;
    }

    public static int[] reversArray(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        int[] tempArray = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tempArray[i] = arr[arr.length - i - 1];
        }
        return tempArray;
    }
}
