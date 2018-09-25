import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("請輸入三角形三邊長(中間用空格區別)");//讓使用者輸入的地方，中間用空格區隔
        int x = scn.nextInt();//接收使用者輸入的數值
        int y = scn.nextInt();//接收使用者輸入的數值
        int z = scn.nextInt();//接收使用者輸入的數值
        if(x + y <= z){
            System.out.println("False");
        }else if(x + z <= y){
            System.out.println("False");
        }else if(y + z <= x){
            System.out.println("False");
        }else{
            System.out.println("True");
        }
    }
}