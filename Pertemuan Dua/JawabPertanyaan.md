#jawaban 2.3.3
1. Karakteristik objek : 
- memiliki sesuatu data/karakter/properti/variable/state/field/atribut.
- Bias melakukan sesuatu tingkah laku/behavior/fungsi/method 
karakteristik class :
- Class merupakan template untuk membuat objek 
- Instansi proses pembuatan objek dari suatu class 
2. Untuk mendeklarasikan class adalah dengan menggunakan kunci dari objek yang digunakan. Seperti Barang Brng = new Barang(); Bisa juga dengan menggunakan keyword sepeti public class dll. 
3.  Ada 4 yaitu String namaBarang, jenisBarang; int stok, hargaSatuan; 
Deklarasi atribut dilakukan pada baris ke 4-5 
4. :Ada 4 : yaitu tampilBarang(), tambahStok(), kurangiStok(), dan hitungHargaTotal(); 
Method tampilBarang() pada baris ke 7-12 Method tambahStok() pada baris ke 13-15 Method kurangiStok() pada baris ke 16-18 Method hitungHargaTotal() pada baris ke 19-21. 
5. void kurangiStok(int n){
     if(stok > 0){
          stok = stok - n;
           } else {
                System.err.println("Maaf, stok anda kurang"); 
                }
                 } 
6.  Karena dalam method tersebut hanya membutuhkan nilai yang diambil n. n adalah bilangan integer. Nilai n digunakan untuk proses tambah stok.
7.  Karena method tersebut berfungsi mengembalikan nilai dari hasil perhitungan jumlah*hargaSatuan. Dan Hasil tersebut akan dikembalikan ke tempat dimana method tersebut dipanggil. 
8. Karena method tersebut tidak perlu mengembalikan nilai dari proses yang ada didalam method. 2

#jawaban 2.4.3
1. Prose instansiasi dilakukan pada baris ke-5. Nama objek yang dihasilkan adalah b1. 
2.Melakukan instansiasi terlebih dahulu , seperti dibawah ini:
 namaKelas namaObjek = new namaKelas(); 
 - Kemudian untuk mengakses atributnya, dengan menulis : namaObjek.namaAtribut = nilaiDariAtribut; 
 - Sedangkan untuk mengakses method, dengan manulis : namaObjek.namaMethod; 

#jawaban 2.5.3
1. Pada baris ke 7
2. dilakukan proses instansiasi atau proses mengkases objek dari kelas barang. 
3. Barang b3 = new Barang("polygon", "sepeda", 8000000, 64);
   b3.tampilBarang();

#jawaban 2.6.3
1. kode di atas akan membuat ppArray yang dapat menampung 3 objek persegi Panjang tetapi array tersebut masih kosong 
2. kode tersebut untuk membuat objek pada array persegi Panjang Menerima Input Isian Array Menggunakan Looping 

#jawaban 2.7.3
1. Karena objek pada atribut tersebut belum dibuat dan masih kosong

#jawaban 2.8.3
1. Method khusus yang akan dijalankan secara otomatis pada saat sebuah objek dibuat (instansiasi), yakni ketika perintah “new” dijalankan 
2. public static void main(String[] args) {
    Segitiga[] sgArray = new Segitiga [15];
}
3. public Segitiga(int a, int t){
        alas = a;
        tinggi = t;
    }
4.     public double hitungLuas(){
        return 0.5 * alas * tinggi;
    }
    public double hitungKeliling(){
        double hasil = Math.sqrt(Math.pow(alas,2) + Math.pow(tinggi,2));
        return hasil + alas + tinggi;
    }
5. public class ArraySegitiga {
    public static void main(String[] args) {
    Segitiga[] sgArray = new Segitiga [10];
    
        sgArray[0] = new Segitiga(10, 4);
        sgArray[1] = new Segitiga(20, 10);
        sgArray[2] = new Segitiga(15, 6);
        sgArray[3] = new Segitiga(25, 10);
        
for (int i = 0; i < 4; i++){
    System.out.println("Luas Segitiga ke-" +i+ ": " + sgArray[i].hitungLuas());
    System.out.println("Keliling segitiga ke-" +i+": " + sgArray[i].hitungKeliling());
}
    }
}
 
