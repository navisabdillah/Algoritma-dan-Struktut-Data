#jawab Pertanyaan Pratikum 1
1. Fungsi dari angka 4 yaitu untuk menentukan ukuran dari stack yang akan dibuat, angka 4 berarti ukuran stack adalah 4, dan fungsi ini merujuk pada konstruktor pada class Stack.
2. Outputnya : 
<img src = '2.png'>
3. Dikarenakan pada tahap pertama stack telah terisi penuh dengan 4 elemen, lalu stack di-pop agar mengeluarkan elemen teratas, sehingga isi stack saat ini terisi 3 elemen dan 1 kosong, 17 dapat menempati kekosongan tersebut, sedangkan 98 tidak bisa karena isi stack sudah penuh, dan output menampilkan isi stack sudah penuh!
4. Jawaban pada Project minggu8 package minggu8 class ModifikasiStackMain.java
5. Karena pada program, variabel top digunakan untuk menentukan indeks dari data terbaru, dan ini menentukan data teratas pada stack, karena indeks stack dimulai dari 0, ketika data baru diinputkan, maka top akan ditambahkan dengan 1, begitu seterusnya.

#jawab Pertanyaan Pratikum 2
1. Pada mata kuliah teori Algoritma dan Struktur data, pada materi Stack ada penjelasan mengenai derajat operator matematika, penjelasan ini sesuai dengan fungsi presedence pada praktikum, yaitu menentukan operator yang mana terlebih dahulu yang harus di pop ke postfix
2. Hasilnya :
<img src = 'pratikum 2.png'>
3. Karena pada teorinya memang aturannya seperti itu, yaitu tanda kurung tidak dimasukkan ke postfix, pada kode program juga ditunjukkan aturan ini, program push operator kurung buka ('(') ke stack lalu ketika terdapat operator kurung tutup (')') semua stack di pop ke postfix dan operator kurung buka maupun kurung tutup diabaikan. Seperti yang ditunjukkan dalam baris kode program dibawah ini :
 <img src = '4.png'>
4. Hasilnya adalah program hanya akan menampilkan hasil postfix angka saja, seperti di bawah ini :
<img src = '5.png'>
Ini karena tanda @ dan # tidak memenuhi semua pengecekan apakah tanda tersebut bagian dari operand, atau operator, sehingga tanda ini tidak dipush ke stack ataupun postfix