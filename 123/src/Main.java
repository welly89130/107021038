import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int c = scn.nextInt();//接收使用者輸入的數值
        float f=c*5/9+32;
        System.out.println("華氏溫度="+f+"\t度");
        System.out.println("攝氏溫度=" +c+"度");
    }
}