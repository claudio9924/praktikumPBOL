import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Challenge{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Map<String, Integer> listMahasiswa = new HashMap<>();
        int pilihan = 0;
        while (pilihan != 5) {
            System.out.println("1. Tambah mahasiswa");
            System.out.println("2. Daftar mahasiswa");
            System.out.println("3. Update mahasiswa");
            System.out.println("4. DO mahasiswa");
            System.out.println("5. Exit");
            System.out.println("Apa yang ingin anda lakukan? Pilih :");
            pilihan = scanner.nextInt();
            scanner.nextLine();
                
            switch(pilihan){
                case 1:
                    System.out.print("Nama mahasiswa : ");
                    String mahasiswa = scanner.nextLine();
                    System.out.print("NIM : ");
                    Integer nim = scanner.nextInt();
                    listMahasiswa.put(mahasiswa, nim);
                break;
                
                case 2:
                    for(Map.Entry<String, Integer> data : listMahasiswa.entrySet())
                    {
                        System.out.println("Nama : " + data.getKey() + "\t" + "NIM : " + data.getValue());
                    }
                break;

                case 3:
                    System.out.println("NIM siapa yang ingin diubah?");
                    String namaupdate = scanner.nextLine();
                    if(listMahasiswa.get(namaupdate)==null){
                        System.out.println("Nama mahasiswa tidak ditemukan");
                    } else{
                        System.out.println("Masukkan NIM baru :");
                        Integer nimbaru = scanner.nextInt();
                        listMahasiswa.put(namaupdate, nimbaru);
                    }
                    
                break;

                case 4:
                    System.out.println("Siapa nama mahasiswa yang ingin di DO?");
                    String namado = scanner.nextLine();
                    listMahasiswa.remove(namado);
                break;
            }
        }
    }
}