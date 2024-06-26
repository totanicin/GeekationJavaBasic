package basicSyntax;

public class IfSwitch {

    public static void main(String[] args) {
        // int型変数numの定義と値の代入
        int num = 8;
        if (num % 2 == 0) {
            System.out.println("2の倍数です。");
        } else if (num % 3 == 0) {
            System.out.println("3の倍数です。");
        } else {
            System.out.println("どちらでもありません。");
        }
        
        // String型変数prefの定義と値の代入
        String pref = "京都";
        switch (pref) {
            case "北海":
                System.out.println("北海道");
                break;
            case "東京":
                System.out.println("東京都");
                break;
            case "京都":
                System.out.println("京都府");
                break;
            default:
                System.out.println("当てはまりません。");
                break;
        }
    }
}
