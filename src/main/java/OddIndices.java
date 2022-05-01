public class OddIndices {

    //    Написать алгоритм OddIndices, который принимает массив чисел,  и возвращает массив значений
//    нечетных индексов
    public int[] oddIndices(int[] array) {

        int countArraysLenghts = countArraysLenghts = array.length / 2;

        int[] arrayRessult = new int[countArraysLenghts];
        int indexCount = 0;

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                arrayRessult[indexCount++] = array[i];
            }
        }

        return arrayRessult;

    }
}
