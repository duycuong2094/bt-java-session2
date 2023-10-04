public class Bài3 {
    public static void main(String[] args) {
        for (int stn=2;stn<100;stn++){
            if (kiemtra(stn)){
                System.out.println(stn+"");
            }
        }
    }
    public  static boolean kiemtra(int number){
        if (number<=1){
            return false;
        }
        for (int i=2;i*i<=number;i++){
            if (number%i==0){
                return false;
            }
        }
        return true;
    }
}
