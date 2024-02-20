import java.util.Scanner;
import java.util.Calendar;

public class perkenalan{
    public static void main(String[] arg){
    String nama;
    char kelamin;
    int tanggal,bulan,tahun, umur, hasilbulan;
    int tahunsekarang = 2023;
    int bulanlahir = 12;

    Scanner keyboard = new Scanner(System.in);

    System.out.println("\n      inputkan");
    System.out.println("===================\n");

    //proses input data
    System.out.print("NAMA : ");
    nama = keyboard.nextLine();
    
        System.out.print("JENIS KELAMIN (L/P) : ");
        kelamin = keyboard.next().charAt(0);


    //tahun lahir

    Calendar kalender = Calendar.getInstance();

    System.out.print("\nmasukan tanggal lahir : ");
    tanggal = keyboard.nextInt();

    System.out.print("masukan bulan lahir : ");
    bulan = keyboard.nextInt();

    System.out.print("masukan tahun lahir : ");
    tahun = keyboard.nextInt();

    System.out.println("tanggal lahir (dd-mm-yyyy) : "+tanggal+"-"+bulan+"-"+tahun);

    //rumus
    umur = tahunsekarang - tahun;
    hasilbulan = bulanlahir - bulan;
        //hasil output
        System.out.println("\n      output");
        System.out.println("===================\n");
        System.out.println("Nama :"+nama);
        if (kelamin == 'L'){
            System.out.println("gender kamu : laki - laki");
        }
        else if(kelamin == 'P'){
            System.out.println("gender  kamu : perempuan");
        }
        else {
            System.out.println("hanya bisa (P/L)!!!");
        }
        System.out.println("umur anda :"+umur+" tahun "+hasilbulan+" bulan");

    }

}