import java.util.Scanner;

public class bai1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập chiều cao: ");
        int height = scanner.nextInt();
        System.out.print("Nhập chiều rộng: ");
        int width = scanner.nextInt();

        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                System.out.print("*");
            }
            System.out.println(); // Xuống dòng sau khi vẽ xong một hàng
        }
    }
}

