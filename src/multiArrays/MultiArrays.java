package multiArrays;

import sort.MainSort;

import java.util.Arrays;

public class MultiArrays {
    public static void main(String[] args) {
        System.out.println("a. Создать двумерный массив размером 8 на 8. Заполнить его случайными числами в диапазоне");
        System.out.println("[1;99] Вычислить и вывести на экран сумму и произведение элементов главной и побочной");
        System.out.println("диагонали");
        int size = 8;
        int sumMainD=0,sumSideD=0;
        int[][] a = new int[size][size];
        for(int i=0;i<size;i++) {
            for (int j = 0; j < size; j++) {
                a[i][j] = (int) (Math.random() * 100);
                if (i == j) sumMainD+=a[i][j];
                if(i==size-1) sumSideD+=a[i][j];
            }
        }
        System.out.println(Arrays.deepToString(a));
        System.out.println("Sum of main diagonal = "+sumMainD+" Sum pf side diagonal = "+sumSideD);

        System.out.println("\nb. Создать двумерный массив из 8 строк и 5 столбцов. Заполнить его случайными числами в ");
        System.out.println("отрезке [-99;99]. Вывести массив на экран.  Вывести на экран значение и индексы максимального ");
        System.out.println("(по всем строкам и столбцам) элемента в массиве. ");
        int sizeRow = 8,sizeCol=5;
        int max=-100;
        String str ="";
        int[][] b = new int[sizeRow][sizeCol];
        for(int i=0;i<sizeRow;i++) {
            for (int j = 0; j < sizeCol; j++) {
                b[i][j] = (int) ((Math.random()*(99-(-99)))-99);
                if(b[i][j]>max){
                    max=b[i][j];
                    str="";
                    str=str+"["+i+","+j+"] ";
                }else if(b[i][j]==max)
                    str=str+"["+i+","+j+"] ";

            }
        }
        System.out.println(Arrays.deepToString(b));
        System.out.println("Max element: "+max+" and his indices: "+str);

        System.out.println("\nc. Cоздать двумерный массив из 8 строк и 5 столбцов из случайных целых чисел в отрезке [-10;10].");
        System.out.println("Вывести массив на экран. Определить и вывести  на экран индекс строки с наибольшим по модулю");
        System.out.println("произведением элементов.");
        int maxAbs=-100001,temp=1,indexMax=-1;
        int[][] c = new int[sizeRow][sizeCol];
        for(int i=0;i<sizeRow;i++) {
            for (int j = 0; j < sizeCol; j++) {
                c[i][j] = (int) ((Math.random()*(10-(-10)))-10);
                temp*=c[i][j];

            }
            if(temp>maxAbs){
                maxAbs=Math.abs(temp);
                indexMax=i;
            }
            temp=1;
        }
        System.out.println(Arrays.deepToString(c));
        System.out.println("Row index "+indexMax+" Max product "+maxAbs);

        System.out.println("\nd. Создать двумерный массив из 10 строк и 7 столбцов из целых чисел в отрезке [0;100]. Вывести ");
        System.out.println("массив на экран. Отсортировать каждую строку в порядке убывания. Вывести преобразованный ");
        System.out.println("массив на экран.");
        sizeRow=10;
        sizeCol=7;
        int[][] d = new int[sizeRow][sizeCol];
        for(int i=0;i<sizeRow;i++) {
            for (int j = 0; j < sizeCol; j++) {
                d[i][j] = (int) (Math.random()*100);
            }
            MainSort.bubbleDecreaseSorter(d[i]);
        }
        System.out.println(Arrays.deepToString(d));
    }
}
