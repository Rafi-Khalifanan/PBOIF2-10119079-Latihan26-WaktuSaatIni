package pboif2.pkg10119079.latihan26.waktusaatini;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan A
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:   codingan waktu saat ini
 *
 */

public class PBOIF210119079Latihan26WaktuSaatIni {

    public static void main(String[] args) {
    
        LocalDateTime time = LocalDateTime.now();
        DateTimeFormatter memformat = DateTimeFormatter.ofPattern("EEEE, MMM dd yyyy HH:mm:ss");
        
        String formatter = time.format(memformat);
        System.out.println("Hari ini adalah hari : "+formatter);
        
    }
    
}
