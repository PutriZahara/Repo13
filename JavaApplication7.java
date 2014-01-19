import java.util.Scanner;


public class JavaApplication7 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Masukkan berapa banyak nilai yang akan dihitung ? ");
        int jml = sc.nextInt();
        
        int[] arrays = new int[jml];
        for(int i = 0; i < arrays.length; i++) {
            System.out.println("Masukkan nilai ke-" + (i+1));
            arrays[i] = sc.nextInt();
        }
        
        int nilaiRataRata = hitungRataRata(arrays);
        System.out.println("Rata-rata dari nilai yang dimasukkan adalah : " + nilaiRataRata);
        System.out.println("Grade dari nilai rata-rata tersebut adalah : " + menentukanGrade(nilaiRataRata));
        
    }
    
    private static int hitungRataRata(int[] semuaNilai) {
        int jumlah = 0;

        for (int i = 0; i < semuaNilai.length; i++) {
            jumlah += semuaNilai[i];
        }
        
        int nilaiRata;
        nilaiRata = jumlah / (semuaNilai.length);
        
        return nilaiRata;
    }
    
    private static String menentukanGrade(int nilaiRataRata) {
        if(nilaiRataRata < 50) {
            return "E";
        } else if(nilaiRataRata >= 50 && nilaiRataRata < 60) {
            return "D";
        } else if(nilaiRataRata >= 60 && nilaiRataRata < 70) {
            return "C";
        } else if(nilaiRataRata >= 70 && nilaiRataRata < 85) {
            return "B";
        } else if(nilaiRataRata >= 85 && nilaiRataRata <= 100) {
            return "A";
        } else {
            return "gak tahu";
        }
    }
    
}