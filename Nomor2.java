import java.util.Scanner;

public class Nomor2 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        /* Pekerjaan anda mulai dari sini */
        String[] namaBuku = {"Sherlock Holmes", "Arsene Lupin", "Game of Throne", "Psychology of Money"};
        int[] hargaBuku = {350000, 450000, 500000, 95000};

        System.out.println("Daftar Buku: ");
        for (int i = 0; i < namaBuku.length; i++) {
            System.out.println(namaBuku[i] + " " + hargaBuku[i]);
        }

        ArrayList<Integer> hargaBelanja = new ArrayList<>();
        while (true) {
            System.out.print("Masukan pilihan buku [1/2/3/4]: ");
            int pilihan = input.nextInt();
            hargaBelanja.add(hargaBuku[pilihan - 1]);
            input.nextLine();
            System.out.print("Input lagi (Y/N)?:");
            String jawaban = input.nextLine();
            if (jawaban.equalsIgnoreCase("N")) {
                break;
            }
        }
        
        int totalHarga = hitungTotalHarga(hargaBelanja);
        int voucherBelanja = hitungVoucherBelanja(totalHarga);
        System.out.println("Total voucher belanja = " + voucherBelanja);
        System.out.println("Total yang harus dibayar = " + (totalHarga - voucherBelanja));

        System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }

    public static int hitungTotalHarga(ArrayList<Integer> hargaBelanja) {
        int totalHarga = 0;
        for (int harga : hargaBelanja) {
            totalHarga += harga;
        }
        return totalHarga;
    }

    public static int hitungVoucherBelanja(int totalHarga) {
        if (totalHarga < 200000) {
            return 0;
        } else if (totalHarga >= 200000 && totalHarga <= 500000) {
            return 50000;
        } else if (totalHarga > 500000 && totalHarga <= 750000) {
            return 100000;
        } else if (totalHarga > 750000 && totalHarga <= 1000000) {
            return 150000;
        } else {
            return 200000;
        }
        /* Pekerjaan anda berakhir sini */

        System.out.println(Nomor2.class.getDeclaredMethods().length); 
    }
}
