public class Bai4 {
    public static void main(String[] args) {
        int stn=2;
      int count=1;
      while (count<=20){
          if(kiemtra(stn)){
              System.out.println(stn+","+count);
              count++;
          }
          stn++;
      }
    };
    public  static boolean kiemtra(int nunber){
        if (nunber<=1){
            return false;
        }
        for (int i=2;i*i<=nunber;i++){
            if(nunber%i==0){
                return false;
            }
        }
        return true;
    }
}
