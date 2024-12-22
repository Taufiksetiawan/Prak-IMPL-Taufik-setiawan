<?php
// Koneksi ke database
$conn = new mysqli("localhost", "root", "", "pesanan");

// Cek koneksi
if ($conn->connect_error) {
    die("Koneksi gagal: " . $conn->connect_error);
}

// Proses hapus pesan
if (isset($_GET['hapus'])) {
    $idPesan = $_GET['hapus'];
    $queryHapus = "DELETE FROM pesan WHERE idPesan = $idPesan";

    if ($conn->query($queryHapus) === TRUE) {
        echo "Pesan berhasil dihapus!<br>";
    } else {
        echo "Pesan gagal dihapus: " . $conn->error;
    }
}

// Query untuk mengambil data pesan
$query = "SELECT * FROM pesan";
$result = $conn->query($query);

// Menampilkan daftar pesan
if ($result->num_rows > 0) {
    echo "<table border='1'>
            <tr>
                <th>ID Pesan</th>
                <th>ID Penerima</th>
                <th>ID pengirim</th>
                <th>Judul</th>
                <th>Text Pesan</th>
                <th>Aksi</th>
            </tr>";

    while ($row = $result->fetch_assoc()) {
        echo "<tr>
                <td>" . $row['idPesan'] . "</td>
                <td>" . $row['idPenerima'] . "</td>
                <td>" . $row['idPengirim'] . "</td>
                <td>" . $row['Judul'] . "</td>
                <td>" . $row['TextPesan'] . "</td>
                <td><a href='tampilPesan.php?hapus=" . $row['idPesan'] . "' onclick='return confirm(\"Yakin ingin menghapus pesan ini?\");'>Hapus</a></td>
              </tr>";
    }
    echo "<a href='Form_TambahPesan.php'>tambah pesan</a>";
    echo "</table>";
} else {
    echo "Tidak ada pesan.";
}

$conn->close();
?>
