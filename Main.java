public class Main {
    public static void main(String[] args) {
        carpim_tablosu(10,9);

    }

    static void carpim_tablosu(int basla, int bitir) {
        if(basla<=bitir) {
            for (int i = basla; i <= bitir; i++) {
                for (int j = 1; j <= 10; j++) {
                    System.out.println(i + " x " + j + "=" + i * j);
                }

            }
        }else {
            System.out.println("Hatalı bir giriş yaptınız");
        }
    }
}