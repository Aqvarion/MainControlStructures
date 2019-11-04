package sort;

import com.sun.tools.javac.Main;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class MainSort {

    private static void toSwap(int[] ar, int first, int second){
        int temp = ar[first];
        ar[first]=ar[second];
        ar[second]=temp;
    }

    public static void bubbleSorter(int[] a){
        boolean mark = true;
        while(mark){
            mark = false;
            for (int i = 1; i < a.length; i++){
                if(a[i] < a[i - 1]) {
                    toSwap(a, i, i - 1);
                    mark = true;
                }
            }
        }
    }

    public static void bubbleDecreaseSorter(int[] a){
        boolean mark = true;
        while(mark){
            mark = false;
            for (int i = 1; i < a.length; i++){
                if(a[i] > a[i - 1]) {
                    toSwap(a, i, i - 1);
                    mark = true;
                }
            }
        }
    }

    public static void selectionSort(int[] a){
        for(int left = 0;left<a.length-1;left++){
            int minInd =left;
            for(int i=left;i<a.length;i++) {
                if (a[i] < a[minInd]){
                    minInd = i;
                }
            }
            toSwap(a,left,minInd);
        }
    }

    public static void main(String[] args) {

        long estimatedTime,startTime;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Print amount of elements ");
        int n = scanner.nextInt();

        int[] myArray = new int[n];
        MainSort ms = new MainSort();

        for(int i=0;i<myArray.length;i++){
            myArray[i] = (int)(Math.random()*10);
        }
        System.out.println("Array before sort: "+Arrays.toString(myArray));

        int[] tempArray = Arrays.copyOf(myArray,n);
        startTime = System.nanoTime();
        bubbleSorter(tempArray);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("Array after BubbleSort: "+Arrays.toString(tempArray)+" Time: "+estimatedTime);

        tempArray = Arrays.copyOf(myArray,n);
        startTime = System.nanoTime();
        selectionSort(tempArray);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("Array after SelectionSort: "+Arrays.toString(tempArray)+" Time: "+estimatedTime);

        tempArray = Arrays.copyOf(myArray,n);
        startTime = System.nanoTime();
        Arrays.sort(tempArray);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("Array after Arrays.sort(): "+Arrays.toString(tempArray)+" Time: "+estimatedTime);
    }
}
