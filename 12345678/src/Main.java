import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("閏年");
        System.out.print("請輸入西元年分1~3000(中間用空格區別)");//讓使用者輸入的地方，中間用空格區隔
        int y = scn.nextInt();//接收使用者輸入的數值
        if((y%4==0&&y%100!=0)||y%400==0){
            System.out.println(y+"True");
        }else{
            System.out.println(y+"False");
        }

    }
}