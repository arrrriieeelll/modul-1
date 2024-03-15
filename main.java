import java.util.Scanner;
import javax.swing.plaf.synth.SynthScrollBarUI;


class masuk{ //class main untuk login user
            String user ;
            String pass ;
            String bacaNIM;
           
            
    Scanner key = new Scanner(System.in);


    void  menuStudent(){
        System.out.print("enter your nim (99 untuk keluar): ");
        bacaNIM = key.nextLine();

        int length = String.valueOf(bacaNIM).length();
        while(length != 15) {
            System.out.println("Nim max 15!!!");
            System.out.print("enter your nim (99 untuk keluar): ");
            bacaNIM = key.nextLine();
        }
    }
   void menuadmin(){ // method untuk login

            System.out.print("masukan user = ");
            user = key.nextLine();
            System.out.print("masukan password = ");
            pass = key.nextLine();

            if (user.equals("admin")){
                if(pass.equals("admin")){
                    System.out.println("------selamat datang-----");
                }else{
                    System.out.println("----user dan password salah");
                }
            }

        }
    
    
}


//class untuk membhuat input ouput dari peminjaman buku
class student{
    Scanner key = new Scanner(System.in);
    int books;
    int books2;
    String keluar;
    String buku1 = "cinta";
    String buku2 = "pantai";
    String buku3 = "samudra";

    
        //untuk membuat id buku
        String addressbuku1 = Integer.toHexString(System.identityHashCode(buku1));
        String addressbuku2 = Integer.toHexString(System.identityHashCode(buku2));
        String addressbuku3 = Integer.toHexString(System.identityHashCode(buku3));



       
    void peminjamanbook(){ 
        System.out.println("buku yang tersedia :");

        System.out.println("==================================================================================================");
        System.out.println("|| No.\t||\tid buku\t\t||Nama buku\t||Author\t||Category\t||\tStock\t||");
        System.out.println("==================================================================================================");
        System.out.println("|| 1. \t||\t"+addressbuku1+"\t||cinta\t\t||Author\t||cinta\t\t||\t5\t||");
        System.out.println("|| 2. \t||\t"+addressbuku2+"\t||pantai\t||Author\t||suasana\t||\t1\t||");
        System.out.println("|| 3. \t||\t"+addressbuku3+"\t||samudra\t||Author\t||healing\t||\t2\t||");
        System.out.println("==================================================================================================");
        
        System.out.print("\npilih buku yang ingin di pinjam : ");
        books = key.nextInt();
        System.out.println("\n");
        System.out.println("==== buku sudah berhasil di pinjam ====\n\n");

    }



   
    void displaybooks(){ 
        peminjamanbook();
        System.out.println("=====================");
        System.out.println("1. lihat buku");
        System.out.println("99. EXIT");
        System.out.println("=====================");
        System.out.print("pilih opsi diatas : ");
        books2 = key.nextInt();

        switch (books2) {
            case 1:
            switch (books) {
                case 1:
                    System.out.println("##################################################");
                    System.out.println("nama buku : "+buku1+ "\tid buku : " +addressbuku1);
                    System.out.println("##################################################");
                    System.out.println("\n\n\n");
                    break;
                case 2:
                    System.out.println("##################################################");
                    System.out.println("nama buku : "+buku2+ "\tid buku : " +addressbuku2);
                    System.out.println("##################################################");
                    System.out.println("\n\n\n");
                    break;
                case 3:
                    System.out.println("##################################################");
                    System.out.println("nama buku : "+buku3+ "\tid buku : " +addressbuku3);
                    System.out.println("##################################################");
                    System.out.println("\n\n\n");
                    break;
            }
            
                break;
            case 99:
                
                return;
        }
        
    }

}



//clas admin untuk meng input dan hasil output data diri 
class admin{
    Scanner key = new Scanner(System.in);
    String nama;
    String nim;
    String fakultas;
    String studi;


    //methon untuk meng innput data diri
    void addStudent(){
        System.out.print("add your name :");
        nama = key.nextLine();

        System.out.print("add your nim :");
        nim = key.nextLine();


        //untuk membatasi inputan nim
        int length = String.valueOf(nim).length();
        while(length != 15) {
            System.out.println("Nim max 15!!!");
            System.out.print("add your nim: ");
            nim = key.nextLine();
        }

        System.out.print("add your faculty :");
        fakultas = key.nextLine();

        System.out.print("add your studi :");
        studi = key.nextLine();  
    }


    //method tambhan
    void list(){
        System.out.println("list of registered student :");
    }


    //method untuk hasil dari input data diri
    void displayStudent(){
        list();
        System.out.println("nama : "+nama);
        System.out.println("nim : "+nim);
        System.out.println("faculty : "+fakultas);
        System.out.println("studi : "+studi);
    }

}
public class main {
    
    public static void main(String[] args){
        int input;
        Scanner key = new Scanner(System.in);
        String buku1 = "cinta";
        String buku2 = "pantai";
        String buku3 = "samudra";
        String addressbuku1 = Integer.toHexString(System.identityHashCode(buku1));
        String addressbuku2 = Integer.toHexString(System.identityHashCode(buku2));
        String addressbuku3 = Integer.toHexString(System.identityHashCode(buku3));        


        //perulangan do whiile
        do {
        System.out.println("==================================================================================================");
        System.out.println("|| No.\t||\tid buku\t\t||Nama buku\t||Author\t||Category\t||\tStock\t||");
        System.out.println("==================================================================================================");
        System.out.println("|| 1. \t||\t"+addressbuku1+"\t||cinta\t\t||Author\t||cinta\t\t||\t5\t||");
        System.out.println("|| 2. \t||\t"+addressbuku2+"\t||pantai\t||Author\t||suasana\t||\t1\t||");
        System.out.println("|| 3. \t||\t"+addressbuku3+"\t||samudra\t||Author\t||healing\t||\t2\t||");
        System.out.println("==================================================================================================");
        

        System.out.println("==== Student menu ====");
        System.out.println("1. pinjam buku dan lihat buku");
        System.out.println("2. pinjam buku atau log out");
        System.out.print("pilih opsi menu : ");
        input = key.nextInt();
        System.out.println("\n\n");
        //dari class di panggil di dalam public class
        student student1 = new student();
        
        switch (input) {
            case 1:
                student1.displaybooks(); // clas student dipanggil di dalam case displayybooks
                break;
            case 2:

            int library;
            System.out.println("==== librray System ====");
            System.out.println("1. login as student");
            System.out.println("2. login as admin");
            System.out.println("3. exit");
            System.out.print("pilih opsi menu : ");
            library = key.nextInt();
            masuk main1= new masuk();
            
            switch (library) {
                case 1:
                    main1.menuStudent();
                    break;
                case 2:
                    main1.menuadmin();
                    break;
                case 3:

                // menggunakan case di dalam case
                    System.out.println("==== admin menu ====");
                    System.out.println("1. add student");
                    System.out.println("2. display registered students");
                    System.out.println("3. exit");
                    System.out.print("choose option : ");
                    library = key.nextInt();

                    //dari class di panggil di dalam public class
                    admin admin1 = new admin();

                    switch (library) {
                        case 1:
                            admin1.addStudent(); //hasil clas admin dan menggunkan method addstudent
                            break;
                        case 2:
                            admin1.displayStudent(); //hasil clas admin dan menggunkan method displayystudent
                            break;
                        case 3:
                            System.out.println("loging out from admin acount");
                            return;
                    }
            }
        }
    }while (input != 3);
    }
}
