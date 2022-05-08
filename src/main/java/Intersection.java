public class Intersection {

    public int[] intersection(int[] arrFerst, int[] arrSecond){
        int[] arr1 = Utils.removeSameNumber(arrFerst);
        int[] arr2 = Utils.removeSameNumber(arrSecond);

        int countNewArray = 0;
        int[] arrTepmp = new int[arr1.length];

        if (arr1.length != 0 && arr2.length != 0) {
            for(int i = 0; i < arr1.length; i++){
                for(int j = 0; j < arr2.length; j++){
                    if(arr1[i] == arr2[j]){
                        arrTepmp[countNewArray] = arr1[i];
                        countNewArray++;
                    }
                }
            }
            int[] arrayResult = new int[countNewArray];
            for(int i = 0; i < arrayResult.length; i++){
                arrayResult[i] = arrTepmp[i];
            }

            return arrayResult;
        } else {
            return new int[]{};
        }
    }
}
