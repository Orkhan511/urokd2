package lesson2;

public class Lesson2 {
    public static void main(String[] args) {
        /*1.Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ].
         С помощью цикла и условия заменить 0 на 1, 1 на 0;*/
        System.out.println("\r\n1 - задание");
        int[] arr1 = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = arr1[i] == 1 ? 0 : 1;
            System.out.print(arr1[i] + " ");
        }

        /*2.Задать пустой целочисленный массив размером 8. С помощью цикла
        заполнить его значениями 0 3 6 9 12 15 18 21;*/

        System.out.println("\r\n2 - задание");
        int[] arr2 = new int[8];
        for (int i = 1, j = 0; i < arr2.length; i++) arr2[i] = j += 3;
        for (int x : arr2) System.out.print(x + " ");

        /*3.Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом,
         и числа меньшие 6 умножить на 2;;*/

        System.out.println("\r\n3 - задание");
        int[] arr3 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] < 6) arr3[i] *= 2;
            System.out.print(arr3[i] + " ");


        }
        /*4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
        и с помощью цикла(-ов) заполнить его диагональные элементы единицами;*/
        System.out.println("\r\n4 - задание");
        int[][] arr = new int[4][4];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");


        }
        // 5.** Задать одномерный массив и найти в нем минимальный и максимальный элементы
        System.out.println("\r\n5 - задание");
        int nums[] = new int[10];
        int min, max;

        nums[0] = 75;
        nums[1] = -30;
        nums[2] = 3000;
        nums[3] = 8;
        nums[4] = -222;
        nums[5] = 4333;
        nums[6] = 315;
        nums[7] = -9;
        nums[8] = 100;
        nums[9] = 50;

        min = max = nums[0];
        for (int i = 1; i < 10; i++) {
            if (nums[i] < min) min = nums[i];
            if (nums[i] > max) max = nums[i];
        }
        System.out.println("min: " + min + " " + "max: " + max);

    }
}
