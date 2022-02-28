
public class App {
    public static void main(String[] args) throws Exception {
        int RowStar = 4;
        for (int i = 0; i < RowStar; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
