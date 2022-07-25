import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double vnd, usd;
        String change1, change2;
        System.out.println("nhập loại tiền cần đổi(usd || vnd)");
        change1 = scanner.nextLine();
        System.out.println("Nhập loại tiền muốn đổi (usd || vnd)");
        change2 = scanner.nextLine();
        if (change1.equals("vnd") && change2.equals("vnd")){
            System.out.println("Nhập sô tiền");
            vnd = scanner.nextDouble();
            System.out.println("Số tiền là "+ vnd + " VND");
        } else
        if (change1.equals("vnd") && change2.equals("usd")){
            System.out.println("Nhập số tiền");
            usd = scanner.nextDouble();
            System.out.println("Số tiền là "+ usd/23000 + " USD");
        } else
        if (change1.equals("usd") && change2.equals("vnd")) {
            System.out.println("Nhập số tiền");
            vnd = scanner.nextDouble();
            System.out.println("Số tiền là " + vnd * 23000 + " VND");
        } else
        if (change1.equals("usd") && change2.equals("usd")){
            System.out.println("Nhập sô tiền");
            usd = scanner.nextDouble();
            System.out.println("Số tiền là "+ usd + " USD");
        }
    }
}
