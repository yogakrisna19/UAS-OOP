import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String ulang = "ya";
        
        while("ya".equals(ulang)) {
            System.out.println("=====================================");
            System.out.println("Program penjumlahan item di warung");
            System.out.println("=====================================");
            System.out.println("Pilih : ");
            System.out.println("1.Makanan + minuman");
            System.out.println("2.Selesai");
            System.out.print("Pilihan : ");
            String pil = input.next();

            switch (pil) {
                case "1":
                    MM2.makan();
                    MM2.minum();

                    System.out.println("Total pembelian adalah :"+ MM.jumlah);
                    break;

                case "2" :
                    System.out.println("Terima kasih");
                    ulang = "tidak";
                    break;
            }
        }


    }
}
