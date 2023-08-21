import java.util.Scanner;;

class JavaAPp {
    static void pickFood() {
        String[] makanan = {"Nasi Goreng", "Ayam Goreng", "Mie Ayam"};
        int[] harga = {12000, 10000, 12000};

        System.out.println("\nDaftar pilihan makanan yang tersedia: ");
        for (int i = 0; i < makanan.length; i++) {
            System.out.println(makanan[i] + " - Rp." + harga[i]);
        }
    };
    static void pickDrink() {
        String[] minuman = {"Es Teh Manis", "Jus Jeruk"};
        int[] harga = {5000, 8000};

        System.out.println("\nDaftar pilihan minuman yang tersedia: ");
        for (int i = 0; i < minuman.length; i++) {
            System.out.println(minuman[i] + " - Rp." + harga[i]);
        }
    };

    public static void main(String[] args) {
        String option;
        Scanner inputUser = new Scanner(System.in);

        System.out.println("A. Makanan \nB. Minuman");
        System.out.print("Masukan pilihan: ");
        option = inputUser.nextLine();

        if (option.equals("A")) {
            pickFood();
        } else {
            pickDrink();
        }
        inputUser.close();

    }
}