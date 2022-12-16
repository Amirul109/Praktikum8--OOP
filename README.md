# Praktikum8--OOP

* Nama  : Amirul Mu'minin
* Kelas : Ti.21.C2
* Nim   : 312110109
* Matkul : Pemrograman Berorientasi Object

# Pertemuan ke-12 (Ordering barang) #

Penjelasan Program:
Program diatas menampilkan harga, sub_total dan total bayar menggunakan format rupiah sehingga kita membutuhkan class number format ada dua class yang kita import dari package java.text yaitu DecimalFormat dan DecimalFormatSymbols selain itu kita juga menginport kelas scanner agar program dapat menerima inputan keyboard saat program dijalankan.

![d](https://user-images.githubusercontent.com/116171779/208020732-c401d506-201d-470d-977a-ac2812948ac5.png)


Pada bagian awal sintak di dalam fungsi main() kita melakukan inisialisasi objek input yang mengacu pada kelas scanner, objek kursIndonesia dari kelas DecimalFormat dan formatRp dari kelas DecimalFormatSymbols.
Pada bagian berikut kita mendelarasikan variabel-variabel yang dibutuhkan baik variabel biasa maupun dengan menggunakan array (larik). Variabel jum dan i dengan tipe integer dan total_bayar dengan tipe double masing masing memiliki nilai awal 0. Untuk array nama barang bertipe string (karakter), kode, harga dan qty bertipe integer (bilangan bulat) sedangkan sub_total dan diskon menggunakan tipe double karena memuat nilai pecahan masing-masing array kita inisialisasi dengan jumlah indeks sebanyak 6 (dari 0 sampai 5).

![case](https://user-images.githubusercontent.com/116171779/208020601-c7eb33d3-0b20-4911-a692-ddf0a6bc8056.png)


Pengguna akan memasukan jumlah beli dan nilainya akan di masukan ke variabel jum, nantinya nilai jumlah beli akan menjadi batas perulangan. Saat perulangan berjalan pengguna harus memasukan kode barang sesuai dengan daftar barang yang kita definisikan yaitu dari 1 sampai 5. Kode barang tersebut akan dibandingkan dengan case yang terdapat dalam struktur switch case. apabila salah satu case ada yang cocok/sama maka pernyataan di dalam case itu yang akan di eksekusi. Didalam setiap case kita definisikan nama barang, harga dan diskonnya. Jika tidak ada case yang cocok maka pernyataan default yang akan di eksekusi dengan menampilkan kalimat ‘Kode Barang Tidak Tersedia’ .

Berikutnya kita mengatur untuk format number untuk menampilkan format rupiah pada harga barang, sub_total dan total bayar. Format yang diatur berupa simbol rupiah, pemisahan dengan nilai desimal menggunakan tanda , ‘koma’ dan penyataan ribuan dengan tanda . ‘titik’.

Pada bagian akhir kita membuat perulangan for yang kedua untuk menampilkan seluruh elemen di dalam array berdasarkan jumlah beli, kode barang yang dimasukan serta qty untuk masing-masing item barang.

Program akan menampilkan perhitungan sub total berdasarkan harga barang dikali qty di kurangi dengan diskon yang didapat untuk setiap item barang tersebut.

Pada bagian akhir program penjualan barang menampilkan total yang harus dibayar berdarkan penjumlahan seluruh sub total masing-masing barang yang telah dibeli.

Output Program:

![output8-1](https://user-images.githubusercontent.com/116171779/208019840-26028b8d-b035-4ab5-ba8d-b10d984db1b6.png)

![output8](https://user-images.githubusercontent.com/116171779/208019798-8334e564-e99d-4835-bb3f-a8575b0d4821.png)
