import java.util.Scanner;
public class Money {
    public static void main(String[] args) {

        double vnd = 23000;
        double usd;
        Scanner sc = new Scanner(System.in);
        System.out.print("nhập số tiền usd :");
        usd = sc.nextDouble();
        double quydoi = usd * 23000;
        System.out.print("giá trị vnd: " + quydoi);
    }

}
