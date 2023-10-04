import java.util.Scanner;

public class Bài2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int hinh=scanner.nextInt();
        for (int i=0;i<hinh;i++){
            for ( int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
