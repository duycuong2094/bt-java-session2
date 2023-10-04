public class Bài5 {
    public static void main(String[] args) {
        int sochia=1;
        boolean kiemtra=false;
        while (!kiemtra){
            if(sochia%5==0&&sochia%7==0){
                System.out.println(sochia);
                kiemtra=true;
            }
            sochia++;
        }
    }
}
