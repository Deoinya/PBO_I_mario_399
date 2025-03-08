import  java.util.Scanner;

public class tugas {
    public  static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);
        String username;
        String nama;
        String password;
        String nim;
        System.out.println("pilih jenis login\n 1.admin\n 2.mahasiswa");
        System.out.print("masukkan pilihan: ");
        int pilihan = myScanner.nextInt();
        myScanner.nextLine();

        if (pilihan == 1){
            System.out.print("masukkan username: ");
            username= myScanner.next();
            System.out.print("masukkan password: ");
            password= myScanner.next();

            if (username.equals("mario") && password.equals("kamunanya")){
                System.out.print("login anda berhasil!");
            }else {
                System.out.print("login salah! username atau password anda salah.");
            }
        }else if (pilihan == 2){
            System.out.print("masukkan nama: ");
            nama= myScanner.next();
            System.out.print("masukkan nim: ");
            nim= myScanner.next();

            if (nama.equals("mario") && nim.equals("202410370110399")){
                System.out.print("login anda berhasil!");
            }else {
                System.out.print("login salah! nama atau nim anda salah");
            }
            myScanner.close();
        }
    }
}
