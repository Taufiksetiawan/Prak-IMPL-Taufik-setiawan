<?php
if ($_SERVER['REQUEST_METHOD'] == 'POST') {
    // Koneksi ke database
    $conn = new mysqli("localhost", "root", "", "pesanan");

    // Cek koneksi
    if ($conn->connect_error) {
        die("Koneksi gagal: " . $conn->connect_error);
    }

    // Ambil data dari form
    $judul = $_POST['judul'];
    $textPesan = $_POST['TextPesan'];

    // Query untuk mendapatkan idPenerima dan idPengirim terakhir yang dimasukkan
    $result = $conn->query("SELECT MAX(idPenerima) AS lastIdPenerima, MAX(idPengirim) AS lastIdPengirim FROM pesan");
    
    // Jika query berhasil
    if ($result) {
        $row = $result->fetch_assoc();
        // idPenerima dan idPengirim akan bertambah 1 dari nilai terakhir
        $idPenerima = $row['lastIdPenerima'] + 1;
        $idPengirim = $row['lastIdPengirim'] + 1;
    } else {
        // Jika tidak ada data sebelumnya, set nilai awal
        $idPenerima = 1;
        $idPengirim = 1;
    }

    // Query untuk menyimpan data
    $query = "INSERT INTO pesan (idPenerima, idPengirim, Judul, TextPesan) 
              VALUES ('$idPenerima', '$idPengirim', '$judul', '$textPesan')";

    if ($conn->query($query) === TRUE) {
        echo "Pesan berhasil disimpan!<br>";
        echo "<a href='tampilPesan.php'>Lihat Daftar Pesan</a>";
    } else {
        echo "Pesan gagal disimpan: " . $conn->error;
    }

    $conn->close();
} else {
    echo "Metode HTTP tidak diizinkan.";
}
?>
