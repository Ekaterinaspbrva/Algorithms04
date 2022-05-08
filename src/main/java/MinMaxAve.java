

public class MinMaxAve {

//    8.	Написать алгоритм MinMaxAve, который принимает массив чисел int[]  и 2 значения индексов.
//    Алгоритм возвращает массив, который содержит минимальное значение, максимальное значение,
//    и среднее среди всех значений между 2-мя индексами.
//
//    Test Data:
//            ({1, 2, 3, 4, 5, 6, 7, 8}, 2, 6) →  {3, 7, 5}

    public int[] minMaxAve(int [] arr, int first, int last){
        if(first < 0 || last < 0 || first >= last || last > arr.length || arr.length == 0){
            return new int[]{};
        }
//        int min;
//        int max;
//        int mid;
        int[] temptArray = new int[last - first + 1];

        for(int i = 0; i < last - first + 1; i++){
            temptArray[i] = arr[i + first];
        }
        int min = Utils.minNumber(temptArray);
        int max = Utils.maxNumber(temptArray);
        int ave = Utils.aveNumber(temptArray);

        int[] resultArray = new int[]{min, max, ave};

        return resultArray;
    }
}
