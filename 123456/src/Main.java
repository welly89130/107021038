import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("請輸入身高(cm)、體重(kg)(中間用空格區別)");//讓使用者輸入的地方，中間用空格區隔
        float a = scn.nextFloat();//接收使用者輸入的數值
        float b = scn.nextFloat();//接收使用者輸入的數值
        System.out.println("身高(英吋):"+ a/2.54 );
        System.out.println("體重(磅):"+ b/0.454 );

    }}