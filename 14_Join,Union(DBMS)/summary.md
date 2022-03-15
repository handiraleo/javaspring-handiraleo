Materi – Join, Union, Agregasi, Subquery, Function (DBMS)

- mempelajari satu persatu dimateri
- cara pengaplikasiannya

1. JOIN
   sebuah query untuk menggambungkan data tabel 1 dengan yang lainnya minimal 2

- INNER JOIN (irisan)
- LEFT JOIN
- RIGHT JOIN

2. UNION
   menggambungkan data 1 dengan data ke 2 tetapi bentuknya kebawah sehingga terdapat beberapa syarat :

- kolom tiap tabel harus sama
- tipe data harus sama

3. AGREGASI
   Fungsinya untuk membentuk nilai ringkasan tunggal
   -MIN
   -MAX
   -SUM

- AVG
- COUNT
- HAVING

4. SUBQUERY
   Untuk mengembalikan data yang akan digunakan query utama sebagai syarat utama untuk dapat membatasi data yang akan di ambil.
   Adapa beberapa syarat

- haru tertutup dalam tanda kurung
- subquery hanya dapat memiliki satu kolom pada klausa SELECT, keculai beberapa kolom di query utama
- subquery yang kembali lebih dari satu baris hanya dapat digunakan dengan beberapa value operator
- Daftar SELECT tidak bisa menetarakan referensi ke nilai-nilai yang mengevaluasi
- Sebuah subquery tidak dapat segera tertutup dalam fungsi set

5. FUNGCTION
   sebuah kumpulan statement yang akan mengembalikan sebuah nilai balik pada pemanggilnya.
