package factorial;

import java.util.Scanner;

public class MainFactorial {
    private static int recursion(int numb){
        int result=1;
        if(numb==1 || numb==0)
            return result;
        result=numb*recursion(numb-1);
        return result;
    }

    private static int loop(int numb){
        int result=1;
        for(int i = 1;i<=numb;i++)
            result=result*i;
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Print number: ");
        int n = scanner.nextInt();

        long startTime,estimatedTime;

        int value;
        startTime=System.nanoTime();
        value = recursion(n);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("Recursion "+n+"!: "+ value + " Time: "+estimatedTime);

        startTime=System.nanoTime();
        value = loop(n);
        estimatedTime=System.nanoTime()-startTime;
        System.out.println("Cycle "+n+"!: "+ value +" Time: "+estimatedTime);
    }
}
