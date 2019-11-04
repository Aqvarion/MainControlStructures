package nestedLoop;

public class MainLoop {
    public static void main(String[] args) {
        int size=5;
        for(int row=1;row<=size;++row){
            for(int col=1;col<=size;++col)
                System.out.print("#");
            System.out.println();
        }
        System.out.println();

        size=8;
        for(int row=1;row<=size;row++){
            for(int col=1;col<=row;col++)
                System.out.print("#");
            System.out.println();
        }
        System.out.println();

        size=7;
        for(int row=1;row<=size;row++){
            for(int col=1;col<=size;col++)
                if(col==1||col==size||row==1||row==size){
                System.out.print("#");
                }else System.out.print(" ");
            System.out.println();
        }
    }
}
