package com.pbo;

import java.util.Locale;

/*
 * #Author
 * Name  : Agung Sepruloh
 * Class : IF-11K
 * NIM   : 10118902
 * Deskripsi program: program ini menampilkan saldo tabungan perbulan hingga saldo tabungan mencapai Rp 6.000.000
 *
 */

public class TargetSaldoTabungan {

    public static void main(String[] args) {
        int saldoAwal = 3500000;
        int saldoAkhir = saldoAwal;
        int i = 1;
        while (saldoAkhir <= 6000000) {
            System.out.print("Saldo di bulan ke-".concat(String.valueOf(i++)));
            saldoAkhir += (saldoAkhir * 8 / 100);
            System.out.println(String.format(Locale.ROOT, " Rp %,3d",  saldoAkhir).replace(",", "."));
        }
    }
}