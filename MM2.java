import java.util.Scanner;

public class MM2 extends  MM {
    static Scanner input = new Scanner(System.in);


     public static void makan() {
         System.out.println("Pilih makanan yang kamu beli :");
         System.out.println("1.Oliver (Rp.5000)");
         System.out.println("2.Mie sedap(Rp.8000");
         System.out.println("3.kerupuk melinjo(Rp.2000");
         int pil = input.nextByte();

         if (pil == 1) {
              makanan = 5000;
         } else if (pil == 2) {
              makanan = 8000;
         } else if (pil == 3) {
              makanan = 2000;
         } else {System.out.println("Makanan tak tersedia ");}

     }

     public static void minum() {
         System.out.println("Pilih minuman yang kam beli : ");
         System.out.println("1.Es ExtraJoss ");
         System.out.println("2.Jus alpukat ");
         System.out.println("3.Coca-cola");
         int pil = input.nextByte();

         if (pil == 1){
              minuman = 5000;
         }
         else if(pil == 2){
              minuman = 7000;
         }
         else if(pil == 3){
              minuman = 4000;
         }
         else{ System.out.println("Minuman tak tersedia");}

    }


}
