package simpleArrays;

import java.util.Arrays;

public class SimpleArrays {
    public static void reverse(int[] a){
        for(int i=0;i<a.length/2;i++){
            int temp=a[i];
            a[i]=a[a.length-i-1];
            a[a.length-i-1]=temp;
        }
    }
    public static void main(String[] args) {
        System.out.println("\na Создать массив нечётных чисел от 1 до 99 и вывести их в порядке возрастания и убывания");
        int[] a=new int[50];
        for(int i=0;i<50;i++){
            a[i]=i*2+1;
        }
        System.out.println(Arrays.toString(a));
        reverse(a);
        System.out.println(Arrays.toString(a));

        System.out.println("\nb. Создать массив из 20 случайных чисел лежащих в отрезке [0;10]. Вывести массив на экран.");
        System.out.println("Подсчитать и вывести на экран количество чётных и нечётных элементов в массиве.");
        int[] b = new int[20];
        for(int i =0;i<b.length;i++){
            b[i]=(int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(b));

        int even=0;
        int odd=0;
        for(int i=0;i<20;i++){
            if(b[i]%2==0)
                odd++;
            else even++;
        }
        System.out.println("Amount of even number: "+even+", odd number: "+odd);

        System.out.println("\nc. Создайте массив из 10 случайных целых чисел на  отрезке [1;100]. Выведите массив на экран в ");
        System.out.println("строку. Замените каждый элемент с нечётным индексом на ноль. Выведите новый результат на ");
        System.out.println("экран.");
        int[] c = new int[10];
        for(int i=0;i<c.length;i++){
            c[i]=(int)(Math.random()*100+1);
        }
        System.out.println(Arrays.toString(c));
        int ch=0;
        for(int i=0;i<c.length;i++){
            if(c[i]%2==1)
                c[i]=0;
        }
        System.out.println(Arrays.toString(c));

        System.out.println("\nd. Создайте массив из 15 случайных целых чисел из отрезка [-50;50]. Найдите максимальный и");
        System.out.println("минимальный элемент массива. Выведите их значения на экран и также индекс последнего");
        System.out.println("вхождения элемента в массив.");
        int[] d = new int[15];
        for(int i=0;i<d.length;i++){
            d[i]=(int)(Math.random()*100+1-50);
        }
        System.out.println(Arrays.toString(d));

        int min=50;
        int max=-50;
        int min_ind=0,max_ind=0;
        for(int i=0;i<d.length;i++){
            if(d[i]<=min){
                min=d[i];
                min_ind=i;
            }
            if(d[i]>=max){
                max=d[i];
                max_ind=i;
        }}
        System.out.println("Max element: "+max+" his number "+max_ind+" Min element: "+min+" his number "+min_ind);

        System.out.println("\ne. Создайте два  массива из 10 случайных целых чисел в отрезке [0;10]. выведите массивы.");
        System.out.println("Вычислите среднее арифметическое элементов каждого массива и сообщите, для какого из");
        System.out.println("массивов это значение оказалось больше (либо сообщите, что они равны).");
        int[] e1 = new int[10];
        int[] e2 = new int[10];
        for(int i=0;i<e1.length;i++){
            e1[i]=(int)(Math.random()*10);
            e2[i]=(int)(Math.random()*10);
        }
        System.out.println(Arrays.toString(e1));
        System.out.println(Arrays.toString(e2));
        double average1=0;
        double average2=0;
        for(int i=0;i<e1.length;i++){
            average1=average1+e1[i];
        }
        average1=average1/e1.length;
        System.out.println("Average of array 1: "+average1);

        for(int i=0;i<e2.length;i++){
            average2=average1+e2[i];
        }
        average2=average2/e2.length;
        System.out.println("Average of array 2: "+average2);

        if(average1==average2){
            System.out.println("Averages of arrays equals");
        } else if(average1>average2){
            System.out.println("Average of array 1 > Average of array 2");
        } else System.out.println("Average of array 1 < Average of array 2");

        System.out.println("\nf. Создайте массив из 20 случайных целых чисел в отрезке [-1;1] Определите какой элемент");
        System.out.println("встречается в массиве чаще всего и выведите его на экран. Также если несколько элементов");
        System.out.println("встречаются одинаковое количество раз, необходимо их вывести на экран.");
        int[] f = new int[20];
        int RepDis1=0, Rep0=0,Rep1=0;
        for(int i=0;i<f.length;i++){
            f[i]=(int)(Math.random()*3)-1;

            if(f[i]<0)RepDis1++;
            if(f[i]==0)Rep0++;
            if(f[i]>0)Rep1++;
        }
        System.out.println(Arrays.toString(f));
        if(RepDis1>Rep0&RepDis1>Rep1)
            System.out.println("Most frequent: -1 "+RepDis1);
        if(Rep0>RepDis1&Rep0>Rep1)
            System.out.println("Most frequent: 0 "+Rep0);
        if(Rep1>Rep0&Rep1>RepDis1)
            System.out.println("Most frequent: 1 "+Rep1);

    }
}
