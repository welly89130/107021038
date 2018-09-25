import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入國文、英文和數學成績(中間用空格區別)");//讓使用者輸入的地方，中間用空格區隔
        int a = scn.nextInt();//接收使用者輸入的數值
        int b = scn.nextInt();//接收使用者輸入的數值
        int c = scn.nextInt();//接收使用者輸入的數值
        int d = a+b+c;
        System.out.println("總分為:"+ d);
        System.out.println("平均為:"+ (a+b+c)/3);

    }
}